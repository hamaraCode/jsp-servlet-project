package connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Aug31 {
public static void main(String[] args) {
	try {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connection","root","root");
	Statement s=con.createStatement();
	s.execute("insert into test1(name,age)values('fanan',62)");
	con.close();
	System.out.println("Done successfully");
	}catch (ClassNotFoundException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	}
}
