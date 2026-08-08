package Leet_Code.Sorting;

import java.util.Arrays;

public class containsDuplicates {

	public static void main(String[] args) {
		int[] arr = {1,2,3,1};
		System.out.println(containsDuplicate(arr));
	}

	static boolean containsDuplicate(int[] arr) {
		Arrays.sort(arr);
		int prev = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(prev == arr[i])
				return true;
			prev = arr[i];
		}
		return false;
	}
	

}
