package Leet_Code.DynamicProgramming;
import java.util.*;
public class pascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int n = sc.nextInt();
		List<List<Integer>> l = generate(n);
		System.out.println(l);
	}

	static List<List<Integer>> generate(int n) {
		List<List<Integer>> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			List<Integer> row = new ArrayList<>();
			for(int j=0;j<=i;j++) {
				if(j==0 || j==i)
					row.add(1);
				else
					row.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
			}
			list.add(row);
		}

		return list;
	}
	

}
