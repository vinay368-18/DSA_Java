package gfg.HashMap;
import java.util.*;
public class RemoveElemToMakeDisjoint {

	public static void main(String[] args) {
		int[] arr1 = {2,3,4,5,8};
		int[] arr2 = {1,2,3,4};
		int r = minRemove(arr1,arr2);
		System.out.println("Number of elem need to be removed:"+r);
	}

	static int minRemove(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : arr1) {
            map.put(num, 1);
        }

        for (int num : arr2) {
            if (map.containsKey(num)) {
                count++;
                map.remove(num); 
            }
        }

        return count;
	}
	
}
