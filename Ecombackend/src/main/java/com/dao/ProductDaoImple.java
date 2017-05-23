package com.dao;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import javax.transaction.Transactional;
import javax.servlet.http.HttpServletRequest;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import com.models.*;
@Repository
public class ProductDaoImple implements ProductDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public void addProduct(Product p)
	{
		Session session=sessionFactory.openSession();
		session.save(p);
		session.close();
		
	}
    
	@Override
	@Transactional
	public void updateProduct(Product p) {
		Session session=sessionFactory.openSession();
	    session.update(p);
	    session.flush();
	    session.close();
		
	}
	
    @Transactional
    @SuppressWarnings("unchecked")
	public List<Product> getAllProduct() {
		Session session = sessionFactory.openSession();
		
		List<Product> pList = session.createQuery("from Product").list();
		session.close();
		return pList;
	}
    
    @SuppressWarnings("deprecation")
	public void storeFile(Product p, HttpServletRequest request)
	{
		System.out.println(request.getRealPath("/"));
		 String path=request.getRealPath("/")+"\\resources\\image\\"+p.getCategory()+"\\"+p.getImage();
		 System.out.println(path);
		MultipartFile file= p.getFile();
	
		if (!file.isEmpty()) {
			
		try{
		byte[] bytes =file.getBytes();
		System.out.println(file.getOriginalFilename());
		File serverFile = new File(path);
		serverFile.createNewFile();
	
		BufferedOutputStream stream = new BufferedOutputStream(
				new FileOutputStream(serverFile));
		stream.write(bytes);
		stream.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
			
	}
	}
    @Transactional
	@Override
	public void removeProduct(int id) {
	      Session session = sessionFactory.openSession();
			
			Product p = (Product) session.get(Product.class, new Integer(id));
			System.out.println(p.getName());
			if(p!=null){
				session.delete(p);
			}
			session.flush();
			session.close();
		
	}

	@Override
	public Product getById(int id) {
		Session session=sessionFactory.openSession();
		Product p=(Product) session.get(Product.class, new Integer(id));
		session.close();
		return p;
	}
	
}
