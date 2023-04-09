<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<% 
String name=request.getParameter("uname");
String pass=request.getParameter("upass");
String role=request.getParameter("role");

Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connection","root","root");
PreparedStatement s=con.prepareStatement("insert into user(name,password,user_role) values(?,?,?)");
s.setString(1,name);
s.setString(2,pass);
s.setString(3, role);
int i=s.executeUpdate();
response.sendRedirect("Login_Page.jsp");
%>