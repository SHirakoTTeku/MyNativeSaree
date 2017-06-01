package com.niit.dao;

import java.io.IOException;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.models.Cart;

@Repository
public class CartDaoImpl implements CartDao {

	@Autowired
    SessionFactory sessionFactory;
	
	
	@Transactional
	public void addCart(Cart c) {
		Session session= sessionFactory.openSession();
		session.save(c);
		session.close();
		
		
	}

	
	@Transactional
	public void updateCart(Cart c) {
		Session session=sessionFactory.openSession();
		session.saveOrUpdate(c);
		session.flush();
		session.close();
	}

	@Transactional
	public void deleteCart(Cart c) {
		Session session= sessionFactory.openSession();
		if(c!=null){
		session.delete(c);
		}
		session.flush();
		session.close();
				
	}
	
	public Cart getCartById(int cartId) {
		Session session = sessionFactory.openSession();
        return (Cart) session.get(Cart.class, cartId);
    
	}

}
