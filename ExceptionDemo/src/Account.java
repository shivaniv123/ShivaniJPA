
public class Account {
	
	static int actNumber=110;
	float balance;
	
	public Account(float balance)
	{
		++actNumber;
		this.balance=balance;
	}
	public int getAccountNumber()
	{
		return this.actNumber;
	}
   public void withdraw(int amt)throws AccountException
   { 
	   try{
		   if(amt<balance){
	   this.balance=this.balance-amt;
   }
		   else
			   throw new AccountException("not enough balance");
		   }
	catch(AccountException e)
	   {
		System.out.println(e.getMessage());
	   }
   
   }
   public void deposite(int amt)
   {
	   this.balance=this.balance+amt;
   }
   public float getBalance()
   {
	   return this.balance;
   }
}
