
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	HttpSession httpSession=request.getSession(true);
	int uid=(int) httpSession.getAttribute("uid");
	PrintWriter out=response.getWriter();
	out.write("<h1>Welcome to Profile Servlet</h1>");
	out.write("<h4>Your user id is: </h4>"+uid);
	out.write("<a href='logout'>Logout</a>");
	out.close();
	}
}