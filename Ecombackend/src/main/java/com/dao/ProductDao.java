package com.dao;
import com.models.Product;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

public interface ProductDao {
	
   public	List<Product>getAllProduct();
   
   public Product getById(int id);
   public void addProduct(Product p);
   public void updateProduct(Product p);
   public void removeProduct(int id);
   public void storeFile(Product p, HttpServletRequest request);
}
