import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Set;


public class HahMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable <Integer,String>map=new Hashtable<Integer,String>();
		map.put(100, "Renu");
		map.put(110, "Pooja");
		map.put(123, "Vijaya");
		map.put(120, "pinnu");
		//.map.put(null,null);
		System.out.println("entry set "+ map.entrySet());
		
		Set<Integer>set =map.keySet();
		
		for(Integer keys : set)
		{
			String val=map.get(keys);
			System.out.println("key = "+keys+" val = "+val);
		}
	}

}
