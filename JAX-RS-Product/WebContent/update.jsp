<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UPDATE</title>
</head>
<body>
<form action="rest/products/update" method="post">
Enter Product Id: <input type="text" name="txtId" required"/>
Enter Product name: <input type="text" name="txtName" required/><br>
	Enter Product Price: <input type="text" name="txtPrice" required/><br>
<input type="submit" value="Update">
</body>
</html>