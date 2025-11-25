package com.mvcexception.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/admin")
public class HomeController {
	
	@RequestMapping("/")
	public String getIndex(){
		int x=Integer.parseInt("ten");		
		System.out.println(0/0);
		String s=null;
		System.out.println(s.length());
		return "index";
	}
	
	
	
	@RequestMapping(path="/register")
	public String getRegister(){
		return "register";
	}
	
	
	
	
}
