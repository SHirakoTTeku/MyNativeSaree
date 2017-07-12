package com.niit.models;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.niit.models.Cart;
import com.niit.models.Product;

@Entity
@Table(name="ITEM")
public class Item {

	@Id
	@SequenceGenerator(name="item_seq",sequenceName="item_seq")
	@GeneratedValue(strategy=GenerationType.AUTO,generator="item_seq")
	
	private int qunitity;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="PID")
	private Product product;
	
	@ManyToOne(fetch = FetchType.EAGER)
	  @JoinColumn(name = "cartId")
	  @JsonIgnore
	  private Cart cart;
	
	
	
	private double totalPrice;

	public int getQunitity() {
		return qunitity;
	}

	public void setQunitity(int qunitity) {
		this.qunitity = qunitity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}



}
