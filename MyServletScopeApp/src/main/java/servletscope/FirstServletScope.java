package servletscope;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/FirstServlet")

public class FirstServletScope extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	request.setAttribute("reqData","In Request");
    	
    	HttpSession session=request.getSession(true);
    	session.setAttribute("sessionData", "In Session");
    	
    	ServletContext sc = request.getServletContext();
		sc.setAttribute("appData", "In Context");
		
		response.sendRedirect("SecondServlet");
	}
	

}
