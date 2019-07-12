import java.util.Scanner;


public class ScannerStringDemo {

	public static void main(String[] args) {
		
		String str="Hello /Welcome /to /Java";
		Scanner scan=new Scanner(str);
	scan.useDelimiter("/");
		while(scan.hasNext())
		{
			System.out.print(scan.next());
		}
		// TODO Auto-generated method stub

	}

}
