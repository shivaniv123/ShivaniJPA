import java.util.TreeSet;


public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TreeSet<Person> set=new TreeSet<Person>();
	 set.add(new Person("Abha","Mumbai"));
	 set.add(new Person("Amit","Mumbai"));
	 set.add(new Person("Kshma","Pune"));
	 
	 for(Person obj :set)
	 {
		 System.out.println(obj);
	 }
	}

}
