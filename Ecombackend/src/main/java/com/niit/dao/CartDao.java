package com.niit.dao;

import com.niit.models.Cart;

public interface CartDao {
	void addCart(Cart c);
	void updateCart(Cart c);
	void deleteCart(Cart c);
	public Cart getCartById(int cartId);
	}