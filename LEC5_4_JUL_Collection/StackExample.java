package G_23_03_JUL_Collection;

import java.util.Stack;

public class StackExample {
	
	
	public static void main(String[] args) {
		Stack<String> s = new Stack<>();

        s.push("A");
        s.push("B");
        s.push("C");
        s.push("D");
        s.push("E");

        System.out.println(s);             
        System.out.println(s.pop());        
        System.out.println(s);             
        System.out.println(s.peek());       
        System.out.println(s);             
        System.out.println(s.search("A")); 
        System.out.println(s.search("X"));  

	}
      

}
