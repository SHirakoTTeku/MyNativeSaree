<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
.btn {
  -webkit-border-radius: 28;
  -moz-border-radius: 28;
  border-radius: 28px;
  text-shadow: 1px 1px 3px #ff9008;
  font-family: Courier New;
  color: #ebce0e;
  font-size: 20px;
  background: #3ac225;
  padding: 10px 20px 10px 20px;
  text-decoration: none;
}

.btn:hover {
  background: #3cb0fd;
  background-image: -webkit-linear-gradient(top, #3cb0fd, #3498db);
  background-image: -moz-linear-gradient(top, #3cb0fd, #3498db);
  background-image: -ms-linear-gradient(top, #3cb0fd, #3498db);
  background-image: -o-linear-gradient(top, #3cb0fd, #3498db);
  background-image: linear-gradient(to bottom, #3cb0fd, #3498db);
  text-decoration: none;
}

</style>
</head>
<body background="<c:url value='resources/images/background.jpg' />" >
<div>
<nav class="navbar-inverse" navbar-fixed-top>
<div class="container-fluid">
<div class="navbar-header">
<a class="navbar-brand" href="/MyNativeSaree/index"><font size="5"><label style="color: white"> My Native Saree </label></font></a></div>
<ul class="nav navbar-nav">
<!-- <li><a href="home">Home Page</a>-->
<li><a href="aboutus">About Us</a>
<li><a style="color: white; font-family: serif; font-size: large; " href="/MyNativeSaree/viewAll">View All </a></li>
<li class="dropdown"><a style="color: white;" class="dropdown-toggle" data-toggle="dropdown" href="#">Category <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="/viewAll?id=1">Category 1</a></li>
          <li><a href="/viewAll?id=2">Category 2</a></li>
          <li><a href="/viewAll?id=3">Category 3</a></li>
        </ul>
      </li>
<li><a href=contactus>Contact Us</a>
         
      		<security:authorize access="hasRole('ROLE_ADMIN')">
         
      		<li><a style="color: white; font-family: serif; font-size: large; "  href="<c:url value='/Admin/addp/add'/>" >  Add Product</a></li>
      		<li><a style="color: white; font-family: serif; font-size: large; "  href="<c:url value='/admin'/>" >Admin</a></li>
      </security:authorize>
      <security:authorize access="isAnonymous()">
			       <li><a style="color: white; font-family: serif; font-size: large; "  href="registrationpage"> <span class="glyphicon glyphicon-user"></span> Register</a></li>
				<li><a style="color: white; font-family: serif; font-size: large; "  href="<c:url value='/login' />"><span class="glyphicon glyphicon-hand-right"></span>View Cart</a></li>
				<li><a style="color: white; font-family: serif; font-size: large; "  href="<c:url value='/login' />"> <span class="glyphicon glyphicon-log-in"></span> Login</a></li>
			</security:authorize>
			<security:authorize access="isAuthenticated()">
				
				<security:authorize access="hasRole('ROLE_USER')">
				<li><a style="color: white; font-family: serif; font-size: large; "  href="<c:url value='/memberShip'/>"><span
						class="glyphicon glyphicon-hand-right"></span>View Cart</a></li>
						</security:authorize>
				<li><span class="glyphicon"></span><h5 style="color:White;">Welcome <%= request.getUserPrincipal().getName() %></h5> 
				</li>
				<li><a style="color: white; font-family: serif; font-size: large; "  href='<c:url value="/logout1" />' >
						<span class="glyphicon glyphicon-log-out"></span> Logout
				</a></li>
			</security:authorize>
      
			
</ul>
</div>
</nav>
</div>
</body>
</html>