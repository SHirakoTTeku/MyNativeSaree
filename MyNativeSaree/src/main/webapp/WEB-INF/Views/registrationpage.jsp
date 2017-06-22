<%@ page isELIgnored="false" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>        
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${title}</title>
</head>
<body>
<jsp:include page="Templates/Header.jsp"></jsp:include>
		<div class="container">
<h1><center>Registration Page</center></h1>
</div>
<p>
${success}
</p>	
<div class="container">
<div class="col-sm-6">
<form:form role="form" action="registrationpage" modelAttribute="user">
		<div class="form-group">
		<form:label  path="cust.custName">
				<spring:message text="Enter Your Full Name"/>
	</form:label>
		<form:input  class="form-control" path="cust.custName" />
		<form:errors path="cust.custName" >
			<p class="errStyle">
					* Invalid Customer name
</p>
 </form:errors></div>	
		
		<div class="form-group">
		<form:label  path="userName">
				<spring:message text="User Name"/>
	</form:label>
	<form:input class="form-control" path="userName" />
		<form:errors path="userName" >
			<p class="errStyle">
					* Invalid Username
</p>
 </form:errors>
 </div>	
		
		<div class="form-group">
		<form:label  path="password">
				<spring:message text="Password"/>
	</form:label>
		<form:input type="password" class="form-control" path="password" />
		<form:errors path="password" >
			<p class="errStyle">
					* Invalid Password
</p>
 </form:errors>
 
  </div>
    <div class="form-group">
 	<form:label  path="cust.email">
				<spring:message text="Email"/>
	</form:label>
	<form:input class="form-control" path="cust.email" />
		<form:errors path="cust.email" >
			<p class="errStyle">
					* Invalid Email
</p>
 </form:errors>
 </div>
  <div class="form-group">
 	<form:label  path="cust.phone">
				<spring:message text="Phone Number"/>
	</form:label>
	<form:input class="form-control" path="cust.phone" />
		<form:errors path="cust.phone" >
			<p class="errStyle">
					* Invalid Phone no.
</p>
 </form:errors>
 </div>

  <div class="form-group">
 	<form:label  path="cust.address">
				<spring:message text="Address"/>
	</form:label>
	<form:input class="form-control" path="cust.address" />
		<form:errors path="cust.address" >
			<p class="errStyle">
					* Invalid Address
</p>
 </form:errors>
 </div>
		
		<button type="submit" class="btn">submit</button>
	<button type="reset" class="btn">Reset</button>
	
</form:form>
</div>
</div>
</body>
</html>