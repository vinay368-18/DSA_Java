package gfg.SortingAlgorithms;
import java.util.*;
public class IntersectionOfTwoSortedArrays {

	public static void main(String[] args) {
		
		int[] a = {2,2,3,4,5}; 
		int[] b = {1,1,2,3,4};
		
		System.out.println("Intersection Two Arrays is: "+intersection(a,b));
	}
	
	static ArrayList<Integer> intersection(int[] a,int[] b){
		
		int i=0,j=0;
		int n = a.length;
		int m = b.length;
		ArrayList<Integer> list = new ArrayList<>();
		while(i<n && j<m) {
			if(i>0 && a[i] == a[i-1]) {
				i++;
				continue;
			}
			if(j>0 && b[j] == b[j-1]) {
				j++;
				continue;
			}
			if(a[i] == b[j]) {
				list.add(a[i]);
				i++;
				j++;
			}
			else if(a[i]<b[j])
				i++;
			else
				j++;
		}
		
	
	return list;
	
	}

}
