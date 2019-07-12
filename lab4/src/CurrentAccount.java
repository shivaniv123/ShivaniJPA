
public class CurrentAccount extends SavingsAccount {
	
	boolean overDraft = true;
	@Override
	 public void withdraw(double withdr)
		{ 
		 if(balance>withdr)
		 {
			System.out.println(overDraft);
		}
		 else
			System.out.println(!(overDraft));
		}
		

}
