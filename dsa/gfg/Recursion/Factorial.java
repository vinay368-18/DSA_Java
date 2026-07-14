package gfg.Recursion;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter n:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int result = fact(n);
		System.out.println("Result:"+result);
	}
	static int fact(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		else {
			return n*fact(n-1);
		}
	}
}
