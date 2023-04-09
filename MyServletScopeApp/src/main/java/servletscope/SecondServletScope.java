package servletscope;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SecondServlet")
public class SecondServletScope extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
    	
    	String nm=(String)request.getAttribute("reqData");
    	
    	
    	HttpSession session=request.getSession(false);
    	String nm1=(String)session.getAttribute("sessionData");
    	

		ServletContext sc = request.getServletContext();
		String nm3 = (String)sc.getAttribute("appData");
		
	
    response.setContentType("text/html");
    PrintWriter out=response.getWriter();
    out.print("<h1>Response object called</h1>"+nm);
    out.print("<h1>Session object called</h1>"+nm1);
    out.print("<h1>ServletContext object called</h1>"+nm3);
    out.flush();
    out.close();
    }

}
