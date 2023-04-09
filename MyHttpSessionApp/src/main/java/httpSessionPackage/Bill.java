package httpSessionPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns= {"/Bill"})
public class Bill extends HttpServlet{
	private static final long serialVersionUID = 1L;

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	List<String> li=new ArrayList<String>();
	
    HttpSession session=req.getSession(true);
     
    String item=(String)session.getAttribute("Laptop");
    if(item!=null) {
			li.add(item);
	}
	
    item=(String)session.getAttribute("Iphone");
    if(item!=null) {
			li.add(item);
	}
    item=(String)session.getAttribute("Fan");
    if(item!=null) {
			li.add(item);
	}
    item=(String)session.getAttribute("Ac");
    if(item!=null) {
			li.add(item);
	}
    
    
    String item1=req.getParameter("item1");
    if(item1!=null) {
    	li.add(item1);
    }
    String item2=req.getParameter("item2");
    if(item2!=null) {
    	li.add(item2);
    }
    resp.setContentType("text/html");
    PrintWriter out=resp.getWriter();
         out.print("<html>");
         out.print("<head>");
         out.print("<title>Electronic page</title>");
         out.print("</head>");
         out.print("<body>");
         out.print("<center>");
         out.print("<h1>Selected items are:-</h1>");
         for(String s:li) {
        	 out.print("<h2>"+s+"</h2>");
         }
         out.print("<center>");
         out.print("</body>");
         out.print("</html>");

   }
	

}
