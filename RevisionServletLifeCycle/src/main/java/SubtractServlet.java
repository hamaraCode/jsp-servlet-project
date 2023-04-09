

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SubtractServlet")
public class SubtractServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 String n1=request.getParameter("num1");
			String n2=request.getParameter("num2");
			int num1=Integer.parseInt(n1);
			int num2=Integer.parseInt(n2);
			int result=num1-num2;
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			out.write("<h1>Subtraction is: </h1>"+result);
			out.close();
	}

}
