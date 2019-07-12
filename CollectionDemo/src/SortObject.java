import java.util.Comparator;
import java.util.Scanner;


public class SortObject implements Comparator{
	int n = getChoice();
	
	
	@Override
	public  int compare(Object arg0,Object arg1)
	{
		
		
		int diff=0;
		if(arg0 instanceof Person && arg1 instanceof Person){
		
			Person ref1=(Person)arg0;
			Person ref2=(Person)arg1;
			switch(n)
			{
			case 1:	diff= ref1.name.compareTo(ref2.name);break;
			case 2:	diff= ref1.address.compareTo(ref2.address);break;
			
			default:System.out.println("Wrong Choice");
			}
		}
		else if(arg0 instanceof Employee && arg1 instanceof Employee)
		{
			Employee emp1=(Employee)arg0;
			Employee emp2=(Employee)arg1;
			switch(n)
			{
			case 1:	diff= emp1.name.compareTo(emp2.name);break;
			case 2:	diff= emp1.Address.compareTo(emp2.Address);break;
			case 3:	diff= emp1.Id-(emp2.Id);break;
			case 4:	diff= emp1.Salary-(emp2.Salary);break;
			
			
			
			default:System.out.println("Wrong Choice");
			}
		}
		
	
		return diff;
	}
	public static int getChoice()
	{
		
		System.out.println("enter your choice");
		Scanner sc=new Scanner(System.in);
		return sc.nextInt();
	}
	

}
