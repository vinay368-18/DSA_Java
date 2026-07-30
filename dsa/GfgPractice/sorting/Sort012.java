package GfgPractice.sorting;

public class Sort012 {

	public static void main(String[] args) {
		//Dutch National Flag Algorithm (  time comp->O(n)  )
		int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		System.out.println("Unsorted Array:");
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
		sort(arr);
		System.out.println("Sorted Array:");
		for(int i:arr)
			System.out.print(i+" ");
	}

	static void sort(int[] arr) {
		// TODO Auto-generated method stub
		int low=0,mid=0,high=arr.length-1,temp;
		while(mid<=high) {
			if(arr[mid]==0) {
				temp = arr[mid];
				arr[mid] = arr[low];
				arr[low] = temp;
				low++;
				mid++;
			}
			else if(arr[mid]==1)
				mid++;
			else {
				temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
			}
		}
	}
}
