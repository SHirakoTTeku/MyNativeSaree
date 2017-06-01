package com.niit.services;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dao.CartDao;
import com.niit.dao.CartDaoImpl;
import com.niit.models.Cart;
@Service
public class CartService implements Serializable {

	  @Autowired
	    private CartDao cartDao;

	    public Cart getCartById(int cartId) {
	        return cartDao.getCartById(cartId);
	    }

	    public void update(Cart cart) {
	        cartDao.updateCart(cart);
	    }
}
