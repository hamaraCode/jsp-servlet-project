package connections;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
public class Aug30 {

	public static void main(String[] args) {
   try {
	   Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connection","root","root");
		   Statement s=con.createStatement();
		   s.execute("create table test1(id int primary key auto_increment,name varchar(20),age int(2))");
           con.close(); 
       System.out.println("Created successfully");
     }
     catch(ClassNotFoundException e) {
	   e.printStackTrace();
         }
     catch (SQLException e) {
	   e.printStackTrace();
	     }
    }
}



