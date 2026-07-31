package GfgPractice.HashMap;
import java.util.*;
public class EqualArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1, 2, 5, 4, 0};
		int[] arr2 = {2, 4, 5, 0, 1};
		System.out.println(checkEqual(arr1,arr2));
	}
	static boolean checkEqual(int[] arr1,int[] arr2) {
		Map<Integer,Integer> map = new HashMap();
		if(arr1.length!=arr2.length)
			return false;
		for(int i=0;i<arr1.length;i++) {
			if(map.containsKey(arr1[i])) {
				int val = map.get(arr1[i])+1;
				map.replace(arr1[i], val);
			}
			else {
				map.put(arr1[i], 1);
			}
		}
		for(int i=0;i<arr2.length;i++) {
			if(map.containsKey(arr2[i])) {
				int val = map.get(arr2[i])-1;
				map.replace(arr2[i], val);
			}
		}
		for(int i:map.values()) {
			if(i!=0)
				return false;
		}
		return true;
	}

}
