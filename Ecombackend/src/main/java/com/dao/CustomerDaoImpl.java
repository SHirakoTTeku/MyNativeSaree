package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.Transaction;

import com.models.Cart;
import com.models.Customer;
import com.models.User;
import com.models.UserRole;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public void addcustomer(User u) {
			Session session = sessionFactory.openSession();
			Cart c = new Cart();
			c.setGrandtotal(0);
			c.setUserDetails(u.getCust());
			session.save(c);
			Customer cust = u.getCust();
			cust.setCart(c);
			
			session.save(u.getCust());
			u.setEnable(true);
			session.save(u);
		
			UserRole ur = new UserRole();
			ur.setAuthority("ROLE_USER");
			ur.setCust(u.getCust());
			session.save(ur);
			
			session.close();
		
	}

	@Override
	public Customer getCustomerById(int id) {
		Session session=sessionFactory.openSession();
		Customer p = (Customer) session.load(Customer.class, new Integer(id));
		session.close();
		return p;
	}

	@Override
	public List<Customer> getAllUsers() {
		 Session session = sessionFactory.openSession();
	        Query query = session.createQuery("from Customer");
	        @SuppressWarnings("unchecked")
			List<Customer> usersDetail = query.list();

	        return usersDetail;
	}

	@Override
	public Customer getUserByUsername(String username) {
		 Session session = sessionFactory.openSession();
	        
	        Query query = session.createQuery("from User where userName = ?");
	        query.setString(0, username);
	        User u = (User)query.uniqueResult();
	        return u.getCust();
	    }
}
