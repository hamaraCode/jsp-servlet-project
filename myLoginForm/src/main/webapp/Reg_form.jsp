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
<form action="jdbc_reg.jsp" method="post">
User Name: <input type="text" name="uname"><br>
Password: <input type="password" name="upass"><br>
Role: <select name=role>
  <option name="admin">Admin</option>
  <option name="operator">Operator</option>
</select><br>
<input type="submit" value="Login">
<a href="Login_page.jsp"><input type="button" value="Back"></a>
</form>
</body>
</html>