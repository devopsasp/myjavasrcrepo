package calculatorapp;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {

	
static Calculator obj;
	@BeforeClass
	public static void setup()
	{
		System.out.println("before all test case");
		obj=new Calculator();
	}
	
	@AfterClass
	public static void teardown()
	{
		System.out.println("After all test case");
		obj=null;
	}
	@Test
	public void testAdd() {

				int expected=40;
		int actual=obj.add(30,10);
	 Assert.assertEquals(40,40);
	}

	@Test
	public void testSubtract() {
		
	
		int expected=5;
		int actual=obj.subtract(20, 15);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testMultiply() {
		int expected=15;
		int actual=obj.multiply(3, 5);
		Assert.assertEquals(expected, actual);
	}
@Ignore
	@Test(expected=ArithmeticException.class)
	public void testDivide()
	{
		obj.divide(10, 2);
	}
	
	@Test
	public void testcalc()
	{
		float expected=938.4f;
				float actual=obj.calc(12000.0f, 2.3f, 3.4f);
				
		Assert.assertEquals(expected, actual);		
				
	}

}
