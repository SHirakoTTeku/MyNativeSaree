package com.niit.services;
import com.niit.dao.*;
import com.niit.models.*;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;;

@Service
public class ProductServices {

	@Autowired
	ProductDao productdao=new ProductDaoImple();
	
	public List<Product>getAllProduct()
	{
		return productdao.getAllProduct();
	}

	public Product getById(int id)
	{
		return productdao.getById(id);
	}
	public void addProduct(Product p)
	{
		productdao.addProduct(p);
	}
	public void udateProduct(Product p)
	{
		productdao.updateProduct(p);
	}
	public void removeProduct(int id)
	{
		productdao.removeProduct(id);
	}
	public void storeFile(Product p,HttpServletRequest request)
	{
		productdao.storeFile(p, request);
	}
}

