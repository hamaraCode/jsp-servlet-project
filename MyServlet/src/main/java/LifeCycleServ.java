

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns= {"/cycle"})
public class LifeCycleServ extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		System.out.println(">>>>>>>>> init Method called >>>>>>>>");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("=======service method called==========");
	res.setContentType("text/html");
	PrintWriter out=res.getWriter();
	out.println("<h1>Hello Servlet</h1>");
	out.println("<h1>Hello Servlet</h1>");
	}
	@Override
	public void destroy() {
		System.out.println("<<<<<<<<destroy method called<<<<<<<< ");
	}
	
}
