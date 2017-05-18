package com.models;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="Products")
public class Product implements Serializable{

	@Id
	@SequenceGenerator(name = "prod_seq", sequenceName = "prod_seq")
	@GeneratedValue(strategy=GenerationType.AUTO,generator = "prod_seq")
	
	@Column(name="PID")
	private int pid;
	
	@NotNull
	@Size(min=3,max=40)
	@Column(name="PNAME")
	private String name;
	
	@Min(value=1)
	@Column(name="PRICE")
	private double price;
	
	@Min(value=0)
	@Column(name="Quantity")
	private int qty;	
	
	@Column(name="Category")
	private String category;
	
	@Column(name="ImagePath")
	private String image;	
	
	@NotBlank	
	@Column(name="Description")
	private String desc;
	
	@Transient
	private MultipartFile file;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	} 
	
	
}
