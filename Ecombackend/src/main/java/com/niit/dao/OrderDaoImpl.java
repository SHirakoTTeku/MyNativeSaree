package com.niit.dao;

import java.io.Serializable;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.models.Order;

@Repository
public class OrderDaoImpl implements OrderDao,Serializable {

	@Autowired
	SessionFactory sessionFactory;
	@Transactional
	public void addOrder(Order o) {
		Session session=sessionFactory.openSession();
		session.saveOrUpdate(o);
		session.flush();
		session.close();
		
		
	}

}
