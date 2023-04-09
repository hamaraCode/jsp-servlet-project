package com.student.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
 
public class CRUDdemo2 {
       public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connection","root","root");
		String str="insert into student(rno,name,marks,subject)values(101,'Anand',87,'English'),(102,'Ajay',90,'Hindi');";	
		Statement st=con.createStatement();
		int i=st.executeUpdate(str);
		System.out.println(i+" record inserted");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}	
}
