import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCfetchwithId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try
	      {
	    	  
	    	  Class.forName("oracle.jdbc.driver.OracleDriver");//loads the drive:loads the .class files 
	    	  String url= "jdbc:oracle:thin:@localhost:1521:XE";
			String username="system";
			String password="sys";
			Connection con=DriverManager.getConnection(url, username, password);
			String qry ="select * from trainee where t_Id=1002";
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(qry);
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString("tName"));
				System.out.println(rs.getDate(3));
			}
	      }
	      catch(SQLException | ClassNotFoundException e)
	      {
	    	 System.out.println(e.getMessage());
	    	  e.printStackTrace();
	      }
	}

}
