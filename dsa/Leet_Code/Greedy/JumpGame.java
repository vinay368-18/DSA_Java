package Leet_Code.Greedy;

public class JumpGame {

	public static void main(String[] args) {
		int[] nums = {2,3,1,1,4};
		System.out.println(canJump(nums));
	}

	static boolean canJump(int[] nums) {
		int maxReach = 0;
		int n = nums.length;
		
		for(int i=0;i<n;i++) {
			if(i>maxReach)
				return false;
			maxReach = Math.max(maxReach, i+nums[i]);
		}		
		return true;
	}
}
