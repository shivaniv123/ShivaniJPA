
public class AgeException extends Exception {
String message;
	
	public AgeException(String message)
	{
		this.message=message;
	}
	@Override
	public String getMessage()
	{
		return this.message;
	}
}
