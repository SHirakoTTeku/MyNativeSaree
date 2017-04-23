package com.niit.models;
public class product {
	private int pid,qnty;
	private String pname,pimg;
	private double price;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getQnty() {
		return qnty;
	}
	public void setQnty(int qnty) {
		this.qnty = qnty;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPimg() {
		return pimg;
	}
	public void setPimg(String pimg) {
		this.pimg = pimg;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public product(int pid, int qnty, String pname, String pimg, double price) {
		super();
		this.pid = pid;
		this.qnty = qnty;
		this.pname = pname;
		this.pimg = pimg;
		this.price = price;
	}


}

