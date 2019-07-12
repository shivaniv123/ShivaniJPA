
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Account act =new Account(5000);
     System.out.println("balance = "+act.getBalance());
     System.out.println("acc number = "+act.getAccountNumber());
     
     try {
		act.withdraw(4000);
	} catch (AccountException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
     System.out.println("after withdraw balance = "+act.getBalance());
     System.out.println("act number = "+act.getAccountNumber());
     
     try {
		act.withdraw(2000);
	} catch (AccountException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
     System.out.println("after withdraw balance = "+act.getBalance());
     System.out.println("act number = "+act.getAccountNumber());
	}

}
