package GfgPractice.Graph;
import java.util.*;
/*Consider a directed graph whose vertices are numbered from 1 to n.
 *  There is an edge from a vertex i to a vertex j if and only if 
 *  either j = i + 1 or j = 3 * i. 
 *  The task is to find the minimum number of edges in a path from vertex 1 to vertex n.*/
public class ShortestPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter number of vertices");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n<1)
			System.out.println("Invalid");
		else
			System.out.println("Minimum Number of edges required to comple path:"+minimumStep(n));
	}
	static int minimumStep(int n) {
		int[] dp = new int[n+1];
		for(int i=1;i<=n;i++) {
			dp[i] = Integer.MAX_VALUE;
		}
		dp[1] = 0;
		for(int i=0;i<=n;i++) {
			if(dp[i] == Integer.MAX_VALUE)
				continue;
			if(i+1<=n)
				dp[i] = Math.min(dp[i+1],dp[i]+1);
			if(3*i<=n)
				dp[i] = Math.min(dp[3*i], dp[i]+1);
		}
		return dp[n];
	}
}
