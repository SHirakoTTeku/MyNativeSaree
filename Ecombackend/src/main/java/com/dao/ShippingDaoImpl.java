package com.dao;
import java.io.Serializable;
import java.security.Principal;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.models.Customer;
import com.models.ShippingAddress;
import com.models.User;


@Repository
public class ShippingDaoImpl implements ShippingDao,Serializable {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public void addShippingAddress(ShippingAddress add, Principal p)
	{
	  Session	session =sessionFactory.openSession();
	
	  
	  Query query = session.createQuery("from User where userName = ?");
      query.setString(0, p.getName());

      User u= (User) query.uniqueResult();
      Customer c = u.getCust();
     
      c.setShippingAddress(add);
      add.setUsersDetail(c);
      session.save(add);
      session.update(c);
      session.close();

	}

}
