import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Demos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Supplier<Integer> supplier=()->{return 90;};
		System.out.println("value = "+supplier.get());
		
		Consumer<String> consume =str->System.out.println(str);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value :");
		String data=sc.next();
		consume.accept(data);
		
		Predicate<Integer> pre=(num)->num>10;
		System.out.println("res = "+pre.test(12));
		
		Function<String,Integer> fun=(str)-> str.length();
		System.out.println("len = "+fun.apply("hello"));
		
		BiPredicate<Integer,Integer> predicate=(num1,num2)->num1>num2;
		System.out.println("num 1 greater than num2  = "+predicate.test(20,45));
		
		BiFunction<Integer,Integer,Integer> fun1 =(num1,num2)->(num1*num2);
		System.out.println("num1 * num2 = "+fun1.apply(20,12));
		
		BiConsumer<String,String> consumer=
				(str1,str2) -> System.out.println("str1 +str2 = "+(str1+str2));
				consumer.accept("capgemini","airoli");
	}

}
