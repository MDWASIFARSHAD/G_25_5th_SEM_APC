package G_23_03_JUL_Collection;

import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String[] args) {
		
//		LinkedList<Integer> ll = new LinkedList<>();
//		
//		ll.add(1);
//		ll.add(null);
//		ll.add(null);
//		System.out.println(ll);
		
		
		LinkedList linked = new LinkedList();
        linked.add("A");
        linked.add("B");
        linked.add("C");
        linked.add("D");

        System.out.println(linked);

	linked.addFirst("E");
	linked.addLast("E");
	
	System.out.println(linked);
	System.out.println(linked.getFirst());
	System.out.println(linked.getLast());
//	
//
        linked.removeFirst();
        linked.removeLast();

        
        linked.add("G");
        System.out.println(linked);
//
//        linked.removeFirst();
//        linked.removeLast();
//
//        System.out.println(linked);
//        System.out.println(linked.getFirst());
//        System.out.println(linked.getLast());
    }

	}


