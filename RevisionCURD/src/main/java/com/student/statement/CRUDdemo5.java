package com.student.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
 
public class CRUDdemo5 {
       public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connection","root","root");
		PreparedStatement pd=con.prepareStatement("UPDATE Student2  SET rno=?,name=? where rno=?;");
		pd.setInt(1, 101);
		pd.setString(2, "Anand");
		pd.setInt(3, 10);
		pd.execute();
		System.out.println(" Record Updated");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}	
}
