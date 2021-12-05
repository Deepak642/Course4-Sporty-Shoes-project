<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sportyshoes</title>
</head>
<body>
<h1> Welcome to SportShoes, Please sign up </h1>  




    <form action="usersignup" >  
        <label for="name">name</label><br>
  		<input type="text" id="name" name="name" required><br>
  		<label for="email">Email</label><br>
  		<input type="email" id="email" name="email" required><br>
  		<label for="password">Password</label><br>
  		<input type="password" id="password" name="password" required><br>
  		<input type="submit" value="Submit">
    </form>   

</body>
</html>