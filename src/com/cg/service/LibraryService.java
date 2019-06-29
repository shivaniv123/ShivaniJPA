package com.cg.service;

import java.util.regex.Pattern;

import com.cg.dao.ILibraryDao;
import com.cg.dao.LibraryDao;
import com.cg.dto.BookInventory;
import com.cg.dto.BooksRegistration;
import com.cg.dto.BooksTransaction;
import com.cg.dto.Users;
import com.cg.exception.LibException;

public class LibraryService implements ILibraryService {

	ILibraryDao dao;
	
	public void setDao(ILibraryDao dao)
	{
		this.dao= dao;
	}
	
	public LibraryService()
	{
		dao= new LibraryDao();
	}
	
	
	@Override
	public int addUser(Users user) throws LibException {
		// TODO Auto-generated method stub
		return dao.addUser(user);
	}

	@Override
	public void verifyUser(int userid, String password)
			throws LibException {
		// TODO Auto-generated method stub
		dao.verifyUser(userid, password);
	}

	@Override
	public int addBook(BookInventory book) throws LibException {
		// TODO Auto-generated method stub
		return dao.addBook(book);
	}

	@Override
	public BookInventory removeBook(int id) throws LibException {
		// TODO Auto-generated method stub
		return dao.removeBook(id);
	}

	@Override
	public int issue(BooksRegistration reg) throws LibException {
		// TODO Auto-generated method stub
		return dao.issue(reg);
	}

	@Override
	public BooksTransaction showDetail(int user_id) throws LibException {
		// TODO Auto-generated method stub
		return dao.showDetail(user_id);
	}

	@Override
	public String librarian(int user_id) throws LibException {
		// TODO Auto-generated method stub
		return dao.librarian(user_id);
	}

	@Override
	public boolean validateName(String name) {
		// TODO Auto-generated method stub
		String pattern="[A-Z]{1}[a-z]{2,}";
		if(Pattern.matches(pattern,name))
		{
			return true;
		}
		else
		{
			System.out.println("Invalid Pattern ::First letter has to be Capital");
			return false;
		}
		
	}

	@Override
	public boolean validateEmail(String mail) {
		// TODO Auto-generated method stub
		String pattern="[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+.[a-zA-Z]{2,4}";
		if(Pattern.matches(pattern,mail))
		{
			return true;
		}
		else
		{
			System.out.println("Please enter valid email address");
			return false;
		}
	}

	@Override
	public boolean validateLib(String lib) {
		// TODO Auto-generated method stub
		String pattern="[A-Z]{1}";
		if(Pattern.matches(pattern,lib))
		{
			return true;
		}
		else
		{
			System.out.println("Please enter Y- for Yes and N- for No");
			return false;
		}
	}

}
