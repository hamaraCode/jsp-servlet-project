package com.student.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
 
public class CRUDdemo {
       public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connection","root","root");
        PreparedStatement pd=con.prepareStatement("create table Student2(rno int,name varchar(20),marks int,subject varchar(22));");
		pd.execute();
		System.out.println(" Table created");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}	
}
