package com.niit.models;
import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.validator.constraints.NotBlank;

import com.niit.models.Customer;

@Entity
@Table(name="ShippingAddress")
public class ShippingAddress implements Serializable{

	@Id
	@SequenceGenerator(name="ship_seq", sequenceName="ship_seq")
	@GeneratedValue(strategy=GenerationType.AUTO, generator="ship_seq")
	
	@Column(name="ShipID")
	private int shipid;
	
	@NotBlank(message="House No. Rquired")
	@Column(name="House_no")
	private int housenumber;
	
	@NotBlank(message="Address Line 1 Requird")
	@Column(name="addressLine1")
	private String addressline1;
	@Column(name="addressLine2")
	private String addressline2;
	
	@NotBlank (message = "City Required")
	@Column(name="City")
	private String city;
	@NotBlank (message = "State Required")
	@Column(name="state")
	private String state;
	@NotBlank (message = "Country Required")
	@Column(name="country")
	private String country;
	@NotBlank (message = "ZipCode Required")
	@Column(name="zipcode")
	private String zipcode;

	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="custid")
	private Customer usersDetail;

	public int getShipid() {
		return shipid;
	}

	public void setShipid(int shipid) {
		this.shipid = shipid;
	}

	public int getHousenumber() {
		return housenumber;
	}

	public void setHousenumber(int housenumber) {
		this.housenumber = housenumber;
	}

	public String getAddressline1() {
		return addressline1;
	}

	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}

	public String getAddressline2() {
		return addressline2;
	}

	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Customer getUsersDetail() {
		return usersDetail;
	}

	public void setUsersDetail(Customer usersDetail) {
		this.usersDetail = usersDetail;
	}
}

