package Leet_Code.HashTable;
import java.util.*;
public class MajorityElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,2,2,22,2,3};
		System.out.println(majorityElement(nums));
	}

	static int majorityElement(int[] nums) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			if(map.containsKey(nums[i]) == false)
                map.put(nums[i],1);
            else{
                int val = map.get(nums[i]);
                map.replace(nums[i],val+1);
            }
		}
		int k = Integer.MIN_VALUE;
		int max = 0;
		for(int key:map.keySet()) {
			if(max<map.get(key)) {
				max = map.get(key);
				k = key;
			}
		}
		return k;
	}
	

}
