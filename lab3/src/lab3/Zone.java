package lab3;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class Zone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZonedDateTime zDate = ZonedDateTime.now();
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Zone Id");
	    String s=sc.next();
	    
	    ZonedDateTime datezone=ZonedDateTime.of(LocalDateTime.now(),ZoneId.of(s));
	    System.out.println("date and Zone = "+datezone);
	}

}
