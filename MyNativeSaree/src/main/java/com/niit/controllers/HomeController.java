package com.niit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

import com.niit.models.Product;
import com.niit.services.ProductServices;


@Controller
public class HomeController {
	@Autowired
	ProductServices productservices;
	
@RequestMapping(value={"/","/MyNativeSaree/"})
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
@RequestMapping(value="/registrationpage")
public String register(){
	return "registrationpage";
}
@RequestMapping (value={"/product", "/admin/product"})

public @ResponseBody List<Product> getAllData()
{
	List<Product> productList= productservices.getAllProduct();
	
	return productList;
}
@RequestMapping(value="/disp")
public ModelAndView display(@RequestParam(name="id") String prdid){
	  int pid =Integer.parseInt(prdid);
	  Product p =productservices.getById(pid);
	  ModelAndView mv = new ModelAndView("displayProduct","product",p);
	  return mv;
	  
}
@RequestMapping(value="/viewAll")
public String View_All()
{
	return "viewAll";
}
}


