import java.util.Scanner;


public class Agemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        Age obj=new Age();
        System.out.println("enter age =");
        try {
			int age=obj.AgeValidate(sc.nextInt());
			System.out.println("Age is =  "+age);
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
