package RuntimeStack;

public class ThrowsExample {
	public static void main(String[] args) 
	{
		try
		{
		m1();
		}
		catch(ArithmeticException e)
		{
			System.out.println("cannot divide by zero");
		}
	}
	public static void m1() throws ArithmeticException
	{
		System.out.println(10/0);
	}

}
