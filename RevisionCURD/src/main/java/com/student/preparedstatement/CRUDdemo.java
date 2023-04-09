package com.student.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
 
public class CRUDdemo {
       public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connection","root","root");
		String str="create table Student(rno int,name varchar(20),marks int,subject varchar(22));";	
		Statement st=con.createStatement();
		st.executeUpdate(str);
		System.out.println(" Table created");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}	
}
