package com.niit.controllers;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.niit.models.Cart;
import com.niit.models.Customer;
import com.niit.models.Item;
import com.niit.models.Product;
import com.niit.services.CartItemService;
import com.niit.services.Customer_Service;
import com.niit.services.ProductServices;

@RestController
public class CartController {

	@Autowired
	private CartItemService cartItemServices;
	
	@Autowired
	private Customer_Service userDetailServices;

	@Autowired
	private ProductServices itemServices;

	@RequestMapping("/RefreshCart")
	public Cart getCartById(Principal p){
		System.out.println("Reloading Cart!");
		Customer userDetail = userDetailServices.getUserByUsername(p.getName());
		System.out.println("Cart ID: "+userDetail.getCustName()+" "+userDetail.getCart().getCartId());
		Cart cart = userDetail.getCart();
		return cart;
	}
	
	@RequestMapping(value = "addItem/{itemId}", method = RequestMethod.PUT)
	   @ResponseStatus(value = HttpStatus.NO_CONTENT)
	    public void addItem (@PathVariable("itemId") int itemId, Principal p) {
		
		System.out.println("ADD");
		Customer userDetails = userDetailServices.getUserByUsername(p.getName());
		Cart cart = userDetails.getCart();
		System.out.println("Cart ID: "+cart.getCartId());
		Product product= itemServices.getById(itemId);
		System.out.println("Product : "+product.getName());
		List<Item> CartItems = cart.getItem();
		System.out.println("Cart Size: "+CartItems.size());
		for(int i=0;i<CartItems.size();i++){
			if(product.getPid()==CartItems.get(i).getProduct().getPid()){
				Item cartItem = CartItems.get(i);
				cartItemServices.removeCartItem(cartItem);
				cartItem.setQunitity(cartItem.getQunitity()+1);
				cartItem.setTotalPrice(product.getPrice()*cartItem.getQunitity());
				cartItemServices.addCartItem(cartItem);
				return ;
			}
		}
		Item cartItem = new Item();
		cartItem.setProduct(product);
		cartItem.setQunitity(1);
		cartItem.setTotalPrice(product.getPrice()*cartItem.getQunitity());
		cartItem.setCart(cart);
		cartItemServices.addCartItem(cartItem);
		
	}
	}
	
