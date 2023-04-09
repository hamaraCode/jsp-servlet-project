package httpSessionPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(urlPatterns= {"/HomeAppliance"})
public class HomeAppliance extends HttpServlet{
	private static final long serialVersionUID = 1L;

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	String item1=req.getParameter("item1");
	HttpSession session=req.getSession(true);
    if(item1!=null) {
       session.setAttribute("Fan",item1);
    }
	
	String item2=req.getParameter("item2");
	if(item2!=null) {
		session.setAttribute("Ac",item2);
	}    resp.setContentType("text/html"); 
    PrintWriter out=resp.getWriter();
         out.print("<html>");
         out.print("<head>");
         out.print("<title>Electronic page</title>");
         out.print("</head>");
         out.print("<body>");
         out.print("<center>");
         out.print("<form action='Bill'>");
         out.print("<h1><input type='checkbox' name='item1' value='Gas'>Gas</h1>");
         out.print("<h1><input type='checkbox' name='item2' value='Bad'>Bad</h1>");
         out.print("<h1><input type='submit'  value='Next'></h1>");
         out.print("</form>");
         out.print("</center>");
         out.print("</body>");
         out.print("</html>");

   }


}
