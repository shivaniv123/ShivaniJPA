package com.cg.author.dao;

import javax.persistence.EntityManager;

import com.cg.author.entities.Author;



public class AuthorDaoImpl implements AuthorDao {
	
	private EntityManager entityManager;

	public AuthorDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public void addAuthor(Author author) {
		// TODO Auto-generated method stub
		entityManager.persist(author);
	}

	@Override
	public void updateAuthor(Author author) {
		// TODO Auto-generated method stub
		entityManager.merge(author);
	}

	@Override
	public void removeAuthor(Author author) {
		// TODO Auto-generated method stub
		entityManager.remove(author);
	}

	

	@Override
	public Author getAuthorById(int id) {
		// TODO Auto-generated method stub
         Author author = entityManager.find(Author.class, id);
		return author;
		
	}

	@Override
	public void commitTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().commit();
	}

	@Override
	public void beginTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
		
	}

}
