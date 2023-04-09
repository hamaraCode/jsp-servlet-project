package CookiePackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/Bill"})
public class Bill extends HttpServlet{
	private static final long serialVersionUID = 1L;

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	List<String> li=new ArrayList<String>();
	
	Cookie arr[]=req.getCookies();
	if(arr!=null) {
		for(Cookie c:arr) {
			li.add(c.getValue());
		}
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
        	 out.print("<h2>"+s+"</h>");
         }
         out.print("<center>");
         out.print("</body>");
         out.print("</html>");

   }


}
