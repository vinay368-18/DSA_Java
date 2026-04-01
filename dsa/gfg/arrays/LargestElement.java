package gfg.arrays;
import java.util.*;
public class LargestElement {

	public static void main(String[] args) {
		
		int[] arr = {25,41,81,55,22};
		int l = largest(arr);
		System.out.println("Largest Elem:"+l);
		

	}
	static int largest(int[] arr) {
		int largest = arr[0];
		int i;
		for(i=1;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		return largest;
		
	}

}
