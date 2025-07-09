package Multithreading_09_07;

public class Test1 {
	
	static int count=0;
	
	public void incrementCount()
	{
		for(int i=0;i<1000;i++)
		count++;
	}
	public static void main(String[] args) {
		
		Synchronization syn = new Synchronization();
		Synchronization1 syn1 = new Synchronization1();
		Thread t = new Thread(syn);
		Thread t1 = new Thread(syn1);
		
		t.start();
		t1.start();
		
		
		try {
			t.join();
			t1.join();
		}
		catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		System.out.println(count);
		
	}

}
