<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<% 
String name=request.getParameter("uname");
String pass=request.getParameter("upass");

Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connection","root","root");
PreparedStatement s=con.prepareStatement("select * from user where name=? and password=?");
s.setString(1,name);
s.setString(2,pass);
ResultSet rs=s.executeQuery();
if(rs.next()){
	response.sendRedirect("home.jsp");
}
else{
//	Please enter correct username or pasword</h4>
	response.sendRedirect("Login_Page.jsp");
}
con.close();
%>