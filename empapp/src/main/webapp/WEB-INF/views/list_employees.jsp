<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
<%@ include file="menu.jsp"%>      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<table border=1>
		<tr>
			<th>Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Salary</th>
			<th>Delete</th>
			<th>Update</th>
			
		</tr>

		<c:forEach items="${employees}" var="emp">
			<tr>
				<td>${emp.name}</td>
				<td>${emp.email}</td>
				<td>${emp.mobile}</td>
				<td>${emp.salary}</td> 
				<td><a href="delete?id=${emp.id}">Delete</a>
				<td><a href="update?id=${emp.id}">Update</a>
			</tr>
		</c:forEach>
	</table>
</body>
</html>