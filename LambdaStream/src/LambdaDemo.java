import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@FunctionalInterface
 interface Demo {
 int add(int num1,int num2);
}
public class LambdaDemo
{
   public static void main(String []args)
   {
	   Demo demo=(x,y)->x+y;
	   int res=demo.add(23,56);
	   System.out.println("res = "+res);
	   
	   ArrayList<String>list=new ArrayList<String>();
	   list.add("Mumbai");
	   list.add("Airoli");
	   list.add("Chennai");
	   list.add("Capgemini");
	   list.add("Hyderabad");
	   
	   Stream<String>stream=list.stream();
	   List<String>listNew=
			   stream.filter((str)->str.length()>6).collect(Collectors.toList());
			   for(String str : listNew)
			   {
				   System.out.println(str);
			   }
   }
}