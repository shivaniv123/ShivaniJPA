package lab3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Duration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today=LocalDate.now();//todays date
		
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy");
	     Scanner sc =new Scanner(System.in);
	     System.out.println("Enter Date ::");
	     String date=sc.next();
	     LocalDate pDate=LocalDate.parse(date ,format);
	     
	     Period diff=pDate.until(today);
	     System.out.println("diff ="+diff.getDays()+" days"+diff.getMonths()+" months "+diff.getYears()+" years");
	}

}
