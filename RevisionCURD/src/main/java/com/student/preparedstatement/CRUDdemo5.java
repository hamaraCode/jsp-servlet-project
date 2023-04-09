package com.student.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
 
public class CRUDdemo5 {
       public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connection","root","root");
		String str="UPDATE Student SET rno=10,name='Raghu' where rno=101;";	
		Statement st=con.createStatement();
		st.executeUpdate(str);
		System.out.println(" Record Updated");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}	
}
