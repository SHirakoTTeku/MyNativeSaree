package com.niit.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.models.Product;
import com.niit.services.ProductServices;

@Controller
public class ProductController {

	@Autowired
	private ProductServices service;
	

	@RequestMapping(value="/Admin/addp/add", method = RequestMethod.GET)
	public ModelAndView addproduct(){
		Product p=new Product();
		return new ModelAndView("Admin/addp/addproduct", "product", p);
	}
	
	@RequestMapping(value = "/Admin/addp/add", method = RequestMethod.POST)
	public ModelAndView ActionPage(HttpServletRequest request,@ModelAttribute("product")@Validated Product p, BindingResult result,Model m){
		System.out.println("Adding "+p);
		System.out.println(p.getCategory());
		if(result.hasErrors()){
			System.out.println("Error: "+result.getAllErrors());
			return new ModelAndView("Admin/addp/addproduct");
		}else {
			p.setImage(p.getFile().getOriginalFilename());
			service.storeFile(p, request);
			service.addProduct(p);
			return new ModelAndView("Admin/addp/addproduct","msg","Product Added!");
		}
		
	}

	@RequestMapping(value="/Admin/deletp/delete",method= RequestMethod.GET)
	public ModelAndView DeletePage(){
		Product p=new Product();
		return new ModelAndView("Admin/deletep/deleteproduct", "product", p);
	}
	
	@RequestMapping(value="/Admin/deletep/delete",method= RequestMethod.POST)
	public ModelAndView DeleteAction(@RequestParam("id")int id){
		System.out.println("ID for Deletion"+id);
		service.removeProduct(id);
		return new ModelAndView("View_All","msg","Product Deleted!");
		
	}
	
	
	@RequestMapping(value="/Admin/updatep/edit", method= RequestMethod.GET)
	public ModelAndView EditPage(@RequestParam("id")int id){
		Product p=service.getById(id);
		
		return new ModelAndView("/Admin/updatep/updateproduct","product",p);
		
	}
	
	@RequestMapping(value="/Admin/updatep/edit", method= RequestMethod.POST)
	public ModelAndView EditAction(HttpServletRequest request,@ModelAttribute("product") @Validated Product p, BindingResult result,Model model){
		
		if(result.hasErrors()){
			return new ModelAndView("Admin/updatep/updateproduct");
		}else{
			System.out.println(p.getImage());
			if(!(p.getFile().isEmpty())){
				p.setImage(p.getFile().getOriginalFilename());
				service.storeFile(p, request);
			}
			service.udateProduct(p);
				return new ModelAndView("View_All","msg","Product Updated!");
			}
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
