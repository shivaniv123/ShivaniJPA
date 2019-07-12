<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
<form name="frm" method="post" action="rest/products">
	Enter Product id: <input type="text" name="txtId" required/><br>
	Enter Product name: <input type="text" name="txtName" required/><br>
	Enter Product Price: <input type="text" name="txtPrice" required/><br>
	
	<input type="submit" value="Add Product" />
</form>

</body>
</html>