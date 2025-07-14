package SYnchronization_14_07;

public class Thread2 extends Thread{
	
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			Test.counter();
		}
	}

}
