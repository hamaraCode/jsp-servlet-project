

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   try {
		response.setContentType("text/html");
	    String name=request.getParameter("uname");
	    
	    PrintWriter out=response.getWriter();
	    
	    out.println("Welcome "+name);
	    
	    //appending the name in the url of second servlet
	      out.print("<a href='servlet2?uname="+name+"'>visit</a>");
	    
	    out.close();
} catch (Exception e) {
e.printStackTrace();
}
	
	}
}

class Demo implements Filter{

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
	}
	
}
