package gfg.HashMap;

import java.util.*;

public class MaxDistance {

	public static void main(String[] args) {
		
		int[] arr = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2};
		
		int max_d = FindMaxDistance(arr);
		
		System.out.println("Max Distance:"+max_d);
	}

	static int FindMaxDistance(int[] arr) {
		HashMap<Integer,Integer> map = new HashMap<>();
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i]) == false)
				map.put(arr[i], i);
			else {
				int n = i - map.get(arr[i]);
				max = Math.max(n,max);
			}
			
		}
		return max;	
	}
}
