package gfg.SortingAlgorithms;

public class SortingZeroesAndOnes {

	public static void main(String[] args) {
		int[] arr = {1,1,0,1,0,1,0,0,1,0};
		
		SegregateZeroesAndOnes(arr);
		
		System.out.println("After Segretaing Zeroes on left side of array");
		for(int i = 0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	
	static void SegregateZeroesAndOnes(int[] arr) {
		
		int left=0,right=arr.length-1;
		while(left<right) {
			while(arr[left] == 0 && left<right)
				left++;
			while(arr[right]==1 && left<right)
				right--;
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
 		}
		
	}

}
