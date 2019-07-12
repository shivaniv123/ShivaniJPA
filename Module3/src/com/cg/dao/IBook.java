package com.cg.dao;

import java.util.List;
import com.cg.entities.Book;
import com.cg.entities.Hotel;



public interface IBook {
	public abstract List<Hotel> loadAll();
	public abstract Hotel findHotel(int id);
	public abstract void saveBooking (Book book);
}
