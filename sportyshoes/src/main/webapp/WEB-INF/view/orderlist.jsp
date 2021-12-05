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

<h2>Men shoes Order list</h2>

<table border='1' style='border-collapse:collapse'>
<tr>
<th>orderid</th>
<th>name</th>
<th>shoeid</th>
<th>price</th>
<th>date</th>
</tr>
 
<c:forEach items="${menOrders}" var="users">
<tr>
<td>${users.orderid}</td>
<td>${users.name}</td>
<td>${users.shoeid}</td>
 <td>${users.price}</td>
 <td>${users.date}</td>
</tr>
 </c:forEach>
 
</table>

<h2>Women shoes Order list</h2>

<table border='1' style='border-collapse:collapse'>
<tr>
<th>orderid</th>
<th>name</th>
<th>shoeid</th>
<th>price</th>
<th>date</th>
</tr>
 
<c:forEach items="${womenOrders}" var="users1">
<tr>
<td>${users1.orderid}</td>
<td>${users1.name}</td>
<td>${users1.shoeid}</td>
 <td>${users1.price}</td>
 <td>${users1.date}</td>
</tr>
 </c:forEach>
 
</table>

</body>
</html>