<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ShippingDetails</title>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script
	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script src="<c:url value='/resources/js/AngularjsController.js' />"></script>
</head>
<body style="background-color: #ffdd99">
 <div class="container">
<%@ include file="../Views/Templates/Header.jsp" %> 
<h3 align="center">Shipping Details</h3>
	<div style="width: 40%;" class="container">
<form:form modelAttribute="ship" role="form">
   <div class="form-group">
      
				<label for="houseNumber">House Number</label>
				<form:input path="housenumber"  class="form-control" />
				<form:errors path="housenumber" cssStyle="color: #ff0000"/>
   </div>
   <div class="form-group">
				<label for="add1">Address Line 1</label>

				<form:input path="addressLine1" class="form-control" />
				<form:errors path="addressLine1" cssStyle="color: #ff0000"/>
			</div>
			<div class="form-group">
				<label>Address Line 2</label>

				<form:input path="addressLine2" class="form-control" />

			</div>


			<div class="form-group">
				<label >City</label>

				<form:input path="city"  class="form-control" />
				<form:errors path="city" cssStyle="color: #ff0000"/>
			</div>

			<div class="form-group">
				<label >State</label>

				<form:input path="state"  class="form-control" />
				<form:errors path="state" cssStyle="color: #ff0000"/>
			</div>

			<div class="form-group">
				<label >Country</label>

				<form:input path="country"  class="form-control" />
				<form:errors path="country" cssStyle="color: #ff0000"/>

			</div>
			<div class="form-group">
				<label >Zipcode</label>

				<form:input path="zipCode"  class="form-control" />
				<form:errors path="zipCode" cssStyle="color: #ff0000"/>
			</div>

			<div>
									<input type="hidden" name="_flowExecutionKey" /> <input
						type="submit" value="Proceed to Payment" class="btn btn-primary"
						name="_eventId_payment" />
				
			</div>
		</form:form>
</div>

     </div>
	

</body>
</html>