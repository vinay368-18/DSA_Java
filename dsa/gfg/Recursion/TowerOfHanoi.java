package gfg.Recursion;
import java.util.*;
public class TowerOfHanoi {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter number of disks:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int from = 1;
		int dest = 3;
		int aux = 2;
		System.out.println("Number of moves:"+tower(n,from,aux,dest));
		
	}
	static int  tower(int n,int from,int aux,int dest) {
		if(n==1)
			return 1;
		else
			return tower(n-1,from,dest,aux)+tower(n-1,aux,from,dest)+1;
	}
}
