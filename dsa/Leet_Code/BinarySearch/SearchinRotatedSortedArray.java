package Leet_Code.BinarySearch;

public class SearchinRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,5,6,7,0,1,2};
		System.out.println("index:"+search(arr,2));
		
	}

	static int search(int[] arr, int target) {
		int low = 0;
		int high = arr.length-1;
		while(low<=high) {
			int mid = low+(high-low)/2;
			
			if(arr[mid]==target) {
				return mid;
			}
			if(arr[low]<arr[mid]) {
				if(arr[low] <= target && arr[mid]>target)
					high = mid - 1;
				else
					low = mid+1;
			}
			else {
				if(arr[high]>=target && arr[mid]<target)
					low = mid+1;
				else
					high = mid-1;
			}
				
		}
		return -1;
	}

}
