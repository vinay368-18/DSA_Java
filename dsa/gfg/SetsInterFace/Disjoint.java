package gfg.SetsInterFace;
import java.util.*;
public class Disjoint {

	public static void main(String[] args) {
		
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = {90,120,200,50,250};
		System.out.println("Two arrays:");
		System.out.print("Arr1:");
		for(int i:arr1)
			System.out.print(i+"  ");
		System.out.print("\nArr2:");
		for(int i:arr2)
			System.out.print(i+" ");
		System.out.println("\n\nDisjoint:"+checkDisjoint(arr1,arr2));
	}

	static boolean checkDisjoint(int[] a,int[] b) {
		Set<Integer> set = new HashSet<>();
		for(int i:a)
			set.add(i);
		for(int i:b) {
			if(set.contains(i)) // if a contains b element return false
				return false;
		}
		return true;
	}
}
