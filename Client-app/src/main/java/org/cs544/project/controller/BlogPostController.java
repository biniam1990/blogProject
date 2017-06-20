package org.cs544.project.controller;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;

import javax.annotation.Resource;

import org.cs544.project.domain.BlogPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

@Controller
public class BlogPostController {
     private String serviceUrl= "http://localhost:8080/";
	@Resource
	private RestTemplate restTemplate;
	
	@GetMapping("/posts")
	public String displayPosts(Model model){
		ResponseEntity<BlogPost[]> posts= restTemplate.getForEntity(serviceUrl+"posts", 
				BlogPost[].class);
	   model.addAttribute("posts",posts);
		return "posts";
	}
	
	@GetMapping("/posts/{postId}")
	public String displayPost (Model model, @PathVariable int postId){
		BlogPost post = restTemplate.getForObject(serviceUrl+postId, BlogPost.class);
		model.addAttribute("post", post);
		return "commentPage";
	}

   @PostMapping(value="{userId}/posts")
	public String addPost(@RequestBody BlogPost post, @PathVariable int userId){
	   System.out.println(userId);
	 //  restTemplate.postForLocation(url, request, uriVariables)
		restTemplate.postForLocation("http://localhost:8080/"+userId+"/posts", post);
		return "redirect:/posts";
	}

}
