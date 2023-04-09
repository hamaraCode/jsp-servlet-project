package LoginAppServ1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/LoginAppServlet1")
public class LoginAppServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String p1=request.getParameter("uname");

	String p2=request.getParameter("upass");
	String res="Try again";
	
	if(p1.equalsIgnoreCase("Anand") && p2.equals("Anand@123"))
	{
		res="You are done successfully";
	}
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	out.print("<html>");
	out.print("<head>");
	out.print("<title>Home</title>");
	out.print("</head>");
	out.print("<body>");
	
	out.print("<h1>"+res+"</h1>");
	
	out.print("</body>");
	out.print("</html>");
	
	}
}
