package DependencyInjection_24_07;

public class Iphone {
	
	Oppo o;
	
	
	public Iphone(Oppo o) {
		// TODO Auto-generated constructor stub
		this.o=o;
	}

	public void camera()
	{
		o.calling();
		System.out.println("Camera is good");
		
	}

}
