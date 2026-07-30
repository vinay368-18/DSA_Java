package arrays;

public class DutchNationalFlagAlgorithm {
// ***this algorithm is used to sort an array having 0,1,2 elem only
	public static void main(String[] args) {
		int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		System.out.println("Original Array:");
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
		sort012(arr);
		System.out.println("Sorted Array:");
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
		System.out.println("Time Complexity:O(n)");
	}
	static void sort012(int[] arr) {
		int low=0;
		int mid=0;
		int high=arr.length-1;
		int temp;
		while(mid<=high) {
			if(arr[mid]==0) {
				temp = arr[mid];
				arr[mid] = arr[low];
				arr[low] = temp;
				mid++;
				low++;
			}
			else if(arr[mid]==1) {
				mid++;
			}
			else {
				temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
			}
		}
	}

}
