import java.util.ArrayList;
import java.util.stream.*;
public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Stream<String> stream =Stream.of("Capgemini","Airoli","Mumbai","India");
		//stream.forEach((str)-> System.out.println(str));
		
		//stream.filter((str)->(str.length()>5)).forEach((str) ->
		//System.out.println(str));
		
		//System.out.println(stream.reduce((str1, str2)->(str1+str2)).get());
		
		//stream.limit(2).forEach((str) -> System.out.println(str));
		
		ArrayList<String>list=new ArrayList<String>();
		list.add("JEE");
		list.add("SAP");
		list.add("Capgemini");
		list.add("Mumbai");
		list.add("Airoli");
		Stream<String>stream= list.stream();
		stream.map((str1)-> str1.contains("i")).forEach((str)-> System.out.println(str));
	}

}
