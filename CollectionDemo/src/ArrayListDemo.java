import java.util.ArrayList;
import java.util.Collections;


public class ArrayListDemo {
	public static void main(String []args)
	{
		ArrayList <String>list=new ArrayList();
		System.out.println("default size ="+list.size());
		list.add("India");
		list.add("Mumbai");
		list.add("Capgemini");
		list.add("Airoli");
		list.add("Pune");
		System.out.println("current size ="+list.size());
		
		for(String str : list)
		{
			System.out.println(str);
		}
		Collections.sort(list);
		System.out.println("Sorted list is :");
		for (String str : list)
		{
			System.out.println(str);
		}
	}
}
