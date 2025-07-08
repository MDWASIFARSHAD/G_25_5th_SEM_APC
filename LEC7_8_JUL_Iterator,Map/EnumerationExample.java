package Collections;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {
	
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<>();
	v.add(1);
	v.add(2);
	v.add(4);
	v.add(3);
	System.out.println(v);
	
	          Enumeration<Integer> e =  v.elements();
	          while(e.hasMoreElements())
	          {
	        	  System.out.println(e.nextElement());
	          }
	}

}
