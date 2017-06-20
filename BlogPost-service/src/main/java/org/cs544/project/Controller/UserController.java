package org.cs544.project.Controller;

import org.cs544.project.domain.User;
import org.cs544.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
	 @Autowired
	    private UserService userService;
	  
	 @RequestMapping(value = "/registration", method = RequestMethod.POST)
	    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model) {

	        if (bindingResult.hasErrors()) {
	            return "registration";
	        }
	        userService.saveUser(userForm);
	        return "redirect:/welcome";
	    }
}
