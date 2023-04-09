package com.student.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
 
public class CRUDdemo4 {
       public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connection","root","root");
		PreparedStatement pd=con.prepareStatement("DELETE FROM Student2 WHERE name=?;");
		pd.setString(1, "Rama");
		pd.execute();
		System.out.println(" Record Deleted");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}	
}
