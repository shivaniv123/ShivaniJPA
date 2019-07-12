import java.util.TreeSet;


public class EmpMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TreeSet<Employee> set=new TreeSet<Employee>();
	 set.add(new Employee("Abha","Mumbai",123,29000));
	 set.add(new Employee("Ram","Vindavan",121,25000));
	 set.add(new Employee("Sham","jhansi",126,22000));
	 set.add(new Employee("Esha","jodhpur",127,28000));
	 
	 
	 for(Employee obj :set)
	 {
		 System.out.println(obj);
	 }
	}

}
