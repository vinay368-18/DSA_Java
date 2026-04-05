package gfg.SetsInterFace;
import java.util.*;
public class TwoSum {

	public static void main(String[] args) {
		
		int[] arr = {0,-1,2,-3,1};
		int target = -2;
		System.out.print("Array: ");
		for(int i:arr)
			System.out.print(i+"  ");
		System.out.println("\nTarget:"+target);
		System.out.println("Is sum of any distinct index's is equal to target:"+checkTwoSum(arr,target));
	}
	
	static boolean checkTwoSum(int[] arr,int target) {
		
		HashSet<Integer> set = new HashSet<>();
		for(int i:arr) {
			int rem = target - i;
			if(set.contains(rem))
				return true;
			set.add(i);
		}
		return false;
	}
}
