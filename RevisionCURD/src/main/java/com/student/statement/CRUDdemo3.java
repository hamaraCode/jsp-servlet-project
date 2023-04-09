package com.student.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
 
public class CRUDdemo3 {
       public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connection","root","root");
		Statement st=con.createStatement();
		PreparedStatement pd=con.prepareStatement("select * from Student2");
       ResultSet rs=pd.executeQuery();
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
