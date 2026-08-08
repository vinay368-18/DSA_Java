package Leet_Code.Sorting;
import java.util.*;
public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,30,34,5,9};
		System.out.println(largestNumber(nums));
	}

	static String largestNumber(int[] nums) {
		// TODO Auto-generated method stub
		String str = "";
		String[] arr = new String[nums.length];		
		for(int i=0;i<nums.length;i++) {
			arr[i] = String.valueOf(nums[i]);
		}
		Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b));
		if(arr[0].equals("0"))
			return "0";
		for(String s:arr)
			str+=s;
		return str;
	}
	

}
