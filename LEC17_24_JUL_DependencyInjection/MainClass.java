package DependencyInjection_24_07;

public class MainClass {
	
	public static void main(String[] args) {
		
		Oppo o = new Oppo();
		Iphone i = new Iphone(o);
		i.camera();
	}
	

}
