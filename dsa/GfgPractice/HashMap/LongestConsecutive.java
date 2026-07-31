package GfgPractice.HashMap;
import java.util.*;
public class LongestConsecutive {

	public static void main(String[] args) {
		int[] arr = {2, 6, 1, 9, 4, 5, 3};
		System.out.println(longestConsecutive(arr));
	}
	static int longestConsecutive(int[] arr) {
		Map<Integer,Integer> map = new TreeMap<>();
		for(int i:arr) {
			map.put(i, 1);
		}
		int curr,max=1;
		for(int i:map.keySet()) {
			if(!map.containsKey(i-1)) {
				int num = i;
				curr = 1;
				while(map.containsKey(num+1)) {
					curr++;
					num++;
				}
				max = Math.max(curr, max);
			}
		}
		return max;
	}
}
