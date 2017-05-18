package com.dao;

import com.models.Cart;

public interface CartDao {
	void addCart(Cart c);
	void updateCart(Cart c);
	void deleteCart(Cart c);
	void getCartById(int cartId);
	}