package gfg.SortingAlgorithms;

public class CheckSortedArray {

	public static void main(String[] args) {
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = {50,10,30,15,25};
		
		boolean result1 = CheckSortedArray(arr1);
		boolean result2 = CheckSortedArray(arr2);
		
		if(result1==false) {
			System.out.println("Arr1 is not sorted in accending order");
		}
		else {
			System.out.println("Arr1 is sorted in accending order");
		}
		if(result2==false) {
			System.out.println("Arr2 is not sorted in accending order");
		}
		else {
			System.out.println("Arr2 is sorted in accending order");
		}
		
	}
	static boolean CheckSortedArray(int[] arr) {
		for(int i = 0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1])
				return false;
		}
		return true;
	}

}
