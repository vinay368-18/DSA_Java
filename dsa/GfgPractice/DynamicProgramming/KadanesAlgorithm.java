package GfgPractice.DynamicProgramming;

public class KadanesAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 3, -8, 7, -1, 2, 3};
		System.out.println(maxSubarraySum(arr));
	}

	static int maxSubarraySum(int[] arr) {
		int maxSum = arr[0];
		int curr_sum = arr[0];
		for(int i=1;i<arr.length;i++) {
			curr_sum = Math.max(arr[i], curr_sum+arr[i]);
			maxSum = Math.max(maxSum, curr_sum);
		}
		return maxSum;
	}
}
