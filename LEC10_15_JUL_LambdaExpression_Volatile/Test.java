package LambdaExpression;

import java.util.function.Predicate;

public class Test {
	
	public static void main(String[] args) {
		//Interf i = new Interf();
		
//		Interf i = (int n)-> System.out.println(n*n);
//		i.m1(10);
		
//		Interf j = (int a)-> System.out.println(a%2==0);
//		j.m1(7);
//		j.m1(8);
		
		Predicate<Integer> p = (a)-> a%2==0;
		System.out.println(p.test(10));
	}

}
