package gfg.SortingAlgorithms;

import java.util.Arrays;

public class WaveArray {

	public static void main(String[] args) {
		
		int[] arr = {30,20,10,50,60,70,40};
		Arrays.sort(arr);
		System.out.println("Original Array in non-decreasing order");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		SortingAsWaveArray(arr);
		System.out.println();
		System.out.println("After Sorting As Wave Array");
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}
	
	static void SortingAsWaveArray(int[] arr) {
		
		for(int i=0;i<arr.length-1;i=i+2) {
			
				int temp = arr[i];
				arr[i] =arr[i+1];
				arr[i+1] = temp;
			
		}
		
	}

}
