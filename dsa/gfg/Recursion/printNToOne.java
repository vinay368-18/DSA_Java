package gfg.Recursion;
import java.util.*;
public class printNToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter n:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		print(n);
	}
	static void print(int n) {
		if(n==0) {
			return;
		}
		else {
			System.out.print(n+" ");
			print(n-1);
		}
	}
}
