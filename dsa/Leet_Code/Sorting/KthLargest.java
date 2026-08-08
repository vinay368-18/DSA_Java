package Leet_Code.Sorting;
import java.util.*;
public class KthLargest {
	public static void main(String[] args) {
		int[] arr = {3,2,1,5,6,4};
		int k = 2;
		System.out.println(findKthLargest(arr,k));
	}

	static int findKthLargest(int[] arr, int k) {
		Arrays.sort(arr);
		PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<arr.length;i++) {
			q.add(arr[i]);
		}
		int elem = 0;
		while(k>0) {
			elem = q.poll();
			k--;
		}
		return elem;
	}
}
