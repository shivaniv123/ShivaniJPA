package com.cg.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

import org.apache.log4j.Logger;

import com.cg.dto.BookInventory;
import com.cg.dto.BooksRegistration;
import com.cg.dto.BooksTransaction;
import com.cg.dto.Users;
import com.cg.util.DBUtil;
import com.cg.exception.LibException;
import com.cg.logger.MyLogger;

public class LibraryDao implements ILibraryDao {
	
	Connection con;
	Logger logger;
	
	public LibraryDao()
	{
		con=DBUtil.getConnect();
		logger=MyLogger.getLogger();
	}

	@Override
	public int addUser(Users user) throws LibException //to add new user
	{
		// TODO Auto-generated method stub
		int id=0;
		
		logger.info("in add user");
		logger.info("input is"+user);
		
		String qry="insert into users values(uId_seq.nextval,?,?,?,?)";
		
		String name=user.getUser_name();
		String password=user.getPassword();
		String email=user.getEmail_id();
		String lib=user.isLibrarian();
		
		
		try {
			PreparedStatement pstmt=con.prepareStatement(qry);
			pstmt.setString(1, name);
			pstmt.setString(2, password);
			pstmt.setString(3, email);
			pstmt.setString(4,String.valueOf(lib));
			int row=pstmt.executeUpdate();
			if(row > 0)
			{
				id=getuserId();
				logger.info("inserted successfully and id is ="+id);
				
			}
			else
			{
				throw new LibException("unable to insert "+user);
			}
	
		}
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			logger.error("error in insert  = "+e.getMessage());
			throw new LibException(e.getMessage());
		}
		
