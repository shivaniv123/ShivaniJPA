import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class JDBCUpdate {

	
		// TODO Auto-generated method stub
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
				System.out.println("Enter Id :");
				int Id=sc.nextInt();
				System.out.println("Enter Date :");
				String iDate =sc.next();
				DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate date=LocalDate.parse(iDate,format);
				
				String qry ="update trainee set tdate=? where t_id=?";
				PreparedStatement pstmt=con.prepareStatement(qry);
				pstmt.setInt(2,Id);
				java.sql.Date sdate	=java.sql.Date.valueOf(date);
				pstmt.setDate(1,sdate);
				
				int row=pstmt.executeUpdate();
				if(row > 0)
				{
					
					System.out.println("update Record ");
				}
		      }
				 catch(Exception e)
				    {
				  	 System.out.println(e.getMessage());
				  	 
				    }
			
		      
		
	}

}
