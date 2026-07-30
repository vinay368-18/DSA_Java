package GfgPractice.searching;

public class Firstoccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5};
        int k = 3;

        int index = firstSearch(arr, k);

        if (index == -1)
            System.out.println("Element not found");
        else
            System.out.println("First occurrence of " + k + " is at index " + index);
		
	
		}
		static int firstSearch(int[] arr, int k) {
	
	        int r = -1;
	        int low = 0;
	        int high = arr.length - 1;
	
	        while (low <= high) {
	
	            int mid = (low + high) / 2;
	
	            if (arr[mid] == k) {
	                r = mid;
	                high = mid - 1;
	            } else if (arr[mid] > k) {
	                high = mid - 1;
	            } else {
	                low = mid + 1;
	            }
	        }
	
	        return r;
	    }
        
}


