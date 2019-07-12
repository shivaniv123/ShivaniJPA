package com.cg.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.IBook;
import com.cg.entities.Book;
import com.cg.entities.Hotel;

@Service
@Transactional
public class BookService implements IBookService {
  
	@Autowired
	private IBook BookDao;
	
	@Override
	public List<Hotel> loadAll() {
		// TODO Auto-generated method stub
		return BookDao.loadAll();
	}

	@Override
	public Object findHotel(int id) {
		// TODO Auto-generated method stub
		return BookDao.findHotel(id);
	}

	@Override
	public void saveBooking(Book book) {
		// TODO Auto-generated method stub
		BookDao.saveBooking(book);

	}

}
