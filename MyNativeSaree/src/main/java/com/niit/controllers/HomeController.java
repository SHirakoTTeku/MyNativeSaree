package com.niit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
	
@RequestMapping(value={"/","/MyNativeSaree"})
public String index(){
	return "index";
}
@RequestMapping(value="/home")
public String home(){
	return "home";
}
@RequestMapping(value="/aboutus")
public String aboutus(){
	return "aboutus";
}
@RequestMapping(value="/contactus")
public String contactus(){
	return "contactus";
}
@RequestMapping(value="/index")
public String Native(){
	return "index";
}
@RequestMapping(value="/login")
public String login(){
	return "login";
}
@RequestMapping(value="/registrationpage")
public String register(){
	return "registrationpage";
}
}

