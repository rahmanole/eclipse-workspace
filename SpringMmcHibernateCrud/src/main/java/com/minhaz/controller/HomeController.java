package com.minhaz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.minhaz.model.User;
import com.minhaz.services.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public String home(Model model,@ModelAttribute User user) {
		model.addAttribute(user);
		return "home";
	}
	
	@RequestMapping(value="/formSubmit",method = RequestMethod.POST)
	public String formSubmit(@ModelAttribute User user) {
		userService.save(user);
		return "feedBack";
	}
}
