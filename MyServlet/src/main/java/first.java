
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/hello"})
public class first extends HttpServlet {

/**
	 *
	 */ 
	private static final long serialVersionUID = 1L;

@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
resp.setContentType("text/plain");
PrintWriter out=resp.getWriter();
out.print("Hello servlet");
out.flush();
out.close();
}
}
