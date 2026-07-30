package GfgPractice.sorting;

import java.util.Arrays;

public class TripletSum {

	public static void main(String[] args) {
		int[] arr = {1, 4, 45, 6, 10, 8};
		int target = 13;
		System.out.println("Triplet Exists:"+hasTripletSum(arr,target));
	}

	static boolean hasTripletSum(int[] arr, int target) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			int left = i+1;
			int right = arr.length-1;
			while(left<right) {
				int sum = arr[i] + arr[left] + arr[right];
				if(sum == target)
					return true;
				else if(sum<target)
					left++;
				else
					right--;
			}
		}
		return false;
	}
}
