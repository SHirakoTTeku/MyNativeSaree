<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<<<<<<< HEAD
=======

>>>>>>> 27253f5ab534bc095d906e296cdc04e722c02035
<script src="resources/js/angular.min.js" ></script>
<script src="resources/js/login.js" ></script>
</head>
<body ng-app="myModule">
<jsp:include page="Templates/template.jsp"></jsp:include>
<h3></h3>
<div class="container">
			<div class="row">
				<div class="col-lg-6">
<div class="panel panel-default">
<div class="panel panel-heading">
<h1><center>Login</center></h1>
</div>
<div class="panel panel-body">
<div class="table-responsive">
<table class="table">
<form method="post">
	<tr>
		<div class="input-group input-group-sm"  ng-controller="myController">
		<td><span class="input-group-addon" id="sizing-addon1">User Name : <font color="#ff1a1a">{{message}}</font></span></td>
		<td><input type="text" class="form-control" placeholder="Enter your User Name" aria-describedby="sizing-addon1" ng-model="message"></td>
		</div>
	</tr>
	<tr>
		<div class="input-group input-group-sm">
		<td><span class="input-group-addon" id="sizing-addon2">Password</span></td>
		<td><input type="password" class="form-control" placeholder="Enter your Password" aria-describedby="sizing-addon2"></td>
		</div>
	</tr>
	<tr>
		<div class="input-group input-group-sm">
		<td><button type="submit" class="btn">submit</button></td>
		<td><button type="reset" class="btn">Reset</button></td>
		</div>
	</tr>
</form>
</table>
</div>
</div>
</div>
				</div>
			</div>
		</div>
</body>
</html>