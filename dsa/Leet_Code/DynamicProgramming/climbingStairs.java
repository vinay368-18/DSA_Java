package Leet_Code.DynamicProgramming;
import java.util.*;
public class climbingStairs {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    		Scanner sc = new Scanner(System.in);
    		
    		System.out.println("Enter number of steps");
    		
        int n = sc.nextInt();

        System.out.println("Number of ways: " + climbStairs(n));
        sc.close();
    }

    public static int climbStairs(int n) {

        int[] dp = new int[n + 1];

        if (n < 3)
            return n;

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;

        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}