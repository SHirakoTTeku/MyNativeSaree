package com.niit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dao.ItemDao;
import com.niit.models.Cart;
import com.niit.models.Item;

@Service
public class CartItemService {

	@Autowired
	private ItemDao cartItemDao;
	
	public void addCartItem(Item cartitem){
		cartItemDao.addItem(cartitem);
	}
	public void removeCartItem(Item cartitem){
		cartItemDao.deleteItem(cartitem);
	}
	public void removeAllCartItem(Cart cart){
		cartItemDao.removeAllCartItems(cart);
	}
	public Item getCartItemByItemId(int Itemid){
		return getCartItemByItemId(Itemid);
	}
	
	
}
