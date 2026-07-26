package gfg.DynamicProgramming;
public class minCostClimbing {

	public static void main(String[] args) {
		int[] a = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
		int cost = minCostClimbingStairs(a);
		System.out.println(cost);
	}
	static int minCostClimbingStairs(int[] a) {
		int n = a.length;
		int[] dp = new int[n+1];
		dp[0] = a[0];
		dp[1] = a[1];
		for(int i=2;i<n;i++)
			dp[i] = a[i] + Math.min(dp[i-1], dp[i-2]);
		return Math.min(dp[n-1], dp[n-2]);
	}

}
