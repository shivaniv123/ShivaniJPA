package com.cg.dao;

import java.sql.Connection;

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
	public int addUser(Users user) throws LibException {
		// TODO Auto-generated method stub
		int id=0;
		
		logger.info("in add user");
		logger.info("input is"+user);
		
		String qry="insert into Users values()";
		
		return id;
	}

	@Override
	public String verifyUser(String username, String password)
			throws LibException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addBook(BookInventory book) throws LibException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public BookInventory removeBook(int id) throws LibException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int issue(BooksRegistration reg) throws LibException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public BooksTransaction showDetail(int user_id) throws LibException {
		// TODO Auto-generated method stub
		return null;
	}

}
