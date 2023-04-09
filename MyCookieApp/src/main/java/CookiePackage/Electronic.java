package CookiePackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/Electronic"})
public class Electronic extends HttpServlet{
	private static final long serialVersionUID = 1L;

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

resp.setContentType("text/html");
PrintWriter out=resp.getWriter();
         out.print("<html>");
         out.print("<head>");
         out.print("<title>Electronic page</title>");
         out.print("</head>");
         out.print("<body>");
         out.print("<center>");
         out.print("<form action='Electric' >");
         out.print("<h1><input type='checkbox' name='item1' value='Laptop'>Laptop</h1>");
         out.print("<h1><input type='checkbox' name='item2' value='Iphone'>Iphone</h1>");
         out.print("<h1><input type='submit'  value='Next'></h1>");
         out.print("</form>");
         out.print("</center>");
         out.print("</body>");
         out.print("</html>");

   }


}
