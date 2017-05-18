package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	
	@RequestMapping(value="/admin")
	public String adminhome(){
		return "Admin/Adminhome";
	}
	@RequestMapping(value="/addproduct")
	public String addproduct(){
		return "Admin/addproduct";
	}
	@RequestMapping(value="/addcategory")
	public String addcategory(){
		return "Admin/addcategory";
	}
	@RequestMapping(value="/addsupplier")
	public String addsupplier(){
		return "Admin/addsupplier";
	}
	@RequestMapping(value="/adminbar")
	public String adminbar(){
		return "Admin/adminbar";
	}
}
