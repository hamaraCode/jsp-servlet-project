

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/LoginAppServ2")
public class LoginAppServ_2 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;   

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     String p1=request.getParameter("uname");
     String p2=request.getParameter("upa 3ss");
     String p3=request.getParameter("urole");
	
	int i=0;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connection", "root", "root");
	     PreparedStatement s=con.prepareStatement("insert into user(name,password,user_role) values(?,?,?)");
	    
	     s.setString(1, p1);
	     s.setString(2, p2);
	     s.setString(3, p3);
	     
	     i=s.executeUpdate();
	     con.close();
	 }
	  catch (Exception e) {
		e.printStackTrace();
	 }
	
//	response.sendRedirect("LoginApp_2.html");

	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	
	
	if(i>0)
	{
		out.print("<h3>record inserted</h3>");
	}
	else
	{
		out.print("<h3>record not inserted</h3>");
	}
	out.flush();
	out.close();
	
	}
}
