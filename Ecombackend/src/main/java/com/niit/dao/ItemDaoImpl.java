package com.niit.dao;

import java.util.List;


import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.models.Cart;
import com.niit.models.Item;

@Repository
public class ItemDaoImpl implements ItemDao {

	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	public void addItem(Item i) {
		Session session=sessionFactory.openSession();
		session.save(i);
		session.close();
		
	}

	@Transactional
	public void editItem(Item i) {
	 Session session=sessionFactory.openSession();
	 session.saveOrUpdate(i);
	 session.flush();
	 session.close();
	}


	@Transactional
	public void deleteItem(Item i) {
		System.out.println("del.......");
		Session session= sessionFactory.openSession();
		if(i!=null)
		{
			session.delete(i);
		}
		session.flush();
		session.close();
		
	}

	@SuppressWarnings("unchecked")
	public List<Item> listitem(int itemId) {
		Session session=sessionFactory.openSession();
		List<Item> iList=session.createQuery("from Item").list();
		session.close();
		return iList;

	}

	public void removeAllCartItems(Cart cart) {
		 {
		        List<Item> cartItems = cart.getItem();

		        for (Item item : cartItems) {
		            deleteItem(item);
		        }
		    }
		
	}


	public Item getCartItemByItemId(int itemId) {
	        Session session = sessionFactory.openSession();
	        Item item =(Item)session.get(Item.class, itemId);
	        System.out.println(item);
	    //    System.out.println("retriving product...."+item.getProduct().getName());
	        session.close();
	        return item;
	    }

	}
	
