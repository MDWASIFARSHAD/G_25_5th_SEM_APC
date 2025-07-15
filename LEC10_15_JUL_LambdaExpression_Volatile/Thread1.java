package LambdaExpression;

public class Thread1 extends Thread{
	
	volatile boolean running = true;
	
	public void run()
	{
		System.out.println("Thread started");
		while(running)
		{
			
		}
		System.out.println("thread stopped");
	}
	
	public void stopping1()
	{
		running = false;
	}

}
