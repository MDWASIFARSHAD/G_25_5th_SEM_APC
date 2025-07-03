package RuntimeStack;

public class RuntimeStackMEchanism {
	public static void main(String[] args) {
		m1();
	}
	public static void m1()
	{
		System.out.println("m1 is called");
		m2();
	}
	public static void m2()
	{
		m3();
		System.out.println(10/0);
		System.out.println("m2 is called ");
	}
	public static void m3()
	{
		System.out.println("m3 is called");
	}

}
