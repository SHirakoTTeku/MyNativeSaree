
<%@page isELIgnored="false"   language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DisplayCake</title>
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body style="background-color: white;">
<%@include file="../Views/Templates/Header.jsp" %>
<br><br><br>
<div ng-app="myApp" class="container">
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script src="<c:url value='/resources/js/AngularProductController.js' />"></script>

    <table style="align:'center'" class="table">
     <tr>
         <td> <img src="<c:url value='/resources/image/${product.category}/${product.image}' />" alt="no images" width="500" height="500" /> </td>
			<td>
			<ul>
				<li><h4 style="font-family:cursive;color:red;"> Product Id:</h4>  ${product.pid}</li>
				<li><h4 style="font-family:cursive;color:red;"> Product name:</h4>  ${product.name}</li>
				<li><h4 style="font-family:cursive;color:red;">Product Description :</h4>  ${product.desc}</li>
				<li><h4 style="font-family:cursive;color:red;"> product quantity:</h4>  ${product.qty}</li>
				<li><h4 style="font-family:cursive;color:red;"> Product Category:</h4> ${product.category}</li>
				<li><h4 style="font-family:cursive;color:red;"> Product Price:</h4> ${product.price}</li>
				<li style="font-family:cursive;color:red;"> 
           	<h5>Note: Dress will be delivered in 2 working days.<br>for special Order or Special Requirement please contact Us </h5>
           	<h5>call us:022 2554515</h5>
           </li>
			</ul>
			</td>         
         <td  ng-controller="myCtrl"  ><security:authorize access="isAuthenticated()" >
              <c:choose>
              <c:when test="${product.qty gt 0 }">
              <a  ng-click="addItemToCart('${product.pid}')" ><button class="btn btn_primary">
                  <span class="glyphicon glyphicon-shopping-cart"></span> Add To Cart
               </button>
               </a>       
               </c:when>
               <c:otherwise>
               	<a  href="err" ><button class="btn btn_primary">
                  <span class="glyphicon glyphicon-shopping-cart"></span> Add To Cart
               </button>
               </a>
               </c:otherwise>
              </c:choose>
          </security:authorize>
            <security:authorize access="isAnonymous()">
            <a href="login" class="btn btn_primary">
            <span class="glyphicon glyphicon-shopping-cart"></span>add to cart 
            </a>
            </security:authorize>
           </td>
           
    </tr>
</table>
</div>				
</body>
</html>