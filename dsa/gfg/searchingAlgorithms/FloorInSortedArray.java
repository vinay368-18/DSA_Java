package gfg.searchingAlgorithms;

public class FloorInSortedArray {

	public static void main(String[] args) {
		
		int[] arr = {20,25,30,35,40,45,50};
		int x = 35;
		int i = FloorElem(arr,x);
		if(i == -1) {
			System.out.println("No element found less than or equal to "+x);
		}
		else {
			System.out.println("Floor of " + x + " is " + arr[i]);
		}

	}
	
	static int FloorElem(int[] arr,int x) {
		int low = 0,high = arr.length-1;
		int result = -1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid]<=x) {
				result = mid;
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		return result;
	}

}
