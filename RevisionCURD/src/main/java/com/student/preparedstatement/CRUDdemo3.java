package com.student.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
 
public class CRUDdemo3 {
       public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connection","root","root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from Student;");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}	
}
