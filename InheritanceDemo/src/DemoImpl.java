
public class DemoImpl implements InterfaceDemo,Demo1 {

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return Demo1.var ;//while accessing a variable with common name ,do specify the interface name
	}

	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public int mul(int x,int y)
	{
		return x*y;
	}

}
