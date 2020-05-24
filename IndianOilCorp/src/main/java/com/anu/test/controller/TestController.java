package com.anu.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.anu.test.beans.UserData;

@Controller
public class TestController {
	
	@RequestMapping("/")
	public String getHello()
	{
		System.out.println("inside getHello");
		return "index";
	}
	
	@GetMapping ("/welcome")
	public ModelAndView save(@ModelAttribute UserData user){ 
		System.out.println("inside save");
        ModelAndView modelAndView = new ModelAndView();  
modelAndView.setViewName("welcome");      
modelAndView.addObject("user", user);    
return modelAndView;  
    }  

}
