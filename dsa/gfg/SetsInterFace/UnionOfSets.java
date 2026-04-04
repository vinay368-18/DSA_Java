package gfg.SetsInterFace;
import java.util.*;
public class UnionOfSets {

	public static void main(String[] args) {
		int[] arr1 = {1,1,2,3,2,1};
		int[] arr2 = {4,5,1,2,1,3,2,5,4};
		System.out.print("Arr1:");
		for(int i:arr1)
			System.out.print(i+"  ");
		System.out.print("\nArr2:");
		for(int i:arr2)
			System.out.print(i+" ");
		System.out.println("\n\nUnion set:"+unionSet(arr1,arr2));

	}
	static ArrayList<Integer> unionSet(int[] a,int[] b){
		TreeSet<Integer> set = new TreeSet<>();
		for(int i:a)
			set.add(i);
		for(int i:b)
			set.add(i);
		return new ArrayList<>(set);
	}

}
