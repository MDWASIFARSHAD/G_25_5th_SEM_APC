package Collections.comparatorExample;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
        // Create TreeSet with custom comparator
        TreeSet<Integer> t = new TreeSet<>(new MyComparator());

        t.add(10);    // add 10
        t.add(0);     // compare(0,10) → +1 → keep 0 after 10
        t.add(15);    // compare(15,10) → -1 → 15 before 10
        t.add(5);     
        // compare(5,15) → +ve → keep going
        // compare(5,10) → +1 → keep going
        // compare(5,0) → -1

        t.add(20);    // compare(20,15) → -1 → insert before 15
        t.add(20);    // compare(20,20) → 0 → duplicate, not added

        System.out.println(t);  // Output: [20, 15, 10, 5, 0]

}
}
