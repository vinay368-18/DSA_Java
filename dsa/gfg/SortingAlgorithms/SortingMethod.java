package gfg.SortingAlgorithms;
import java.util.*;
public class SortingMethod {

	public static void main(String[] args) {
		
		//array sorting
		int[] arr = {30,20,10,5,42,12};
		Arrays.sort(arr);
		System.out.print("Sorted Array:");
		for(int i:arr) {
			System.out.print(i+"  ");
		}
		System.out.println();
		
		//list sorting
		ArrayList <Integer> list = new ArrayList<>();
		list.add(20);
		list.add(10);
		list.add(5);
		list.add(4);
		list.add(2);
		Collections.sort(list);
		System.out.println("Sorted List:"+list);
		
	}

}
