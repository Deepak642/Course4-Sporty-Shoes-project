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

<h2>Men's Shoes</h2>
<table border='1' style='border-collapse:collapse'>
<tr>
<th>Name</th>
<th>Size</th>
<th>Price</th>
<th>Click to purchase</th>
</tr>
 
<c:forEach items="${menshoeData}" var="shoes1">
<tr>
<td>${shoes1.name}</td>
<td>${shoes1.size}</td>
<td>${shoes1.price}</td>
<td><a href="menshoespurchase?id=${shoes1.product_id}&price=${shoes1.price}"><button>Purchase</button></a></td>  
 
</tr>
 </c:forEach>
 
</table>
</body>
</html>