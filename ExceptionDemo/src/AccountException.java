
public class AccountException extends Exception{
	String message;
	
	public AccountException(String message)
	{
		this.message=message;
	}
	@Override
	public String getMessage()
	{
		return this.message;
	}

}
