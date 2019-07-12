
public class Age {
  
	 int Age;
	public Age(){}
	
	public int AgeValidate(int age) throws AgeException 
	{
		Age=age;
		if(Age<15)
		{
			throw new AgeException("under 15 not allowed");
		}
		else
		{
			return Age;
		}
	}
}
