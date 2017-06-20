<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<div class="table-responsive">
<table class="table">
<form:form role="form" action="add" method="post" modelAttribue="product" enctype="multipart/form-data">
	<tr>
		<div class="form-group">
		<div class="input-group input-group-sm">
		<td><span class="input-group-addon" id="sizing-addon1">
		<form:label  path="name">
						<spring:message text="Product Name"/>
				</form:label>
		</span></td>
		<td><form:input style="20%;" class="form-control" path="name" />
				<form:errors path="name" >
						<p class="errStyle">
								* Product Name should be atleast 3 characters
						</p>
 				</form:errors></td>
		</div></div>
		</tr>
	<tr>
		<div class="input-group input-group-sm">
		<td><span class="input-group-addon" id="sizing-addon2">Product Price</span></td>
		<td><input type="password" class="form-control" placeholder="Enter Product price" aria-describedby="sizing-addon2"></td>
		</div>
	</tr>
	<tr>
		<div class="input-group input-group-sm">
		<td><span class="input-group-addon" id="sizing-addon2">Product Quantity</span></td>
		<td><input type="password" class="form-control" placeholder="Enter Product Quantity" aria-describedby="sizing-addon2"></td>
		</div>
	</tr>
	<tr>
		<div class="input-group input-group-sm">
		<td><span class="input-group-addon" id="sizing-addon2">Image Path</span></td>
		<td><input type="file" class="form-control" aria-describedby="sizing-addon2"></td>
		</div>
	</tr>
	<tr>
		<div class="input-group input-group-sm">
		<td><button type="submit" class="btn">Add Product</button></td>
		<td><button type="reset" class="btn">Reset</button></td>
		</div>
	</tr>
</form:form>
</table>
</div>
</div>
</div>
				</div>
			</div>
		</div>
</body>
</html>