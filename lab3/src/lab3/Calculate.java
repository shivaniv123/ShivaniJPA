package lab3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Calculate {
	
	private static String FirstName;
	private static String LastName;
	
	public static void calculateAge()
	{
		LocalDate today=LocalDate.now();//todays date
	    System.out.println("today ="+today);
	    
		 DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy");
	     Scanner sc =new Scanner(System.in);
	     System.out.println("Enter Date Of Birth ::");
	     String date=sc.next();
	     LocalDate pDate=LocalDate.parse(date ,format);
	     
	     Period diff=pDate.until(today);
	     System.out.println("diff ="+diff.getDays()+" days"+diff.getMonths()+" months "+diff.getYears()+" years");
	}
	public static String getFirstName() {
		
		System.out.println("enter First Name = ");
		Scanner sc=new Scanner(System.in);
		FirstName=sc.next();
		
		System.out.println("enter Last Name = ");
		
		LastName=sc.next();
		return (FirstName.concat(LastName));
	}
	
}
