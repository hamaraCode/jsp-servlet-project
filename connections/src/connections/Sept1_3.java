package connections;

import java.sql.*;
import java.util.Scanner;

public class Sept1_3 {
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id of the element to update");
		int delId=sc.nextInt();
		
		try {
	    Class.forName("com.mysql.jdbc.Driver");
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connection","root","root");
	    Statement p=con.createStatement();
	      String str="update test1 set name='uuuuuu' where id= "+delId;
	      int i=p.executeUpdate(str);
	      System.out.println(i+" Record updated");
	       con.close();
	       
	       /*using prepared statement
	       PreparedStatement p=con.PreparedStatement("delete from test1 where id= "+delId);
	       	      int i=p.executeUpdate();

	       */
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		}

	}


