package com.niit.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dao.OrderDao;
import com.niit.dao.OrderDaoImpl;
import com.niit.models.Cart;
import com.niit.models.Item;
import com.niit.models.Order;

@Service
public class OrderService {
	
		@Autowired
	    private OrderDao orderDao;
	    private CartService cartService;

	    public void addOrder(Order userOrder) {
	    	orderDao.addOrder(userOrder);
	    }

	    public double getOrderGrandTotal(int cartId) {
	        double grandTotal=0;
	        Cart cart = cartService.getCartById(cartId);
	        List<Item> cartItems = cart.getItem();

	        for (Item item : cartItems) {
	            grandTotal+=item.getTotalPrice();
	        }

	        return grandTotal;
	    }

}