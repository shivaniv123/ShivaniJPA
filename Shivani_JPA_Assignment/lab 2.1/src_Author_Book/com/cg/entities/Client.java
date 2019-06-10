package com.cg.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Book b1 = new Book();
		b1.setISBN(1001);
		b1.setTitle("Knowledge For fun");
		b1.setPrice(450);
		
		Book b2 = new Book();
		b2.setISBN(1002);
		b2.setTitle("Mathematics");
		b2.setPrice(450);
		
		Book b3 = new Book();
		b3.setISBN(1003);
		b3.setTitle("Something between Us");
		b3.setPrice(200);
		
		
		Author a1=new Author();
		a1.setId(1001);
		a1.setName("Shweta Rana");
		
		Author a2=new Author();
		a2.setId(1002);
		a2.setName("R D Sharma");
		
		Author a3=new Author();
		a3.setId(1003);
		a3.setName("Radhika Aapte");
		
		a1.addBook(b1);
		a2.addBook(b2);
		a3.addBook(b3);
		
		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		
		System.out.println("Entry done.");

		em.getTransaction().commit();
		em.close();
		factory.close();
	}

}
