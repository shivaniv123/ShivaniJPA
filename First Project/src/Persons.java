
public class Persons 
{

	private String FirstName;
	private String LastName;
	
	public Persons(String firstName, String lastName) {
		
		FirstName = firstName;
		LastName = lastName;
	}
	/*private char Gender;
	public Persons(String firstName, String latName, char gender) {
	
		FirstName = firstName;
		LatName = latName;
		//Gender = gender;
	}*/
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName){
		FirstName = firstName;
	}
	public String getLatName() {
		return LastName;
	}
	public void setLatName(String lastName) {
		LastName = lastName;
	}
	/*public char getGender() {
		return Gender;
	}
	public void setGender(char gender) {
		Gender = gender;
	}
	
	*/
	
}
