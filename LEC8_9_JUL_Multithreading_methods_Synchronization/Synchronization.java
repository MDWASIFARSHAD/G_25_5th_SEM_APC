package Multithreading_09_07;

public class Synchronization implements Runnable{
	
	public void run()
	{
		Test1 test = new Test1();
		test.incrementCount();
	}
	
	

}
