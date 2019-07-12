import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class CaculatorTest {

	static Calculator ref;
	
	@BeforeClass
	public static void init()
	{
		ref =new Calculator();
		System.out.println("call before");
	}
	@Test
	public void testAdd()
	{
		Assert.assertNotSame(2,ref.add(0, 0));//if you want actual and expected should not be same
	}
	@Test
	public void testSubstract()
	{
		Assert.assertNotSame(0,ref.substract(4, 0));
	}
	@Test
	public void testMultiply()
	{
		Assert.assertNotSame(6,ref.multiply(2,5));
	}
	@Ignore
	@Test(expected=ArithmeticException.class)
	public void testDiv()
	{
		Assert.assertNotSame(2,ref.div(5, 2));
	}
	@AfterClass
	public static void destory()
	{
		ref=null;
		System.out.println("call after");
	}
}
