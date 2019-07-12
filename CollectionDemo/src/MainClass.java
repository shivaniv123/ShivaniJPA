
import java.util.LinkedHashSet;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LinkedHashSet <Person> set=new LinkedHashSet<Person>();
     set.add(new Person("Geeta","Jhansi"));
     set.add(new Person("Meeta","Cheenai"));
     set.add(new Person("Uma","Banglore"));
     set.add(new Person("Shilpa","Mumbai"));
     set.add(new Person("Vani","Kerala"));
     set.add(new Person("Geeta","Jhansi"));
     
     
     for(Person obj : set)
     {
    	 System.out.println(obj);
     }
     
	}

}
