package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.entities.Book;
import com.cg.entities.Hotel;

@Repository
public class Bookimpl implements IBook {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Hotel> loadAll() {
		// TODO Auto-generated method stub
		TypedQuery<Hotel> query = entityManager.createQuery("SELECT det FROM Hotel det",Hotel.class);
		return query.getResultList();
	}

	@Override
	public Hotel findHotel(int id) {
		// TODO Auto-generated method stub
		return entityManager.find(Hotel.class,id);
	}

	@Override
	public void saveBooking(Book book) {
		// TODO Auto-generated method stub
		entityManager.persist(book);
		entityManager.flush();
	}

}
