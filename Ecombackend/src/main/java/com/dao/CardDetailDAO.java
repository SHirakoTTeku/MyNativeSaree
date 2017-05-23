package com.dao;

import java.io.Serializable;
import java.security.Principal;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.models.CardDetails;
import com.models.Cart;
import com.models.Customer;
import com.models.Item;
import com.models.Order;
import com.models.Product;
import com.models.User;
import myException.QtyNotAvaiable;

import myException.*;

@Repository
public class CardDetailDAO implements Serializable{
	
	@Autowired
	 private SessionFactory sessionFactory;
	
	public void addCardDetail(CardDetails cardDetail, Principal p) throws QtyNotAvaiable{
	Session session= sessionFactory.openSession();
	Transaction tx=session.beginTransaction();
	System.out.println("Checking Out");
	Query query=session.createQuery("from User where userName = ?");
	query.setString(0, p.getName());
	User u= (User) query.uniqueResult();
	Customer c= u.getCust();
    cardDetail.setUsersDetail(c);
    cardDetail.setCart(c.getCart());
    session.saveOrUpdate(cardDetail);
    Order co = new Order();
    co.setUserDetails(c);	      
    c.setCart(c.getCart());
    session.save(co);
    List<Item> item = c.getCart().getItem();
    for(Item x: item){
    	Product prd = x.getProduct();
    
    	System.out.println(prd.getName());
    	int qty = prd.getQty();
    	qty = qty- x.getQunitity();
    	
    	if(qty>=0){
    	prd.setQty(qty);
    	
    	session.saveOrUpdate(prd);
    	}
    	
    	else{
    		throw new QtyNotAvaiable("Order is out of stock");
    	}
    }
    
    tx.commit();
    session.flush();
    session.close();
}
}
