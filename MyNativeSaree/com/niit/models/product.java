
public class product {
int product_id;
double product_price;
String product_name,product_img;


//getter setter for Product ID
public int setproduct_Id(int product_id){
this.product_id=product_id;	
}
public int getproduct_Id(){
	return product_id;
}
//Getter setter for Product Price
public double setproduct_Price(double product_price){
	this.product_price=product_price;
}
public double getproduct_Price(){
	return product_price;
}

//Getter Setter for Product Name
public String setproduct_Name(String product_name){
	this.product_name=product_name;
}
public String getproduct_Name(){
	return product_name;
}

//Getter Setter for Product Image
public String setproduct_Img(String product_img){
	this.product_img=product_img;
}
public String getproduct_Img(){
	return product_img;
}

}
