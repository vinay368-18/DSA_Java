package Leet_Code.BinarySearch;
import java.util.*;
public class sqrtOfx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int n = sc.nextInt();
		System.out.println("sqrt of "+n+": "+sqrt(n));
		sc.close();
	}

	static int sqrt(int n) {
		if(n<2)
			return n;
		int low = 1;
		int high = n/2;
		int ans = 0;
		while(low<=high) {
			int mid = low + (high-low)/2;
			if(mid<=n/mid) {
				ans = mid;
				low = mid+1;
			}
			else
				high = mid-1;
		}
		return ans;
	}
		
}
