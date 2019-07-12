
public class Person {

	

		private String FirstName;
		private String LastName;
		public Person(){}
		
		public Person(String firstName, String lastName) {
			
			FirstName = firstName;
			LastName = lastName;
		}
		public String FirstName(String firstName) throws PersonException
		{FirstName = firstName;
			
	if(	firstName.isEmpty()){

		
		   throw new PersonException("blank not allowed");
		
		}
		else
		{
			return FirstName;
		}
		}
	public String LastName(String lastName) throws PersonException
	{LastName = lastName;
		
if(	lastName.isEmpty()){

	
	   throw new PersonException("blank not allowed");
	
	}
	else
	{
		return LastName;
	}
}
		
		
		
	}

