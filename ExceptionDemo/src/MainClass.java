import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res=0;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter numerator");
   int num=sc.nextInt();
   System.out.println("enter denomenator");
   int den=sc.nextInt();
   String ref=null;
   try{
    res=num/den;
    System.out.println(ref.length());
   }
   catch(Exception e)
   {
	   System.out.println(e.getMessage());
   }
   System.out.println("res="+res);
   System.out.println("divison completed");
	}

}
