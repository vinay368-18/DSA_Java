package gfg.HashMap;
import java.util.*;
public class IntersectionOfTwoArrays {
	
	public static void main(String[] args) {
	
		int[] a = {1, 2, 1, 3, 1}; 
		int[] b = {3, 1, 3, 4, 1};
		
		System.out.println("Two arrays");
		System.out.println("Array 1:");
		for(int i:a)
			System.out.print(i+" ");
		System.out.println("\n\nArray 2:");
		for(int i:b)
			System.out.print(i+" ");
		ArrayList<Integer> result = new ArrayList<>();
		result = Intersection(a,b);
		System.out.println("\n\nIntersection: ");
		for(int i:result)
			System.out.print(i+" ");
	}

	static ArrayList<Integer> Intersection(int[] a, int[] b) {
		HashSet<Integer> set = new HashSet<>();
		ArrayList <Integer> list = new ArrayList<>();
		for(int i :a)
			set.add(i);
		for(int i:b) {
			if(set.contains(i)) {
				list.add(i);
				set.remove(i);
			}
		}
		return list;
	}
}
