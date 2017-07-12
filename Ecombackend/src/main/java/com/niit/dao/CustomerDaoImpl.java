package com.niit.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.models.Cart;
import com.niit.models.Customer;
import com.niit.models.User;
import com.niit.models.UserRole;

import org.hibernate.Transaction;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public void addcustomer(User u) {
			Session session = sessionFactory.openSession();
			Cart c = new Cart();
			c.setGrandtotal(0);
			c.setUserDetails(u.getCust());
			
			session.save(c);
			Customer cust = u.getCust();
			cust.setCart(c);
			cust.setLastLoginDate(new java.sql.Date(System.currentTimeMillis()));
			
			session.save(u.getCust());
			u.setEnable(true);
			session.save(u);
		
			UserRole ur = new UserRole();
			ur.setAuthority("ROLE_USER");
			ur.setCust(u.getCust());
			session.save(ur);
			
			c.setUserDetails(cust);
			session.update(c);
			session.save(c);
			
			session.close();
		
	}

	public Customer getCustomerById(int id) {
		Session session=sessionFactory.openSession();
		Customer p = (Customer) session.load(Customer.class, new Integer(id));
		session.close();
		return p;
	}


	public List<Customer> getAllUsers() {
		 Session session = sessionFactory.openSession();
	        Query query = session.createQuery("from Customer");
	        @SuppressWarnings("unchecked")
			List<Customer> usersDetail = query.list();

	        return usersDetail;
	}


	public Customer getUserByUsername(String username) {
		 Session session = sessionFactory.openSession();
	        
	        Query query = session.createQuery("from User where userName = ?");
	        query.setString(0, username);
	        User u = (User)query.uniqueResult();
	        return u.getCust();
	    }
}
