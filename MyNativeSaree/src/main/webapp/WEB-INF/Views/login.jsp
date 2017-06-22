<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>

<script src="resources/js/angular.min.js" ></script>
<script src="resources/js/login.js" ></script>
</head>
<body>
<jsp:include page="Templates/Header.jsp"></jsp:include>
<h3></h3>
<div class="container">
<c:if test="${error=='true'}">

  <div class="errorblock">
   Your login attempt was not successful, try again.
 
  </div>
  </c:if>
  <c:if test="${not empty logoutmsg }">
   <div class="logoutblock">
   <c:out value="${logoutmsg}" />
   </div>
 </c:if>

<form role="form" action="<c:url value='login' />" method="post" >
	
	<div class="form-group">
		<label for="username">User Name:</label>
		<input style="width: 20%;" type="text" id="username" name="username"  class="form-control" />
  		</div>
		<div class="form-group">
		<label for="password">Password:</label>
		<input style="width: 20%;" type="password" id="password" class="form-control" name="password" />
  </div>

		<div class="input-group input-group-sm">
		<button type="submit" class="btn">submit</button>
		<button type="reset" class="btn">Reset</button>
		</div>

</form>
<h4>Not A User ? <a href="registrationpage">Sign Up Here</a></h4></div>
</body>
</html>