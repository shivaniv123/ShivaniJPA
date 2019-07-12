
public abstract class Account extends Person {

	static long accNum= 180500;
	double balance;
	public Account(){}
	public Account(long accNum, double balance) {
		super();
		this.accNum = accNum;
		this.balance = balance;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum++;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	Person accHolder=new Person();
	
	public void deposit(double dep)
	{
		balance=balance+dep;
	}
	public void withdraw(double withdr)
	{
		balance=balance-withdr;
	}
	
}

