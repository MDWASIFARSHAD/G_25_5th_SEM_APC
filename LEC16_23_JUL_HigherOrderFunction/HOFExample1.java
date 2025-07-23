package HigherOrderFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class HOFExample1 {
	
	public static void main(String[] args) {
		
		Function<Integer,Integer> f = (n)-> n*n;
		
		List<Integer> l = Arrays.asList(1,7,2,5,2,10);
		
		HOFExample1 h1 = new HOFExample1();
		System.out.println(h1.square(f, l));
	}
	
	public ArrayList<Integer> square(Function<Integer,Integer> f,List<Integer> l)
	{
		ArrayList<Integer> ar = new ArrayList<>();
		for(Integer a:l)
		{
			ar.add(f.apply(a));
		}
		return ar;
		
	}
	

}
