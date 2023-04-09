package useJDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Types;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.ResultSetMetaData;

public class GetData {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connection","root", "root");
	      Statement s=con.createStatement();	
		   ResultSet rs=(ResultSet) s.executeQuery("select * from test2");
		   while(rs.next()) {
			   System.out.println(rs.getInt(1)+" "+rs.getString(2)+" ");				   
		   }
           System.out.println("-------------------------------------------------------------------------");
		   ResultSetMetaData rsmd=(ResultSetMetaData) rs.getMetaData();
	       System.out.println("Total coloum are "+rsmd.getColumnCount());
	       System.out.println("First coloum name "+rsmd.getColumnName(1));
	       System.out.println("Total coloum are "+rsmd.getColumnTypeName(1));

           System.out.println("-------------------------------------------------------------------------");

           DatabaseMetaData dbmd=con.getMetaData();  
	       System.out.println("Driver Name: "+dbmd.getDriverName());  
	       System.out.println("Driver Version: "+dbmd.getDriverVersion());  
	       System.out.println("UserName: "+dbmd.getUserName());  
	       System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
	       System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());  

           System.out.println("-------------------------------------------------------------------------");
//	       
//	       CallableStatement stmt=con.prepareCall("{?= call sum4(?,?)}");  
//	       stmt.setInt(2,10);  
//	       stmt.setInt(3,43);  
//	       stmt.registerOutParameter(1,Types	.INTEGER);  
//	       stmt.execute();  
//	       
	         con.close();
	       } catch (Exception e){
			e.printStackTrace();
		}
	}

}
