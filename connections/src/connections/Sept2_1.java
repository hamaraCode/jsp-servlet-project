package connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;


public class Sept2_1 {
	public static void main(String[] args) {
		
		try {
	    Class.forName("com.mysql.jdbc.Driver");
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connection","root","root");

	    CallableStatement s=con.prepareCall("{call test1(?)}");
	    s.setInt(1, 1);
	    s.executeUpdate(); 
	    con.close();
	    System.out.println("Done..........................");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		}}
