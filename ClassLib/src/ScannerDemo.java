import java.util.Scanner;


public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter id: ");
     int id =scan.nextInt();
     
     System.out.println("enter name  :");
     String name= scan.next();
     
     System.out.println("id ="+id);
     System.out.println("Name ="+name);
	}

}