		return id;
	}

	private int getuserId() throws LibException {
		// TODO Auto-generated method stub
		logger.info("in get user id");
		int id=0;
		String qry="select uId_seq.currval from dual";
		try{
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(qry);
		if(rs.next())
		{
			id=rs.getInt(1);
			logger.info("got message with id  :"+id);
		}
		}
		catch(SQLException e)
		{
			logger.error("error"+e.getMessage());
			throw new LibException(e.getMessage());
		}
		logger.info("completed get userid");
		return id;
	}

	@Override
	public void verifyUser(int userid, String password)
			throws LibException //for verification of user
	{
		String qry="select user_id,password from users where user_id=? and password=?";
		
		try {
			PreparedStatement pstmt=con.prepareStatement(qry);
			pstmt.setInt(1,userid);
			pstmt.setString(2,password);
			ResultSet rs=pstmt.executeQuery();
	    	if(rs.next())
	    	{
	    		System.out.println("Successful Login!!!!");
	    	}
	    	else
	    		System.out.println("Invalid Username OR Password");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new LibException(e.getMessage());
		}

		
	}

	@Override
	public int addBook(BookInventory book) throws LibException {
		// TODO Auto-generated method stub
int id=0;
		
		logger.info("in add user");
		logger.info("input is"+book);
		
		String qry="insert into Book_inventory values(bId_seq.nextval,?,?,?,?,?)";
		
		String name=book.getBook_name();
		String author1 =book.getAuthor1();
		String author2=book.getAuthor2();
		String publisher =book.getPublisher();
		int year=book.getYearofpublisher();
		
		
		try {
			PreparedStatement pstmt=con.prepareStatement(qry);
			pstmt.setString(1, name);
			pstmt.setString(2, author1);
			pstmt.setString(3, author2);
			pstmt.setString(4, publisher);
			pstmt.setInt(5, year);
			int row=pstmt.executeUpdate();
			if(row > 0)
			{
				id=book.getBook_id();
				logger.info("inserted successfully and id is ="+id);
				
			}
			else
			{
				throw new LibException("unable to insert "+book);
			}}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				logger.error("error in insert  = "+e.getMessage());
				throw new LibException(e.getMessage());
			}
			
			return id;
	}

	@Override
	public BookInventory removeBook(int id) throws LibException {
		// TODO Auto-generated method stub
		BookInventory bookInv=null;
		 String qry="delete from Book_inventory where Book_Id=?";
		    try
		    {
		    	PreparedStatement pstmt=con.prepareStatement(qry);
		    	pstmt.setInt(1,id);
		    	bookInv =getBookById(id);
		    	int row=pstmt.executeUpdate();
		    	if(bookInv==null)
		    		
		    	{
		    		throw new LibException("book with id "+id+"not found");
		    	}
		    	else if(row > 0)
		    	{
		    		System.out.println("Deleted book with id "+id);
		    	}
		    }
		    catch(SQLException e)
		    {
		    	throw new LibException(e.getMessage());
		    }
			
		
		return bookInv;
	}

	private BookInventory getBookById(int id) throws LibException{
		// TODO Auto-generated method stub
		BookInventory book=null;
		String qry="select * from Book_Inventory where Book_Id=?";
		try
		{
			PreparedStatement pstmt=con.prepareStatement(qry);
	    	pstmt.setInt(1,id);
	    	ResultSet rs=pstmt.executeQuery();
	    	if(rs.next())
	    			{
	    		int id1=rs.getInt(1);
	    		String name=rs.getString(2);
	    		String author1=rs.getString(3);
	    		String author2=rs.getString(4);
	    		String publisher=rs.getString(5);
	    		int year=rs.getInt(6);

	    		book= new BookInventory(id1,name,author1,author2,publisher,year);
	    		
	    			}
	    	else
	    		throw new LibException("BOOK WITH ID "+id+"not found");
		}
		catch(SQLException e)
		{
			throw new LibException(e.getMessage());
			}
		return book;
		
	}

	@Override
	public int issue(BooksRegistration reg) throws LibException {
		// TODO Auto-generated method stub
		int id=0;
		logger.info("in issue book");
		logger.info("input is"+reg);
		
		String qry="insert into Book_Registration values(rId_seq.nextval,?,?,sysdate)";
		
		int bookid=reg.getBook_id();
		int userid=reg.getUser_id();
		LocalDate Date=LocalDate.now();
	//	java.sql.Date date=java.sql.Date.valueOf(Date);
		try
		{
			PreparedStatement pstmt=con.prepareStatement(qry);
			pstmt.setInt(1, bookid);
			pstmt.setInt(2,userid);
		//	pstmt.setDate(3, date);
			int row=pstmt.executeUpdate();
			if(row > 0)
			{
				id=getRegid();
				logger.info("inserted successfully and id is ="+id);
				Book_transaction(id,Date);
				System.out.println("transaction updated");

			}
			else
			{
				throw new LibException("unable to insert "+reg);
			}
			
		}
		catch(SQLException e)
		{
			logger.error("error in insert  = "+e.getMessage());
			throw new LibException(e.getMessage());
		}
		return id;
		
	}


	 public int getRegid() throws LibException {
		// TODO Auto-generated method stub
		logger.info("in get user id");
		int id=0;
		String qry="select rId_seq.currval from dual";
		try{
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(qry);
		if(rs.next())
		{
			id=rs.getInt(1);
			logger.info("got message with id  :"+id);
		}
		}
		catch(SQLException e)
		{
			logger.error("error"+e.getMessage());
			throw new LibException(e.getMessage());
		}
		logger.info("completed get userid");
		return id;
	}

	private void Book_transaction(int id, LocalDate date) throws LibException{
		// TODO Auto-generated method stub
		
		   String qry="insert into Book_transaction values(tId_seq.nextval,?,?,?,?)";
		  
		   LocalDate today=LocalDate.now();
			int reg_id=id;
			LocalDate Issue=date;
			LocalDate Return = Issue.plusDays(14);
			  Period diff=Return.until(today);
			  int days= diff.getDays();
			  java.sql.Date date1=java.sql.Date.valueOf(Issue);
			  java.sql.Date date2=java.sql.Date.valueOf(Return);
			  
				try {
					PreparedStatement pstmt=con.prepareStatement(qry);
					pstmt.setInt(1,reg_id);
					pstmt.setDate(2,date1);
					pstmt.setDate(3,date2);
					pstmt.setInt(4,days);
					int row=pstmt.executeUpdate();
					if(row > 0)
					{
						int transid=getTranscationId();
						logger.info("inserted successfully"+transid);
						
					}
					else
					{
						throw new LibException("unable to insert ");
					}
					
				
				}
				catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
	

	private int getTranscationId() throws LibException {
		logger.info("in get transcation id");
		int id=0;
		String qry="select tId_seq.currval from dual";
		try{
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(qry);
		if(rs.next())
		{
			id=rs.getInt(1);
			logger.info("got message with id  :"+id);
		}
		}
		catch(SQLException e)
		{
			logger.error("error"+e.getMessage());
			throw new LibException(e.getMessage());
		}
		logger.info("completed get id");
		return id;
		
	}

	@Override
	public BooksTransaction showDetail(int id) throws LibException {
		// TODO Auto-generated method stub
		BooksTransaction book=null;
		String qry="select * from Book_transaction where REGISTRATION_ID=? ";
		try
		{
			PreparedStatement pstmt=con.prepareStatement(qry);
	    	pstmt.setInt(1,id);
	    	ResultSet rs=pstmt.executeQuery();
	    	if(rs.next())
	    			{
	    		int t_id=rs.getInt(1);
	    		int u_id=rs.getInt(2);
	    		Date issue=rs.getDate(3);
	    		Date Return=rs.getDate(4);
	    		int fine=rs.getInt(5);


	    		book= new BooksTransaction(t_id,u_id,issue,Return,fine);
	    		
	    			}
	    	else
	    		throw new LibException("registration WITH ID "+id+"not found");
		}
		catch(SQLException e)
		{
			throw new LibException(e.getMessage());
			}
		return book;
	}

	@Override
	public String librarian(int id) throws LibException {
		// TODO Auto-generated method stub
		String y="";
		String qry="select librarian from Users where USER_ID=? ";
		try
		{
			PreparedStatement pstmt=con.prepareStatement(qry);
	    	pstmt.setInt(1,id);
	    	ResultSet rs=pstmt.executeQuery();
	    	if(rs.next())
	    			{
	    		String lib=rs.getString(1);
	    		    y=lib;
	    			}
	    	else
	    		throw new LibException("USER WITH ID "+id+"not found");
		}
		catch(SQLException e)
		{
			throw new LibException(e.getMessage());
			}
		return y;
	}

	@Override
	public ArrayList<BookInventory> getAllBooks() throws LibException {
		// TODO Auto-generated method stub
		ArrayList <BookInventory> list=new ArrayList <BookInventory>();
		String qry="select * from Book_inventory";
		
		Statement stmt;
		try {
			stmt = con.createStatement();
			ResultSet rs=stmt.executeQuery(qry);
			
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String author1=rs.getString(3);
				String author2=rs.getString(4);
				String publisher=rs.getString(5);
				int yearofpublisher=rs.getInt(6);
				
				BookInventory emp=new BookInventory(id,name,author1,author2,publisher,yearofpublisher);
				list.add(emp);
				
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new LibException(e.getMessage());
		}

		return list;
	}

	@Override
	public ArrayList<BooksTransaction> getAlltrans() throws LibException {
		// TODO Auto-generated method stub
		ArrayList <BooksTransaction> list=new ArrayList <BooksTransaction>();
		String qry="select * from Book_Transaction";
		Statement stmt;

		try {		
			stmt = con.createStatement();
			ResultSet rs=stmt.executeQuery(qry);
			
			while(rs.next())
			{
				int transid=rs.getInt(1);
				int regid=rs.getInt(2);
				 Date issue=rs.getDate(3);
				 Date Return=rs.getDate(4);
				 int fine=rs.getInt(5);
				 
				 BooksTransaction book= new BooksTransaction(transid,regid,issue,Return,fine);
					list.add(book);

			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new LibException(e.getMessage());
		}
		return list;
	}

	@Override
	public int get_Reg_Id(int id) throws LibException {
		// TODO Auto-generated method stub
		int reg=0;
		String qry="select REGISTRATION_ID from book_registration where USER_ID=?";
		try
		{
			PreparedStatement pstmt=con.prepareStatement(qry);
	    	pstmt.setInt(1,id);
	    	ResultSet rs=pstmt.executeQuery();
	    	if(rs.next())
	    			{
	    		 reg=rs.getInt(1);
	    		    
	    			}
	    	else
	    		throw new LibException("USER WITH ID "+id+"not found");
		}
		catch(SQLException e)
		{
			throw new LibException(e.getMessage());
			}
		return reg;
	}

}