
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class JDBCfetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try
      {
    	  
    	 Properties prop=new Properties();
    	 prop.load(new FileInputStream("jdbc.properties"));
    	 String driver=prop.getProperty("driver");
    	 String url=prop.getProperty("url");
    	 String username=prop.getProperty("username");
    	 String password=prop.getProperty("password");
    	 
    	 Class.forName(driver);
    	 
		Connection con=DriverManager.getConnection(url, username, password);
		String qry ="select * from trainee";
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
      } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	}
	}


