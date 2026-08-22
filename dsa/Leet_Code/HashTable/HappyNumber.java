package Leet_Code.HashTable;
import java.util.*;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n ;
		System.out.println("Enter number:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		System.out.println(isHappy(n));
	}
	public static boolean isHappy(int n) {
		HashSet<Integer> set = new HashSet<>();
		while(n!=1) {
			if(set.contains(n)) {
				return false;
			}
			set.add(n);
			int sum = 0;
			while(n > 0) {
				int digit = n%10;
				sum += digit*digit;
				n = n/10;
			}
			n = sum;
		}
		return true;
	}

}
