import java.util.ArrayList;
import java.util.Collections;


public class SortProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String>list=new ArrayList();
	
		list.add("Vivo");
		list.add("Apple");
		list.add("Beats");
		list.add("Boats");
		list.add("Philips");
		
		
		
		Collections.sort(list);
		System.out.println("Sorted list is :");
		for (String str : list)
		{
			System.out.println(str);
		}
	}

}
