import java.util.HashSet;
import java.util.TreeSet;


public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       TreeSet<Double>set =new TreeSet<Double>();
        set.add(1.2);
        set.add(6.7);
        set.add(7.9);
        set.add(1.6);
        set.add(6.6);
        set.add(9.6);
        set.add(3.4);
        set.add(1.2);
        
        System.out.println("hash set is=");
        for(Double val : set)
        {
        	System.out.println(val);
        }
	}

}
