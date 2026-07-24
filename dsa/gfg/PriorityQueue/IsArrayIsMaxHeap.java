package gfg.PriorityQueue;

public class IsArrayIsMaxHeap {

	public static void main(String[] args) {
		int[] arr = {9, 15, 10, 7, 12, 11};
		boolean r = isMaxHeap(arr);
		System.out.println(r);

	}

	static boolean isMaxHeap(int[] arr) {
		int n = arr.length;
		int left,right;
		for(int i=0;i<n/2;i++) {
			left = 2*i+1;
			right = 2*i+2;
			if(arr[left]>arr[i] || arr[right]>arr[i])
				return false;
		}
		return true;
	}
	

}
