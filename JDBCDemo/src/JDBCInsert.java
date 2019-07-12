import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class JDBCInsert {

	static Connection con;
	static{
	try{
		 
  	  Class.forName("oracle.jdbc.driver.OracleDriver");//loads the drive:loads the .class files 
  	  String url= "jdbc:oracle:thin:@localhost:1521:XE";
		String username="system";
		String password="sys";
		con=DriverManager.getConnection(url, username, password);
	}
	 catch(Exception e)
    {
  	 System.out.println(e.getMessage());
  	 
    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
	      {
	    	 
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Name :");
			String name=sc.next();
			System.out.println("Enter Date :");
			String iDate =sc.next();
			DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate date=LocalDate.parse(iDate,format);
			
			String qry ="insert into trainee values(t_sq.nextval,?,?)";
			PreparedStatement pstmt=con.prepareStatement(qry);
			pstmt.setString(1,name);
			java.sql.Date sdate	=java.sql.Date.valueOf(date);
			pstmt.setDate(2,sdate);
			
			int row=pstmt.executeUpdate();
			if(row > 0)
			{
				int id=getId();
				System.out.println("Inserted Record and id is "+id);
			}
	      }
			 catch(Exception e)
			    {
			  	 System.out.println(e.getMessage());
			  	 
			    }
		
	      
	}
	public static int getId()
	{
		int id=0;
		 try
	      {
	    	  
	    	 
			
			String qry="select t_sq.currval from dual";
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(qry);
			if(rs.next())
			id=rs.getInt(1);
		}
	      catch(Exception e)
	      {
	    	 System.out.println(e.getMessage());
	    	 
	      }
		 return id;
	}
	}
	


