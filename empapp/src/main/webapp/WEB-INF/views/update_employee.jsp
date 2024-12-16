<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
<%@ include file="menu.jsp"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee</title>
</head>
<body>
	<h2>Update Employee...</h2>
	<form action="updateEmployee" method="post">
		<pre>
			<input type="hidden" name="id" value="${employee.id}"/>
			Name<input type="text" name="name" value="${employee.name}"/>
			Email<input type="text" name="email"value="${employee.email}"/>
			Mobile<input type="text" name="mobile" value="${employee.mobile}"/>
			Salary<input type="text" name="salary" value="${employee.salary}"/>
			<input type="submit" value="Update"/>
		</pre>
	</form>
	${msg}
</body>
</html>