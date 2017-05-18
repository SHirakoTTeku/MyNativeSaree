<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Templates/template.jsp"></jsp:include>
<div class="container">
<div class="row">
<div class="col-lg-6">
<div class="panel panel-default">
<div class="panel panel-heading"><h1><center>Contact Us</center></h1></div>
<div class="panl panel-body">
<div class="table-responsive">
<table class="table">
<form method="post" action="">
	<tr>
		<div class="input-group input-group-sm">
		<td><span class="input-group-addon">Name</span></td>
		<td><input type="text" placeholder="Enter Your Name" class="form-control"></td>
		</div></tr>
	<tr>	
		<div class="input-group input-group-sm">
		<td><span class="input-group-addon">E-Mail</span></td>
		<td><input type="email" placeholder="Enter your Email-ID" class="form-control"></td>
		</div></tr>
	<tr>	
		<div class="input-group input-group-sm">
		<td><span class="input-group-addon">Description</span></td>
		<td><textarea rows="10" cols="30" class="form-control"></textarea></td>
		</div></tr>
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