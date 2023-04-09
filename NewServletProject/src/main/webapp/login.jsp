<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="LoginServlet" method="post">
	<label for="input-1">UserName:</label>
	<input id="input-1" placeholder="Text" type="text" name="uname" required="required"/>
	<label for="input-2">Password:</label>
	<input id="input-2" placeholder="Text" type="password" name="upass" required="required" >
		<input type="submit" value="Submit" id="button-1"/>
	</form>
</body>
</html>