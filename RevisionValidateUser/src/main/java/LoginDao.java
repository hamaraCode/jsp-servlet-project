import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class LoginDao {

		public static boolean validate(int uid,String upass){  
			boolean flag=false;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql//localhost:3306/connection","root","root");
				PreparedStatement p=con.prepareStatement("select  uid,upass from user2 ");
				ResultSet rs=(ResultSet) p.executeQuery();
				int id=rs.getInt(1);
                String pass =rs.getString(2);
				if(id==uid&&upass==pass) {
				flag=true;
				}
	       }
			catch (Exception e) {
		     e.printStackTrace();
			}
			return flag;
}
	}
