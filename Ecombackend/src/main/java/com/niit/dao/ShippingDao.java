package com.niit.dao;

import java.security.Principal;

import com.niit.models.ShippingAddress;

public interface ShippingDao {

	void addShippingAddress(ShippingAddress add, Principal p);
}



