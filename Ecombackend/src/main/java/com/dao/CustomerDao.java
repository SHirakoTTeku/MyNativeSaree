package com.dao;

import java.util.List;

import com.models.Customer;
import com.models.User;

public interface CustomerDao {
	void addcustomer(User u);
	public Customer getCustomerById(int id);
	 public List<Customer> getAllUsers();
	 public Customer getUserByUsername (String username);
	 

}
