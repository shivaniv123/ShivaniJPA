
public class CreateEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Employee emp= new Employee(101,"hema");
    System.out.println("emp ="+emp);
    //emp.toString()
    Employee emp1= new Employee(101,"hema");
    
    if(emp.equals(emp1))
    	System.out.println("equal");
    else
    	System.out.println("not equal`");
}
}
