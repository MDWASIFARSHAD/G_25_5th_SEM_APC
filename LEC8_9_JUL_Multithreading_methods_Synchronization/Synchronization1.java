package Multithreading_09_07;

public class Synchronization1 implements Runnable{
	
	public void run()
	{
		Test1 test2 = new Test1();
		test2.incrementCount();
	}

}
