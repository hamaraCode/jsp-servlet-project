

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

@WebServlet("/GetCooky")
public class GetCooky extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out=response.getWriter();
        response.setContentType("text/html");
    	List<String> li=new ArrayList<String>();
    	
    	Cookie arr[]=request.getCookies();
    	if(arr!=null) {
    		for(Cookie c:arr) {
    			li.add(c.getValue());
    		}
    	
    	
    	String item1=request.getParameter("operation");
        if(item1!=null) {
        	li.add(item1);
        }
    	String item2=request.getParameter("name");
    	if(item2!=null) {
        	li.add(item2);
        }
        for(String s:li) {
       	 out.write("<h2>"+s+"</h>");
        }
        out.close();
	}
}
}
