
public class PersonException extends Exception{

String message;
	
	public PersonException(String message)
	{
		this.message=message;
	}
	@Override
	public String getMessage()
	{
		return this.message;
	}
}
