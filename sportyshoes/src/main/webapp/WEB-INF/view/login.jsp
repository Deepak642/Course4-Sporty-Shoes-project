<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sportyshoes</title>
</head>
<body>
<h1> Welcome to SportShoes, Please login </h1>  


	<form action="loginhandle" >  
        <label for="email">Email</label><br>
  		<input type="email" id="email" name="email"><br>
  		<label for="password">Password</label><br>
  		<input type="password" id="password" name="password"><br>
  		<input type="submit" value="Submit">
    </form>  
    <h4>If new users, Please sign up</h4>
    <a href="signup"><button>signup</button></a> 

</body>
</html>