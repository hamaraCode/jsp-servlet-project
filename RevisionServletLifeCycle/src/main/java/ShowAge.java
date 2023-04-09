

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getdata")
public class ShowAge extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String age=request.getParameter("age");
		PrintWriter out=response.getWriter();
        response.setContentType("text/html");
        out.write("<h1>Your age is : </h1>"+age);
        out.close();
	}
}
