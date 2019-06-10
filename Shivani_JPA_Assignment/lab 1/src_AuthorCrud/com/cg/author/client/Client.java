package com.cg.author.client;

import com.cg.author.entities.Author;
import com.cg.author.service.AuthorService;
import com.cg.author.service.AuthorServiceImpl;




public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AuthorService service = new AuthorServiceImpl();
		
		Author author = new Author();
	//	author.setAuthorId(104);
		author.setFirstName("Chetan");
		author.setMiddleName("Ram");
		author.setLastName("Bhagat");
		author.setPhoneNo(123457890);
		service.addAuthor(author);
		
		author = service.findAuthorById(104);
		System.out.print("ID:"+author.getAuthorId());
		System.out.println("First Name:"+author.getFirstName());
		System.out.println("Middle Name:"+author.getMiddleName());
		System.out.println("Last Name:"+author.getLastName());
		
		author.setFirstName("neetan");
		service.updateAuthor(author);
		
		//at this breakpoint, we have updated record added in first section
		author = service.findAuthorById(104);
		System.out.print("ID:"+author.getAuthorId());
		System.out.println(" Name:"+author.getFirstName());
		
		//at this breakpoint, record is removed from table
	//	service.removeAuthor(author);
	//	System.out.println("End of program...");
	}

}
