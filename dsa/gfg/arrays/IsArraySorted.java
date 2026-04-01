package gfg.arrays;

public class IsArraySorted {

	public static void main(String[] args) {
		int[] arr = {10,20,22,25,60,50};
		boolean result = sorted(arr);
		if(result==false) {
			System.out.println("Array is not sorted");
		}
		else {
			System.out.println("Array is sorted");
		}
	}
	static boolean sorted(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1])
				return false;
		}
		return true;
	}

}
