<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Product</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

  <style type="text/css">
.errStyle {
	color:red;
	font-style: italic;
	font-weight: bold;
}
</style>
</head>
<body>
<jsp:include page="/WEB-INF/Views/Admin/adminbar.jsp"></jsp:include><br><br>
<div class="container">
<span style="color:green;font-size:20px;">
 ${msg}
 <br/>
 </span>
			<div class="row">
				<div class="col-lg-6">
<div class="panel panel-default">
<div class="panel panel-heading">
<h1><center>Add Product</center></h1>
</div>
<div class="panel panel-body">
<form:form role="form"  action="add" modelAttribute="product" enctype="multipart/form-data"> 
		<div class="form-group">
		<form:label  path="name">
						<spring:message text="Product Name"/>
				</form:label>
		<form:input style="20%;" class="form-control" path="name" />
				<form:errors path="name" >
						<p class="errStyle">
								* Product Name should be atleast 3 characters
						</p>
 				</form:errors>
		</div>
	<div class="form-group">
 					<form:label  path="qty">
							<spring:message text="Quantity Available"/>
					</form:label>
					<form:input class="form-control" path="qty" />
					<form:errors path="qty" >
							<p class="errStyle">
									* should be greater than 1
						    </p>
 				    </form:errors>
 	</div>
		<div class="form-group">
		<form:label path="price"><spring:message text="Product Price"/></form:label>
		<form:input class="form-control" path="price"/>
		<form:errors path="price" >
						<p class="errStyle">
										* should be greater than 1
						</p>
 				</form:errors>
		</div>
		<div class="form-group">
		<form:label path="qty" class="form-control">
		<spring:message text="Product Quantity"/>
		</form:label>
		<form:input class="form-control" path="qty"/>
		<form:errors path="qty" >
							<p class="errStyle">
									* should be greater than 1
						    </p>
 				    </form:errors>
		</div>
		<div class="form-group">
 				<form:label  path="desc">
					<spring:message text="Description"/>
				</form:label>
  				<form:input class="form-control" path="desc" />
  				<form:errors path="desc">
  					<p class="errStyle">
							* Cannot be blank
					</p>
 				</form:errors>
 	</div>
 
  <div class="form-group">
 				<label>Upload Image</label>
  				<form:input type="file" path="file"  class="form-control" />
   					<form:errors path="file" >
  							<p class="errStyle">
 								* Cannot be blank
 							</p>
 					</form:errors>
 	</div>
		<div class="form-group">
		<button type="submit" class="btn">Add Product</button>
		<button type="reset" class="btn">Reset</button>
		</div>
</form:form>
</div>
</div>
</div>
</body>
</html>