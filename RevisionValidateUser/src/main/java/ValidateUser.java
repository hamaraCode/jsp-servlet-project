

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ValidateUser")
public class ValidateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
		    response.setContentType("text/html");
	    int uid=Integer.parseInt(request.getParameter("uid"));
	    String upass=request.getParameter("upass");

	    HttpSession session=request.getSession(true);
	    session.setAttribute("uid", uid);
	   
	    boolean result=LoginDao.validate(uid, upass);
	    if(result==true) {
	    	RequestDispatcher rd= request.getRequestDispatcher("ProfileServlet"); 
	        rd.forward(request, response);
	    }
	    else
	    	response.sendRedirect("index.html");
	
	} 
	}

