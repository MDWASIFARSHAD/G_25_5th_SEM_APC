package Collections;

import java.util.TreeSet;

public class ExampleTreeSet {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(2);
		ts.add(1);
		ts.add(5);
		ts.add(7);
		ts.add(3);
		System.out.println(ts); // it will come in sorting order
		
		ts.add(null);




		
	}

}
