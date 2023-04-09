package connections;

import java.sql.*;

public class Sept1_1 {
	public static void main(String[] args) {
	
	try {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connection","root","root");
    Statement s=con.createStatement();
    String str="select * from test1";
      ResultSet rs=s.executeQuery(str);
      while(rs.next()) {
    	  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
      }
      con.close();
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	}

}
