package com.niit.models;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Orders")
public class Order implements Serializable{
	@Id
	@Column(name="ORDERID")
	@SequenceGenerator(name="order_seq",sequenceName="order_seq")
	@GeneratedValue(strategy=GenerationType.AUTO,generator="ordr_seq")
	private int oId;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="userId")
	private Customer userdetails;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="cardId")
	private Cart cart;

	public Customer getUserDetails(){
		return userdetails;
	}
	
	public void setUserDetails(Customer userdetails){
		this.userdetails=userdetails;
	}
	
	private Customer customer;
	public Customer getCustomer(){
		return customer;
	}
	public void setCustomer(Customer customer){
		this.customer=customer;
	}
	public int getoId(){
		return oId;
	}
	public void setoId(int oId){
		this.oId=oId;
	}

}
