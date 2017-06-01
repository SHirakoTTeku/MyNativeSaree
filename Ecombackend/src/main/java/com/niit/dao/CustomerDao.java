package com.niit.dao;

import java.util.List;

import com.niit.models.Customer;
import com.niit.models.User;

public interface CustomerDao {
	void addcustomer(User u);
	public Customer getCustomerById(int id);
	 public List<Customer> getAllUsers();
	 public Customer getUserByUsername (String username);
	 

}
