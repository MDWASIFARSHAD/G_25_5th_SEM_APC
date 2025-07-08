package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.*;

public class MapExample {
	
	public static void main(String[] args) {
		
         Map<Integer, String> map = new HashMap<>();		
//		Set<Integer> ts = new TreeSet<>();
//		HashSet<Integer> hs = new HashSet<>();
//		
//		ArrayList<Integer> ar = new ArrayList<>();
         
         map.put(1, "vansh");
         map.put(2, "madhur");
         map.put(3, "pratik");
         System.out.println(map);
         
         Map<Integer, String> map1 = new HashMap<>();	
         map.put(4, "arvind");
         map.put(5, "wasif");
         
         map.putAll(map1);
         System.out.println(map);
         System.out.println(map.get(2));
         System.out.println(map.values());
         System.out.println(map.size());
         System.out.println(map.containsKey(4));
         System.out.println(map.containsKey(6));
         System.out.println(map.containsValue("wasif"));
        

         



	}

}
 