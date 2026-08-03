package GfgPractice.Greedy;
import java.util.*;
public class MinimumOperations {
	public static void main(String[] args) {
		int n ;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Minimum Operations:"+minOperation(n));
	}

	static int minOperation(int n) {
		int count = 0;
		while(n>0) {
			if(n%2!=0)
				n-- ;
			else
				n = n/2;
			count++;
		}
		
		return count;
	}
}
