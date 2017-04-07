package com.niit.models;
public class product {
int product_id;
double product_price,product_quantity;
String product_name,product_img;


//Getter Setter for Product ID
public void setproduct_Id(int product_id){
this.product_id=product_id;	
}
public int getproduct_Id(){
	return product_id;
}
//Getter Setter for Product Price
public void setproduct_Price(double product_price){
	this.product_price=product_price;
}
public double getproduct_Price(){
	return product_price;
}

//Getter Setter for Product Quantity
public void setproduct_Quantity(double product_quantity){
this.product_quantity=product_quantity;	
}
public double getproduct_Quantity(){
	return product_quantity;
}

//Getter Setter for Product Name
public void setproduct_Name(String product_name){
	this.product_name=product_name;
}
public String getproduct_Name(){
	return product_name;
}

//Getter Setter for Product Image
public void setproduct_Img(String product_img){
	this.product_img=product_img;
}
public String getproduct_Img(){
	return product_img;
}

}
