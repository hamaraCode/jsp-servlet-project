package connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Aug31_2 {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connection","root","root");
		Statement s=con.createStatement();
		
		//Using Execute method--->
		//s.execute("create table test2(id int primary key,name varchar(20),age int(2))");
		
		//Using ExecuteQuery for select method--->
        //ResultSet rs=s.executeQuery("select * from test1 ");
		//while(rs.next()) {
        //System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" ");
        //}
		
		//Using ExecuteUpdate for Insert Update and 	delete
		int i=s.executeUpdate("update test1 set name='lasan' where name='anand'");
		System.out.println(i+" Record updated");
		con.close();
		System.out.println("Done successfully");
	} catch (Exception e) {
		// TODO: handle exception
   e.printStackTrace();
	}
}
}
