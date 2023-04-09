

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns = {"/MyServlet"})
public class MyServlet  extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	public void init()throws ServletException {
    System.out.println("Init called");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    res.setContentType("text/html");
    PrintWriter out=res.getWriter();
       out.write("<h1>Hello from service method</h1>");
   }

	@Override
	public void destroy() {
		System.out.println("Destroy method called");
	}
	
	
}
