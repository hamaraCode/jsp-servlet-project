

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	    String name=request.getParameter("uname");
	    String pass=request.getParameter("upass");
	    
	    response.setContentType("text/html");
	    PrintWriter out= response.getWriter();
	    request.getRequestDispatcher("home.jsp").include(request, response);
       
	    if(pass.equals("ujjain@123")) {
	    	HttpSession session=	request.getSession();
	    	session.setAttribute("name", name);
	    	out.print("Welcome "+name+" to my Web Page");
	   	    }
	    else {
			out.print("Sorry,username or password is wrong");
			request.getRequestDispatcher("login.jsp");
		}
	    out.close();
	}

}
