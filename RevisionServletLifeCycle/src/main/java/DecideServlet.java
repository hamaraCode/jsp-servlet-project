import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DecideServlet")
public class DecideServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     String num1=request.getParameter("num1");
     String num2=request.getParameter("num2");
     String option=request.getParameter("operation");
                         
     request.setAttribute("num1", num1);
     request.setAttribute("num2", num2);
     response.setContentType("text/html");
     
     if("Add".equals(option)) {
    RequestDispatcher rd=request.getRequestDispatcher("AddServlet");
    rd.forward(request, response);
     }
     else if("Subtract".equals(option)) {
    	  RequestDispatcher rd=request.getRequestDispatcher("SubtractServlet");
    	    rd.forward(request, response);
       }
     else if("Multiply".equals(option)) {
    	  RequestDispatcher rd=request.getRequestDispatcher("MultiplyServlet");
  	    rd.forward(request, response);
     }
  	}

}
