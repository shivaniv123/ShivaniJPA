
public class CreatePerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //Employee emp=new Employee(110,"Nisha","delhi");
     //  System.out.println("emp ="+emp);
       Employee w=new WageEmp(10114,"reena","mumbai",12,29);
       System.out.println("wage ="+w);
       System.out.println("salary="+w.calSal());
       System.out.println(w instanceof Employee );
       System.out.println(w instanceof WageEmp );
       System.out.println(w instanceof Object  );
       System.out.println(w instanceof Person );
       
       WageEmp wEmp=new WageEmp(112,"Priya","pune",490,40);
       Person p=(Person)wEmp;//upcasting
       System.out.println(p);
       
       Person obj=new WageEmp(112,"Priya","pune",490,40);
       WageEmp r=(WageEmp)obj;//downcasting
       System.out.println(r);
	}

}
