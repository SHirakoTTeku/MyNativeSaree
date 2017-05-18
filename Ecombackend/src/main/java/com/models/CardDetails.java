package com.models;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.models.Cart;
import com.models.Customer;

@Entity
@Table(name="CardDetails")
public class CardDetails implements Serializable{

	@Id
	@SequenceGenerator(name = "ship_seq", sequenceName = "ship_seq")
	@GeneratedValue(strategy=GenerationType.AUTO,generator = "ship_seq")
	
	@Column(name="CardID")
	private int cardID;
	
	@NotBlank (message = "Please select card type.")
	@Column(name="cardtype")
    private String cardType;
	@Column(name="cardNumber")
	@Size(min=15, max=16, message="Invalid Card Number")
    private String cardNumber;

    @NotBlank (message = "Please select expiry month.")
    @Column(name="expiryMonth")
    private String expiryMonth;

	@NotBlank (message = "Please select expiry year.")
	 @Column(name="expiryYear")
    private String expiryYear;

   
    @Column(name="cvNumber")
    @Size(min=3, max=3 , message="Invalid CVV2/CVC2 number, check backside of your card")
    private String cvNumber;

    @NotBlank (message = "The name must not be null.")
    @Column(name="nameOnCard")
    private String nameOnCard;
    
   
    @Column(name="atmPin")
    @Size(min=4,max=4 , message="Invalid ATM Pin")
    private String atmPin;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cartId")
    @JsonIgnore
    private Cart cart;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "custId")
    @JsonIgnore
    private Customer usersDetail;
    
    @Column(name="TotalCost")
    private double totalCost;

	public int getCardID() {
		return cardID;
	}

	public void setCardID(int cardID) {
		this.cardID = cardID;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpiryMonth() {
		return expiryMonth;
	}

	public void setExpiryMonth(String expiryMonth) {
		this.expiryMonth = expiryMonth;
	}

	public String getExpiryYear() {
		return expiryYear;
	}

	public void setExpiryYear(String expiryYear) {
		this.expiryYear = expiryYear;
	}

	public String getCvNumber() {
		return cvNumber;
	}

	public void setCvNumber(String cvNumber) {
		this.cvNumber = cvNumber;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public String getAtmPin() {
		return atmPin;
	}

	public void setAtmPin(String atmPin) {
		this.atmPin = atmPin;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Customer getUsersDetail() {
		return usersDetail;
	}

	public void setUsersDetail(Customer usersDetail) {
		this.usersDetail = usersDetail;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

    
}
