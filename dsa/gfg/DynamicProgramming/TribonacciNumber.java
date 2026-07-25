package gfg.DynamicProgramming;
import java.util.*;
public class TribonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("base:0,1,1.....");
		System.out.println("Enter number to find tribonnaci number:");
		n = sc.nextInt();
		System.out.println("Tribonaci of "+n+":"+tribonaci(n));
	}
	static int tribonaci(int n) {
		if(n<0)
			return -1;
		else if(n==0 || n==1)
			return n;
		else if(n==2)
			return 1;
		int[] dp = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 1;
		for(int i=3;i<=n;i++)
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
		return dp[n];
	}
}
