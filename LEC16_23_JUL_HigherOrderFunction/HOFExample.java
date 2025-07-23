package HigherOrderFunction;

import java.util.function.Function;

public class HOFExample {
	
	public static void main(String[] args) {
		
		
//		hof.print();
		
		Interf i = () -> System.out.println("m1() method is called");
		
		HOFExample hof = new HOFExample();
		hof.print(i);
//		i.m1();
		
		
		
//		HOFExample.print();
		
	}
	
	public static void print(Interf i)
	{
		i.m1();
		System.out.println("Wasif");
	}

}
