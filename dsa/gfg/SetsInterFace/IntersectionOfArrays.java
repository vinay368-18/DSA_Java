package gfg.SetsInterFace;
import java.util.*;
public class IntersectionOfArrays {

	public static void main(String[] args) {
		int[] arr1 = {1,2,4,1,2,3,6,5,2,1};
		int[] arr2 = {3,2,6,5,4,7,8,9,2,3,};
		System.out.println("Arrays:");
		System.out.println("Array 1:");
		for(int i:arr1)
			System.out.print(i+" ");
		System.out.println("\nArray 2:");
		for(int i:arr2)
			System.out.print(i+" ");
		System.out.print("\n\nIntersection of array 1 and 2: "+Intersection(arr1,arr2));	
	}
	
	static ArrayList<Integer> Intersection(int[] a,int[] b){
		HashSet<Integer> set = new HashSet<>();	//For faster execution
		TreeSet<Integer> result = new TreeSet<>(); //Sorted Set
		for(int i:a)
			set.add(i);
		for(int i:b) {
			if(set.contains(i))
				result.add(i);
		}
		return new ArrayList<Integer>(result);
		
	}
	
	
	
	
}
