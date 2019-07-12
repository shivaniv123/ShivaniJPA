package lab3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy");
	     Scanner sc =new Scanner(System.in);
	     System.out.println("Enter  first Date ::");
	     String date1=sc.next();
	     LocalDate Date1=LocalDate.parse(date1 ,format);
	     
	     System.out.println("Enter second Date ::");
	     String date2=sc.next();
	     LocalDate Date2=LocalDate.parse(date2 ,format);
	     
	     Period diff=Date1.until(Date2);
	     System.out.println("difference of date ="+diff.getDays()+" days"+diff.getMonths()+" months "+diff.getYears()+" years");
	}

}
