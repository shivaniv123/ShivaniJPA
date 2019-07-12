package com.cg.service;

import java.util.List;

import com.cg.entities.Book;
import com.cg.entities.Hotel;



public interface IBookService {
	public abstract List<Hotel> loadAll();

	public abstract Object findHotel(int parseInt);

	public abstract void saveBooking(Book book);
}
