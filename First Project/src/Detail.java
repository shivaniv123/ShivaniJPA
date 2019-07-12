
public class Detail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Person ref= new Person();
       System.out.println("Person Details");
       System.out.println("----------------");
       ref.setFirstName("Divya");
       ref.setLastName("Bharathi");
       ref.setGender("F");
       ref.setAge(20);
       ref.setWeight(85.55);
       
       System.out.println("First Name ="+ref.getFirstName());
       System.out.println("Last Name =" +ref.getLastName());
       System.out.println("Gender ="+ref.getGender());
       System.out.println("Age =" + ref.getAge());
       System.out.println("Weight ="+ref.getWeight());
       
	}

}
