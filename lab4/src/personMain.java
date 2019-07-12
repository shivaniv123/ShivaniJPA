import java.util.Scanner;


public class personMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
       Scanner sc=new Scanner(System.in);
       
      Account smi=new CurrentAccount();
       Account kat=new CurrentAccount();
       System.out.println("choice which customer details you want");
       System.out.println("1.Smith");
       System.out.println("2.Kathy");
       int n=sc.nextInt();
       
       switch(n)
       {case 1: {int x;
    	   smi.setName("Smith");
    	   smi.setBalance(200.0);
    	   System.out.println("Name : "+smi.getName());
    	   System.out.println("Balance : "+smi.getBalance());
    	   System.out.println("enter your choice:");
    	   System.out.println("1. Deposit");
    	   System.out.println("2. WithDraw");
    	   x=sc.nextInt();
    	        switch(x){
    	        case 1:{int y;
    	            System.out.println("enter amount to deposit");
    	            y=sc.nextInt();
    	        	smi.deposit(y);
    	        	System.out.println("New Balance : "+smi.getBalance());
    	        }break;
    	        case 2:{int y;
	            System.out.println("enter amount to withdraw");
	            y=sc.nextInt();
	        	smi.withdraw(y);
	        	System.out.println("Balance Left : "+smi.getBalance());
    	        	
    	        }
    	        }
    	  
    	   
       }break;
       case 2:{int x;
	   kat.setName("Kathy");
	   kat.setBalance(3000.0);
	   System.out.println("Name : "+kat.getName());
	   System.out.println("Balance : "+kat.getBalance());
	   System.out.println("enter your choice:");
	   System.out.println("1. Deposit");
	   System.out.println("2. WithDraw");
	   x=sc.nextInt();
	        switch(x){
	        case 1:{int y;
	            System.out.println("enter amount to deposit");
	            y=sc.nextInt();
	        	kat.deposit(y);
	        	System.out.println("New Balance : "+kat.getBalance());
	        }break;
	        case 2:{int y;
            System.out.println("enter amount to withdraw");
            y=sc.nextInt();
        	kat.withdraw(y);
        	System.out.println("Balance Left : "+kat.getBalance());
	        	
	        }
	        }
	  
	   
   }break;
   default: System.out.println("Wrong Choice.....!!!!!");
       }
	}

}
