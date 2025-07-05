package G_23_03_JUL_Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionImplementation{
    public static void main(String[] args) {
        // Creating two collection objects
        Collection<String> collection1 = new ArrayList<>();
        Collection<String> collection2 = new ArrayList<>();

//        // 1. add(Object obj)
        collection1.add("Apple");
        collection1.add("Banana");
        collection1.add("Cherry");
        System.out.println("After add(): " + collection1);
//
//
//
//
//
//        // 2. addAll(Collection c)
        collection2.add("Banana");
        collection2.add("Dates");
        collection1.addAll(collection2);
        System.out.println("After addAll(): " + collection1);
//
//
//
//        // 3. remove(Object obj)
        collection1.remove("Cherry");
        System.out.println("After remove(): " + collection1);
//
//
//
//
//
//        // 4. removeAll(Collection c)
        System.out.println(collection2);
        System.out.println(collection1);
        collection1.removeAll(collection2);
        System.out.println("After removeAll(): " + collection1);
//
//
//
//
//
//        // 5. contains(Object obj)
        System.out.println("Contains 'Apple'? " + collection1.contains("Apple"));
//
//
//
//
//
//
//        // 6. containsAll(Collection c)
        System.out.println("Contains all from collection2? " + collection1.containsAll(collection2));
//
//
//
//
//
//        // 7. retainAll(Collection c)
//        collection1.add("Banana");
//        collection1.add("Dates");
//        collection1.retainAll(collection2);
//        System.out.println("After retainAll(): " + collection1);
//
//
//
//
//        // 8. clear()
        collection1.clear();
        System.out.println("After clear(): " + collection1);
//
//
//
//
//
//        // 9. isEmpty()
        System.out.println("Is collection1 empty? " + collection1.isEmpty());
    }
}

