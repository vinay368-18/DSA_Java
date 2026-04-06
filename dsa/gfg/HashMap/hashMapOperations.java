package gfg.HashMap;

import java.util.*;
public class hashMapOperations {

	public static void main(String[] args) {
		
		HashMap<Object,Object> map = new HashMap<>();
		//Adding key-value pair
		map.put(101,"Vinay");
		map.put(102,"Arjun");
		map.put(103,"Dev");
		map.put(104,"Naresh");
		map.put(105,"Abhi");
		System.out.println("Original Map: "+map);
		
		//Removing a pair with key
		map.remove(104);
		System.out.println("After removing key 104: "+map);
		
		//Check map contains key 
		System.out.println("Does map contains key 102: "+map.containsKey(102));
		System.out.println("Does map contains key 104: "+map.containsKey(104));
		
		
		//Check map contains value
		System.out.println("Does map contains value Vinay: "+map.containsValue("Vinay"));
		System.out.println("Does map contains value Naresh: "+map.containsValue("Naresh"));
				
		//Traversal Key Set
		System.out.println("Traversal:");
		for(Object i : map.keySet())
			System.out.println(i+" -> "+map.get(i));
		
		// Adding a key-value if not present
		map.putIfAbsent(106,"Niharika");
		System.out.println("After put if absent: "+map);
		
		//Clearing hashmap
		map.clear();
		System.out.println("After clearing: "+map);
		
	}

}
