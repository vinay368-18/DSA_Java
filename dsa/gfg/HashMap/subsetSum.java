package gfg.HashMap;
import java.util.*;
public class subsetSum {

	public static void main(String[] args) {
		int[] arr = {5,3,2,1,6,4};
		int r = countPairs(arr,10);
		System.out.println("number of subsets for sum 10:"+r);
	}

	private static int countPairs(int[] arr, int target) {
		  HashMap<Integer, Integer> map = new HashMap<>();
	        int count = 0;

	        for (int num : arr) {
	            int complement = target - num;

	            count += map.getOrDefault(complement, 0);

	            map.put(num, map.getOrDefault(num, 0) + 1);
	        }

	        return count;
	}

}
