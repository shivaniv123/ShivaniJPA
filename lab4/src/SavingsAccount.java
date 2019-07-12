
public class SavingsAccount extends Account
{
 final double minBal=500.0;
 
 @Override
 public void withdraw(double withdr)
	{ 
	 if(balance>minBal)
	 {
		balance=balance-withdr;
	}
	 else
		 System.out.println("Insufficient Balance");
	}
	
}
