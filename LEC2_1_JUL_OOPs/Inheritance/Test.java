package Inheritance;

public class Test {
	
	public static void main(String[] args) {
		
		Iphone i = new Iphone();
//		i.airdrops();
//		i.calling();
//		i.cameraQuality();
		
		OnePlus one = new OnePlus();
		one.android();
		one.calling();
		one.cameraQuality();
		
		Mobile mob = new Mobile();
		//mob.android();
		mob.cameraQuality();
		
		Mobile mob1 = new Iphone();
		//mob1.airdrops();
		mob1.calling();
				
	}

}
