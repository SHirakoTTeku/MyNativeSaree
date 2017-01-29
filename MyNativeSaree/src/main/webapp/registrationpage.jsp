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
<div class="panel panel-heading">
<h1>Register Page</h1>
</div>
<div class="panel panel-body">
<form method="post">
<pre>
<div class="input-group input-group-sm">
<span class="input-group-addon" id="sizing-addon1">User Name</span>
<input type="text" class="form-control" placeholder="Enter your User Name" aria-describedby="sizing-addon1">
</div>
<div class="input-group input-group-sm">
<span class="input-group-addon" id="sizing-addon2">Password</span>
<input type="password" class="form-control" placeholder="Enter your Password" aria-describedby="sizing-addon2">
</div>
<div class="input-group input-group-sm">
<span class="input-group-addon" id="sizing-addon3">Confirm Password</span>
<input type="password" class="form-control" placeholder="Enter your Password Again" aria-describedby="sizing-addon3">
</div>
<div class="input-group input-group-sm">
<span class="input-group-addon" id="sizing-addon4">E-Mail Identification</span>
<input type="text" class="form-control" placeholder="Enter your E-Mail ID" aria-describedby="sizing-addon4">
</div>
<div class="btn-group">
<button type="submit" class="btn">
submit</button>
<button type="reset" class="btn">Reset</button>
</div>
</pre>
</form>
</div>
</div>
				</div>
			</div>
		</div>
</body>
</html>