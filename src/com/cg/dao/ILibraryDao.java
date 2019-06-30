package com.cg.dao;

import com.cg.dto.BookInventory;
import com.cg.dto.BooksRegistration;
import com.cg.dto.BooksTransaction;
import com.cg.dto.Users;
import com.cg.exception.LibException;

public interface ILibraryDao {
  
	    int addUser(Users user) throws LibException;
	    String verifyUser(String username,String password) throws LibException;
	    
	    int addBook(BookInventory book) throws LibException;
	    BookInventory removeBook(int id) throws LibException;
	    
	    int issue(BooksRegistration reg) throws LibException;
	    
	    BooksTransaction showDetail(int user_id) throws LibException;
}
