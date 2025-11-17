package com.mvcormdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvcormdata.entity.Login;
import com.mvcormdata.repository.LoginRepository;
import com.mvcormdata.service.LoginService;

@Controller
public class LoginController {
	
	//Controller 
	@Autowired
	private LoginService  loginService;
	
	
	@RequestMapping(path="/login")
	public String getLogin(){
		return "login";
	}
	@RequestMapping(path="/")
	public String getIndex(){
		return "index";
	}
	
	
	@RequestMapping(path="/loginSuccess",method=RequestMethod.POST)
	public String getLoginSucess(
			@ModelAttribute Login login,Model model
			){
		this.loginService.savaLoginDetails(login);
		List<Login> listOfLogin = this.loginService.getLoginCredentialDetails();
		model.addAttribute("loginDetails",listOfLogin);
		return "loginSuccess";
	}
}
