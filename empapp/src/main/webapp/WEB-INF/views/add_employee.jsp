<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ include file="menu.jsp"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
</head>
<body>
	<h2>Add Employee...</h2>
	<form action="addEmployee" method="post">
		<pre>
			Name<input type="text" name="name"/>
			Email<input type="text" name="email"/>
			Mobile<input type="text" name="mobile"/>
			Salary<input type="text" name="salary"/>
			<input type="submit" value="Save"/>
		</pre>
	</form>
	${msg}
</body>
</html>