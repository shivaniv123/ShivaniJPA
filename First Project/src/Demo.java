
public class Demo {
	public static void main(String[] args)
	{
		System.out.println("hello");
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		
		int x=Integer.parseInt(args[0]);
	}
	static
	{
		System.out.println("static block");
	}

}
