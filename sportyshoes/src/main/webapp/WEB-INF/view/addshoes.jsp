<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sportyshoes</title>
</head>
<body>
<h1>  </h1>  


	<form action="addshoe" >  
        <label for="category">Choose a category:</label>
       <select id="category" name="category" required>
         <option value=1>Men</option>
         <option value=2>Women</option>
       </select><br><br>
  		<label for="name">name</label><br>
  		<input type="text" id="name" name="name" required><br><br>
  		<label for="size">size</label><br>
  		<input type="number" id="size" name="size" required><br><br>
  		<label for="price">Price</label><br>
  		<input type="number" id="price" name="price" required><br><br>
  		<input type="submit" value="Submit">
    </form>  


</body>
</html>