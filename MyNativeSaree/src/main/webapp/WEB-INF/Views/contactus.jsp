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
<div class="panel panel-heading"><h1>Contact Us</h1></div>
<div class="panl panel-body">
<pre>
<form method="post" action="">
<div class="input-group input-group-sm">
<span class="input-group-addon">Name</span>
<input type="text" placeholder="Enter Your Name" class="form-control">
</div>
<div class="input-group input-group-sm">
<span class="input-group-addon">E-Mail</span>
<input type="text" placeholder="Enter your Email-ID" class="form-control">
</div>
<div class="input-group input-group-sm">
<span class="input-group-addon">Description</span>
<textarea rows="10" cols="30" class="form-control"></textarea>
</div>
</form>
</pre>
</div>
</div>
</div>
</div>
</div>
</body>
</html>