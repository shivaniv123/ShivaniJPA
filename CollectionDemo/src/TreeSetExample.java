import java.util.TreeSet;


public class TreeSetExample {

	public static void main(String[] args) {
	
		System.out.println("1. Name:");
		System.out.println("2. Address");
		// TODO Auto-generated method stub
      TreeSet<Person> set1=new TreeSet<Person>(new SortObject());
      set1.add(new Person("Hema","Bhilai"));
      set1.add(new Person("Rohan","Bilaspur"));
      set1.add(new Person("Shilpa","Mumbai"));
      set1.add(new Person("Rahul","Shivpuri"));
      set1.add(new Person("Divyanshu","Jhansi"));
      
      System.out.println("Before Sorting : set1");
      for(Person obj : set1)
      System.out.println(obj);
      
      System.out.println("1. Name");
      System.out.println("2. Address");
      System.out.println("3. Id");
      System.out.println("4. Salary");
      
     TreeSet<Employee> set2=new TreeSet<Employee>(new SortObject());
     set2.add(new Employee("Hema","Bhilai",123,23456));
     set2.add(new Employee("Rohan","Bilaspur",142,7800));
     set2.add(new Employee("Shilpa","Mumbai",154,13200));
     set2.add(new Employee("Rahul","Shivpuri",146,78000));
     set2.add(new Employee("Divyanshu","Jhansi",126,3200));
     
     System.out.println("Before Sorting : set2");
     for(Employee obj : set2)
     System.out.println(obj);
     
     
	}

}
