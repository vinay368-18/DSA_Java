package gfg.Recursion;
import java.util.*;

class Fibonnacci {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr = fibNum(n);
		for(int i:arr)
			System.out.print(i+" ");
		sc.close();			
	}

	static int[] fibNum(int n) {
		int[] ans = new int[n];
		for(int i=0;i<n;i++)
			ans[i] = fib(i);
		return ans;
	}
	static int fib(int m) {
		if(m==0 || m==1)
			return m;
		else
			return fib(m-1)+fib(m-2);
	}
}