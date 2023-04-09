<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<%@ include file="header.jsp" %><br>
<form action="Login.jsp" method="post">
User Name: <input type="text" name="uname"><br>
Password: <input type="password" name="upass"><br>
<input type="submit" value="Login">
<a href="Reg_form.jsp">Register</a>
</form>
</body>
</html>