package org.cs544.project.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.cs544.project.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {
	 private String serviceUrl= "http://localhost:8080/";
		@Resource
		private RestTemplate restTemplate;
		
//	@RequestMapping(value= "/login", method = RequestMethod.GET)
//	public ModelAndView login(){
//		ModelAndView model = new ModelAndView();
//		model.setViewName("login");
//		return model;
//	}
//	@RequestMapping(value="/registration", method = RequestMethod.GET)
//	public ModelAndView registration(){
//		ModelAndView model = new ModelAndView();
//		User user = new User();
//		model.addObject("user", user);
//		model.setViewName("registration");
//		return model;
//	}
	
	@PostMapping("/registration")
	public String addUser(String name, String username, String password){
		User user = new User(name, username, password);
		System.out.println(user.getName());
		restTemplate.postForLocation(serviceUrl+"registration", user);
		
		return "redirect:/posts";
	}
	
	@PostMapping("/loginn")
	public String checkUser(String username,String password, HttpServletRequest request,RedirectAttributes attr){
      System.out.println("checking login");
		User user = (User)restTemplate.getForObject(serviceUrl+"login?username="+username+"&password="+password,User.class);
		if(user==null){
			String message = "wrong username/password";
			attr.addFlashAttribute(message);
			return "redirect:/posts";
		}
		else{
			System.out.println("login "+user.getUsername());
			request.getSession().setAttribute("user", user);
			return "redirect:/posts";
		}
		
		
	}
	
	@GetMapping("/loginn")
	public String loginPage(){
		
		return "LoginPage";
		
	}
	@GetMapping("/error")
	public String errorPage(){
		return "error";
	}
	
	@GetMapping("/logout")
	public String logoutPage(HttpServletRequest request){
		request.getSession().invalidate();
		return "redirect:/login";
	}
//	@RequestMapping(value={"/", "/posts"}, method = RequestMethod.GET)
//	public ModelAndView posts(){
//		ModelAndView model = new ModelAndView();
//		model.setViewName("posts");
//		return model;
//	}
}
