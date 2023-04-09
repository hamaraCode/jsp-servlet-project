import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = {"/HelloServlet"})
public class SecondServlet extends GenericServlet{

	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("this is generic Servlet");
		arg1.setContentType("text/html");
		PrintWriter out=arg1.getWriter();
		out.println("<h1>Hello from Generic Servlet</h1>");
	}

}
