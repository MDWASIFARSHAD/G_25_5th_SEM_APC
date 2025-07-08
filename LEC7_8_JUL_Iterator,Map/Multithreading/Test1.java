package Multithreading;

public class Test1 {
	
	public static void main(String[] args) {
		
		MyThread1 mt = new MyThread1();
		Thread t = new Thread(mt);
		t.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("parent class");
		}
	}

}
