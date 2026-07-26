package gfg.DynamicProgramming;
import java.util.*;
public class NthCatalanNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("n:");
		int n = sc.nextInt();
		int r = nthCatalan(n);
		System.out.println(r);
		sc.close();
	}
	static int nthCatalan(int n) {
		if(n==0 || n==1)
			return 1;
		int[] dp = new int[n+1];
		dp[0] = 1;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
            dp[i] = 0;

            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }

        return dp[n];
	}

}
