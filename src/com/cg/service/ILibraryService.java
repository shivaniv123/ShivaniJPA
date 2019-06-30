package com.cg.service;

import java.util.ArrayList;

import com.cg.dto.BookInventory;
import com.cg.dto.BooksRegistration;
import com.cg.dto.BooksTransaction;
import com.cg.dto.Users;
import com.cg.exception.LibException;

public interface ILibraryService {
	int addUser(Users user) throws LibException;
    void verifyUser(int userid,String password) throws LibException;
    
    int addBook(BookInventory book) throws LibException;
    BookInventory removeBook(int id) throws LibException;
	ArrayList <BookInventory> getAllBooks() throws LibException;

    
    int issue(BooksRegistration reg) throws LibException;
    
    BooksTransaction showDetail(int user_id) throws LibException;
    
    String librarian(int user_id) throws LibException;
	boolean validateName(String name);
	boolean validateEmail(String mail);
	boolean validateLib(String lib);
}