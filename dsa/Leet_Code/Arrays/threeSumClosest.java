package Leet_Code.Arrays;

import java.util.Arrays;

public class threeSumClosest {

	public static void main(String[] args) {
		int[] nums = {-1,2,1,-4};
		int target = 1;
		System.out.println(threeSumClose(nums,target));
	}

	static int threeSumClose(int[] nums, int target) {
		Arrays.sort(nums);
		int closest = nums[0] + nums[1] + nums[2];
		int sum ;
		for(int i=0;i<nums.length-2;i++) {
			int low=i+1;
			int high = nums.length-1;
			while(low<high) {
				sum = nums[i] + nums[low] + nums[high];
				if(Math.abs(sum-target)<Math.abs(closest-target))
					closest = sum;
				if(sum<target)
					low++;
				else if(sum>target)
					high--;
				else
					return sum;
			}
		}
		return closest;
	}
}
