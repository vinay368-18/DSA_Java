package GfgPractice.searching;
import java.util.*;
public class MajorityElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 1, 2, 1, 3, 5, 1};
		System.out.println(majorityElement(arr));
	}

	static int majorityElement(int[] arr) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i:arr) {
			if(map.containsKey(i) == false)
				map.put(i, 1);
			else {
				int val = map.get(i) + 1;
				map.replace(i,val);
			}
		}
		for(int key:map.keySet()) {
			if(map.get(key) > arr.length/2)
				return key;
		}
		return -1;
	}
}
