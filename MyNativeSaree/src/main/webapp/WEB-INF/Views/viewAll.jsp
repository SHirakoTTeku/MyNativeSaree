<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    
<!DOCTYPE html PUBLIC1 "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<title>Boutique</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script src="<c:url value='/resources/js/AngularProductController.js' />"></script>
</head>
<body ng-app="myApp" style="background-color:white;">
<%@ include file = "../Views/Templates/Header.jsp" %>
<br><br><br>
<div class="container" >
<marquee>
 <label>call us for special dress:022 23423432 we sell best product we have latest collection of dress </label>
 </marquee>
 
<Div class="container">
<div ng-controller="myCtrl"  class="container">
<div align="justify">
 <input type="text" id="query" ng-model="query" />
 <button class="default"><span class="glyphicon glyphicon-search"> </span></button>
 </div>
   <span style="color:green;font-size:20px;">
 ${msg}
 <br/>
 </span>
    <c:set var="pid" value="${param.id}"></c:set>
	<c:if test="${!(pid<=3)}" >
		<c:set var="pid" value="4" />
	</c:if>
<table style="width: 100%;" class="table">
<tr>
<th ng-click="sort('pid')"><a style="color: Black;" href="#"> <span class="glyphicon glyphicon-chevron-down"> Product Id</span></a> </th>
<th ng-click="sort('image')"> <a style="color: Black;" href="#">  <span class="glyphicon glyphicon-chevron-down"> Image</span></a>  </th>
<th ng-click="sort('name')"> <a style="color: Black;" href="#"> <span class="glyphicon glyphicon-chevron-down">  Dress Name</span></a>  </th>
<th ng-click="sort('price')"> <a style="color:Black;" href="#"> <span class="glyphicon glyphicon-chevron-down"> price</span></a>  </th>
<th></th>
</tr>
	<c:if test="${pid==1}" >
	<tr ng-repeat="product in data|filter:{category:'Casual'}|filter:query|orderBy:sortKey:reverse" >
	</c:if>
	
	<c:if test="${pid==2}" >
	<tr ng-repeat="product in data|filter:{category:'WeddingWear'}|filter:query|orderBy:sortKey:reverse" >
	</c:if>
	
	<c:if test="${pid==3}" >
	<tr ng-repeat="product in data|filter:{category:'PartyWear'}|filter:query|orderBy:sortKey:reverse" >
	</c:if>
	<c:if test="${pid==4}" >
		<tr ng-repeat="product in data|filter:query|orderBy:sortKey:reverse">
	</c:if>
   <td>{{product.pid}} </td>
   <td ><img src="<c:url value='/resources/image/{{product.category}}/{{product.image}}' />"
    alt="no images" width="100" height="100" /></td>
   <td> {{product.name}} </td>
   <td>Rs.{{product.price}}</td>
   
  <td> <a style="background-color: black;" href="disp?id={{product.pid}}" class="btn btn-primary">View</a></td>
  
  <td>
  <c:set var="productid" value="{{product.pid}}" />
 
  	<security:authorize access="hasRole('ROLE_USER')" >
            <span ng-if="product.qty==0 ">
          	<a  href="err"> <button style="background-color: black;" class="btn btn_primary">
                  <span class="glyphicon glyphicon-shopping-cart"></span> Add To Cart
               </button>
               </a>
               </span>  
            <span ng-if="product.qty!=0 ">
               <a ng-click="addItemToCart(product.pid)" > <button style="background-color:black;"class="btn btn_primary">
                  <span class="glyphicon glyphicon-shopping-cart"></span> Add To Cart
               </button>
               </a>     
          </span>
          
          </security:authorize>
          
          
            <security:authorize access="isAnonymous()">
            <a href="login"><button style="background-color:black;" class="btn btn_primary">
            <span class="glyphicon glyphicon-shopping-cart"></span>add to cart
            </button>
            </a>
            </security:authorize>
  </td>
  <security:authorize access="hasRole('ROLE_ADMIN')">
   <td> <a href="/SaranyaBoutiqueFrontEnd/admin/edit?id={{product.pid}}" class="btn btn-primary">EDIT</a></td>
   <td> <a href="/SaranyaBoutiqueFrontEnd/admin/delete?id={{product.pid}}" class="btn btn-primary">DELETE</a></td>
   </security:authorize>
   
   </tr>
   </table>
      
</div>
</div>
</div>
</div>
</body>
</html>