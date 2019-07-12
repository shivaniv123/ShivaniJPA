import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class FormatDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy");
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter Date ::");
     String date=sc.next();
     LocalDate pDate=LocalDate.parse(date ,format);
     System.out.println(pDate);
	}

}
