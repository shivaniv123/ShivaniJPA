package lab3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy");
	     Scanner sc =new Scanner(System.in);
	     System.out.println("Enter Product Purchase Date :");
	     String date=sc.next();
	     LocalDate Date=LocalDate.parse(date ,format);
	     
	     System.out.println("enter warrantee year =");
	     int year=sc.nextInt();
	     System.out.println("enter warrantee months =");
	     int month=sc.nextInt();
	   
	     Period p = Period.ofYears(year).plusMonths(month);
	     LocalDate d1 = Date.plus(p);
	     System.out.println("expire date ="+d1);
	    		 }

}
