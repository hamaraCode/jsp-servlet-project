package useJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MyData {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connection","root", "root");
			String str="create table Test(id int primary key,name varchar(20));";
			Statement s=con.createStatement();
			int i=s.executeUpdate(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
