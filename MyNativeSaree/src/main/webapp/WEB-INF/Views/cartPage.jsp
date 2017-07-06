<%@page language="java" contentType="text/html; charset=ISO-8859-1" 
     pageEncoding="ISO-8859-1" isELIgnored="false" %> 
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
         <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %> 
 		<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> 
 <html> 
 <head> 
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> 
 <title>Cart</title> 
 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"> 
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script> 
   <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script> 
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script> 
   <script src="<c:url value='/resources/js/AngularProductController.js'/>"></script> 
 </head> 
 <body style="background-color: white"> 
 
 
 <div class="container"> 
 <%@ include file="../Views/Templates/Header.jsp"  %> 
 <div>  
 <center> 
 					<h3>Items in your cart</h3> 
 </center> 
 </div> 
 <div  ng-app="myApp"  ng-controller = "myCtrl" ng-init="retrieveCart()" > 
 	  
 	 <div > 
         <table class="table table-bordered table-striped fs13" > 
 		  <thead> 
 			  <tr> 
 				 
 				<th>Image</th> 
 				<th class="width110">Product</th> 
 				<th >Unit Price</th> 
 				<th>Quantity</th> 
 				<th>Price(in Rs.)</th> 
 				<th>Action</th> 
 			  </tr> 
 			</thead> 
 			<tbody> 
 				<tr ng-repeat = "items in cart.item"> 
				<td class="span1"><img height="60px" width="60px" src="<c:url value="/resources/images/{{items.product.category}}/{{items.product.image}}" /> " alt="image"/></td>
 						<td>{{items.product.name}}</td> 
 						<td>{{items.product.price}}</td> 
 						<td>{{items.qunitity}}</td> 
 						<td>{{items.totalPrice}}</td> 
 						<td><a href="#" class="btn btn-danger btnAction" ng-click="removeItemFromCart(items.itemId)"> 
 							<span class="glyphicon glyphicon-remove"></span>remove</a></td> 
 					</tr> 
 			  <tr> 
                     <td></td> 
                     <td></td> 
					<td></td> 
                     <td>Grand Total(in Rs.)</td> 
                     <td>{{GrandTotalOfItems()}}</td> 
                     <td></th> 
                 </tr>	   
 			</tbody> 
 		  </table> 
 		   
 		   
 
 
           <div class="row"> 
 		  <div class="col-sm-4"> 
              <a href="<c:url value='/'/>" class="btn btn-primary center">Continue Shopping</a> 
 			</div>	 
 			<div class="col-sm-4"> 
 			<form:form> 
 			<input type="hidden" name="_flowExecutionKey"/> 
              <input type="submit" name="_eventId_checkout"  
                    class="btn btn-success center" value=" Check out " /> 
               </form:form> 
 			</div>	   
 			<div class="col-sm-4"> 
            <a class="btn btn-danger center" ng-click="clearCartItems()"><span 
                         class="glyphicon glyphicon-remove-sign"></span>Clear Cart</a> 
 			</div>		   
 			 
         </div> 
 		</div> 
       </div>  

 </div> 
 </body> 
 </html> 
