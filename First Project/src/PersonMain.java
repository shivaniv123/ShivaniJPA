
public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Persons obj=new Persons("Divya","Bharathi");
      Gender gen= Gender.F;
      System.out.println("First Name ="+obj.getFirstName());
      System.out.println("Last Name ="+obj.getLatName());
      //System.out.println("Gender ="+obj.getGender());
     System.out.println("Gender ="+gen);
	}

}
