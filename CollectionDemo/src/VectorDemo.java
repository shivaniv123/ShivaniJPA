import java.util.Iterator;
import java.util.Vector;


public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //  Vector vector=new Vector();
      Vector <Integer> vector=new Vector<Integer>(); 
      System.out.println("default size ="+vector.size());
      System.out.println("default capacity ="+vector.capacity());
      vector.add(12);
      vector.add(7);
      vector.add(4);
      vector.add(11);
      vector.add(90);
      vector.add(90); vector.add(90);
      vector.add(90);
      vector.add(90);
      vector.add(90);
      vector.add(90);
      vector.
      System.out.println("default size ="+vector.size());
      System.out.println("default capacity ="+vector.capacity());
      
      
   /*   Iterator iterate= vector.iterator();//first method
      while(iterate.hasNext())
      {
    	  System.out.println(iterate.next());
      }*/
      
      for (Integer obj : vector)//second method
      {
    	  System.out.println(obj);
      }
	}

}
