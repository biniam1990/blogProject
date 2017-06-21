package org.cs544.project.controller;

import org.cs544.project.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping(value= "/login", method = RequestMethod.GET)
	public ModelAndView login(){
		ModelAndView model = new ModelAndView();
		model.setViewName("login");
		return model;
	}
	@RequestMapping(value="/registration", method = RequestMethod.GET)
	public ModelAndView registration(){
		ModelAndView model = new ModelAndView();
		User user = new User();
		model.addObject("user", user);
		model.setViewName("registration");
		return model;
	}
	@RequestMapping(value={"/", "/posts"}, method = RequestMethod.GET)
	public ModelAndView posts(){
		ModelAndView model = new ModelAndView();
		model.setViewName("posts");
		return model;
	}
}
