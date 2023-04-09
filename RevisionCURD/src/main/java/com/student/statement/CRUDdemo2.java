package com.student.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
 
public class CRUDdemo2 {
       public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connection","root","root");
		String str="insert into student2(rno,name,marks,subject)values(?,?,?,?),(?,?,?,?);";	
		PreparedStatement ps=con.prepareStatement(str);
		ps.setInt(1, 10);
		ps.setString(2, "Ram");
		ps.setInt(3, 80);
		ps.setString(4, "Maths");
		ps.setInt(5, 11);
		ps.setString(6, "Rama");
		ps.setInt(7, 90);
		ps.setString(8, "English");
		ps.execute();
		System.out.println(" Record inserted");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}	
}
