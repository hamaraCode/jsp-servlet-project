import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/takecolors")
public class SetCooky extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     
	response.setContentType("text/html");
	
	String option=request.getParameter("color");
	String name=request.getParameter("name");
    
	Cookie cookie1=new Cookie(option, option);
    Cookie cookie2=new Cookie(name, name);
    
    response.addCookie(cookie1);
    response.addCookie(cookie2);
   
     RequestDispatcher rd=request.getRequestDispatcher("GetCooky");
    rd.forward(request, response);
   
  	}

}
