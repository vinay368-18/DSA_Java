package GfgPractice.Greedy;
import java.util.*;
/*in set {1, 2, 5, 10} and a target value n. 
 * Find the minimum number of coins needed to make the change for n. */
public class MinCoins {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter target:");
		n = sc.nextInt();
		System.out.println(findMin(n));
	}

	static int findMin(int n) {
		// TODO Auto-generated method stub
		int count = 0;
		int[] coins = {10,5,2,1};
		for(int coin:coins) {
			count = count + n/coin;
			n = n % coin;
		}
		return count;
	}
}
