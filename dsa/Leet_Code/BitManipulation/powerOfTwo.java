package Leet_Code.BitManipulation;
import java.util.*;
public class powerOfTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		boolean r = isPowerOfTwo(n);
		if(r==true)
			System.out.println(n+" is power of 2");
		else
			System.out.println(n+" is not power of 2");
		sc.close();
	}

	static boolean isPowerOfTwo(int n) {
		return (n>0 && (n & (n-1))==0);
	}	
}
