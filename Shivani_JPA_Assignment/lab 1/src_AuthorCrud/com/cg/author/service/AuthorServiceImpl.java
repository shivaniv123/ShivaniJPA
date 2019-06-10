package com.cg.author.service;

import com.cg.author.dao.AuthorDao;
import com.cg.author.dao.AuthorDaoImpl;
import com.cg.author.entities.Author;



public class AuthorServiceImpl implements AuthorService {
	

	private AuthorDao dao;

	public AuthorServiceImpl() {
		dao = new AuthorDaoImpl();
	}
	

	@Override
	public void addAuthor(Author Author) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.addAuthor(Author);
		dao.commitTransaction();
		
	}

	@Override
	public void updateAuthor(Author Author) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.updateAuthor(Author);
		dao.commitTransaction();
	}

	@Override
	public void removeAuthor(Author Author) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.removeAuthor(Author);
		dao.commitTransaction();
		
	}

	@Override
	public Author findAuthorById(int id) {
		// TODO Auto-generated method stub
		Author author  = dao.getAuthorById(id);
		return author;
	}

}
