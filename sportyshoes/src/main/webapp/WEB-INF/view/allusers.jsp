<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false" errorPage="Error.jsp"%>
<%@ taglib  uri ="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SportyShoes</title>
</head>
<body>

<h2>Users list</h2>

<table border='1' style='border-collapse:collapse'>
<tr>
<th>ID</th>
<th>Name</th>
<th>Email</th>
</tr>
 
<c:forEach items="${allusers}" var="users">
<tr>
<td>${users.id}</td>
<td>${users.name}</td>
<td>${users.email}</td>
 
</tr>
 </c:forEach>
 
</table>

</body>
</html>