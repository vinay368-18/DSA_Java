package GfgPractice.Arrays;
import java.util.*;
public class IndexesofSubarraySum {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 7, 5};
		int target = 12;
		ArrayList<Integer> list = new ArrayList<>();
		list = subArraySum(arr,target);
		System.out.println(list);
	}

	static ArrayList<Integer> subArraySum(int[] arr, int target) {
		ArrayList<Integer> list = new ArrayList<>();
		int sum = 0;
		int i = 0;
		int j = 0;
		for(j=0;j<arr.length;j++) {
			sum += arr[j];
			while(sum>target) {
				sum -= arr[i++];
			}
			if(sum == target) {
				list.add(i+1);
				list.add(j+1);
				return list;
			}
		}
		
		list.add(-1);
		return list;
	}
}
