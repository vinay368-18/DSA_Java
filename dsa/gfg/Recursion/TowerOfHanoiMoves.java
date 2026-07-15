package gfg.Recursion;
import java.util.Scanner;
public class TowerOfHanoiMoves {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter number of disks:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int from = 1;
		int dest = 3;
		int aux = 2;
		tower(n,from,aux,dest);
		
	}
	static void  tower(int n,int from,int aux,int dest) {
		if(n==1) {
			System.out.println("Move disk "+n+" from "+from+" to "+dest);
		}
		else {
			tower(n-1,from,dest,aux);
			System.out.println("Move disk "+n+" from "+from+" to "+dest);
			tower(n-1,aux,from,dest);
		}
	}
}
