package com.models;
import javax.persistence.*;

@Entity
@Table(name="USERROLE")
public class UserRole {

	@Id
	@SequenceGenerator(name="user_seq1", sequenceName="user_seq1")
	@GeneratedValue(strategy=GenerationType.AUTO,generator="user_seq1")
	
	@Column(name="UID")
	private int uid;
	
	@Column(name="authority")
	String authority;
	
	@OneToOne
	@JoinColumn(name="custId")
	Customer cust;

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	
}
