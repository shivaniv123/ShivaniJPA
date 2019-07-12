import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws PersonException {
		// TODO Auto-generated method stub
		
			
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Following:");
	    try
	    {
	      Person obj=new Person();
	      System.out.println("enter First Name :");
	      String fname=obj.FirstName(sc.nextLine());
	      
	      System.out.println("enter Last Name :");
	      String lname=obj.FirstName(sc.nextLine());
	    
	    System.out.println("FullName = "+fname.concat(lname));
		}
	    catch(PersonException e)
	    {
	    	System.out.println(e.getMessage());
	    	}
	    }
	
}




