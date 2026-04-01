package gfg.searchingAlgorithms;
import java.util.*;
public class BinarySearch {

	public static void main(String[] args) {
		ArrayList <Integer> list = new ArrayList<>();
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(50);
		list.add(8);
		list.add(12);
		list.add(21);
		list.add(14);	
		Collections.sort(list); 	// sorts list into non-decending(accending) order
		System.out.println("Sorted List");
		System.out.println(list);
		int key=21;
		int index = Collections.binarySearch(list, key);
		if(index>=0) {
			System.out.println(key+" is found at index "+index);
		}
		else {
			System.out.println("Not found");
		}
			
	}

}
