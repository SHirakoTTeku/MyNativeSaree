package com.niit.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="User")
public class User {

	@Id
	@SequenceGenerator(name="user_seq", sequenceName="user_seq")
	@GeneratedValue(strategy=GenerationType.AUTO, generator="user_seq")
	private int uid;
	public void setUid(int uid){
		this.uid=uid;
	}
	public int getUid(){
		return uid;
	}
	@Column(name="UserName")
	private String username;
	public void setUsername(String u_name){
		this.username=u_name;
	}
	public String getUserName(){
		return username;
	}
	
	@OneToOne
	@JoinColumn(name="custId")
	@Valid
	private Customer cust;
	private String password;
	private boolean enable ;
	

	
	public Customer getCust() {
		return cust;
	}
	public void setCust(Customer cust) {
		this.cust = cust;
	}
	@Column(name="PASSWORD")
	@NotBlank
	@Size(min=6, max=30)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name="ENABLE")
	public boolean isEnable() {
		return enable;
	}
	public void setEnable(boolean enable) {
		this.enable = enable;
	}
	public String getUsername() {
		return username;
	}


}
