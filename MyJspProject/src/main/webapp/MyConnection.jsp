<%!
   int res;
    void div(int a,int b){
	res=a/b;
    }
%>
<%
      String s1=request.getParameter("Fnumber");
      String s2=request.getParameter("Snumber");
      int a=Integer.parseInt(s1);
      int b=Integer.parseInt(s2);
       div(a,b);
%>
<%=res%>