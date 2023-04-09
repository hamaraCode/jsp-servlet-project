package com.student.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
 
public class CRUDdemo4 {
       public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connection","root","root");
		String str="DELETE FROM Student WHERE name='Raghu';";	
		Statement st=con.createStatement();
		st.executeUpdate(str);
		System.out.println(" Record Deleted");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}	
}
