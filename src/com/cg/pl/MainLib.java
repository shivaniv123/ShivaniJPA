package com.cg.pl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import com.cg.dto.BookInventory;
import com.cg.dto.BooksRegistration;
import com.cg.dto.BooksTransaction;
import com.cg.dto.Users;
import com.cg.exception.LibException;
import com.cg.service.ILibraryService;
import com.cg.service.LibraryService;

public class MainLib {

	static ILibraryService service= new LibraryService();
	
	public static void main(String[] args) {
		
		int c1=0;
		Scanner sc=new Scanner(System.in);
		do{
			
			System.out.println("***********************");
			System.out.println("Welcome To Your Library");
			System.out.println("***********************");
            System.out.println("--Enter Your Choice--" );
            System.out.println("1.Registration");
            System.out.println("2.Login");
            System.out.println("3.Exit");
			c1 = sc.nextInt();
            switch(c1)
            {
           
            case 1:{ Users user= acceptUserDetails();
            if(user!=null){
            try {
				int id= service.addUser(user);
				System.out.println("inserted User and id = "+id);

			} catch (LibException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}}
           
            }break;
            case 2:{
            	System.out.println("Enter User ID :");
            	int userid=sc.nextInt();
            	System.out.println("Enter password");
                 String password=sc.next();
            	try {
				service.verifyUser(userid, password);
				String lib=service.librarian(userid);
            		
            		System.out.println(lib);
            		String y="Y";
            		
				if(lib.equals(y)){
					System.out.println("**Enter Your Choice :**");
					System.out.println("1.Add Books");
					System.out.println("2.Remove Books");
					System.out.println("3.Show All Book Issued");
					System.out.println("4.Exit");
					c1=sc.nextInt();
					switch(c1){
					case 1:{
						BookInventory book=acceptBook();
						int id=service.addBook(book);
						System.out.println("inserted book and id = "+id);
						}
					break;
					case 2:{System.out.println("enter book ID :");
					int id=sc.nextInt();
					BookInventory book=service.removeBook(id);
					System.out.println("remove book and id = "+id);
					}break;
					case 3:{try{ArrayList<BookInventory>list = 
							service.getAllBooks();
							for(BookInventory obj : list)
							{
								System.out.println(obj);
							}
							}
							catch(LibException e)
							{
								System.out.println(e.getMessage());
							}
						
						
					}break;
					case 4:{
						System.exit(0);
					}break;
					default:System.out.println("invalid Choice...!!!");
				}
				}
				else{do{
					System.out.println("**Enter Choice**");
					System.out.println("1.Show Books");
					System.out.println("2.Issue a book");
					System.out.println("3.Show book Issued details");
					System.out.println("4.Exit");
					c1=sc.nextInt();
					switch(c1)
					{
					case 1:{try{ArrayList<BookInventory>list = 
							service.getAllBooks();
							for(BookInventory obj : list)
							{
								System.out.println(obj);
							}
							}
							catch(LibException e)
							{
								System.out.println(e.getMessage());
							}
						
					}break;
					case 2:{
						BooksRegistration reg=issue();
						int id=service.issue(reg);
						System.out.println("issued book and id = "+id);
						}
					break;
					case 3:{
						BooksTransaction book= service.showDetail(userid);
						System.out.println("Book Details Of "+userid+" i :");
						System.out.println(book);
					}break;
					case 4:System.exit(0);
					break;
					default:System.out.println("Invalid Choice....!!!!!");
						
					}System.out.println("do you want to continue 1-yes 0-No");
		            c1 = sc.nextInt();	
				}while(c1!=0);
					
				}
					
					
					
				} catch (LibException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
            
            }
            case 3:System.exit(0);
            break;
            default:System.out.println("Invalid Choice....");
            
           }
            System.out.println("do you want to continue 1-yes 0-No");
            c1 = sc.nextInt();	
		}while(c1!=0);
	}

	private static BooksRegistration issue() {
		// TODO Auto-generated method stub
		BooksRegistration book=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Book ID:");
		int b=sc.nextInt();
		System.out.println("Enter User ID:");
		int u=sc.nextInt();
	 //   LocalDate day=LocalDate.now();
		
	    book=new BooksRegistration();
	    book.setBook_id(b);
	    book.setUser_id(u);
	   // book.setReg_date(day);

		return book;
	}

	private static BookInventory acceptBook() {
		// TODO Auto-generated method stub
		BookInventory book=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Book Name");
		String name=sc.next();
		System.out.println("Enter 1st Author");
		String a1=sc.next();

		System.out.println("Enter 2nd Author");
		String a2=sc.next();

		System.out.println("Enter publisher");
		String publish=sc.next();

		System.out.println("Enter Year of Publish");
		int year=sc.nextInt();
		
		book=new BookInventory();
		book.setBook_name(name);
		book.setAuthor1(a1);
		book.setAuthor2(a2);
		book.setPublisher(publish);
		book.setYearofpublisher(year);
		
		
		return book;
	}

	private static Users acceptUserDetails() {
		// TODO Auto-generated method stub
		Users user=null;
		String pass;
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Enter User Name :");
			String name=sc.next();
			if(!service.validateName(name))
			{
				
				continue;
			}
			else
			{
				System.out.println("Enter Password :");
				 pass=sc.next();
				
				}
			System.out.println("Enter email ID :");
			String mail=sc.next();
			if(!service.validateEmail(mail))
			{
				
				continue;
			}
			else
			{
				System.out.println("Are You a Librarian?");
				System.out.println("If Yes-Y or No-N");
				String lib=sc.next();
				if(!service.validateLib(lib))
				{
					System.out.println("Please enter Y- for Yes and N- for No");
					continue;
				}
				user=new Users();
				user.setUser_name(name);
				user.setPassword(pass);
				user.setEmail_id(mail);
				user.setLibrarian(lib);
				
			}
	break;	}
		
		return user;
		
	}
}
