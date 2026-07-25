package gfg.Graphs;
import java.util.*;
public class GraphImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int v;
		System.out.println("Enter number of vertices in graph");;
		v = sc.nextInt();
		List<List<Integer>> adj = new ArrayList<>(4); // 0 to 3 
		for(int i=0;i<v;i++)
			adj.add(new ArrayList<>());
		addEdge(adj,0,1);
		addEdge(adj,0,3);
		addEdge(adj,0,2);
		display(adj,v);
		
	}
	static void addEdge(List<List<Integer>> adj,int i,int j) {
		adj.get(i).add(j);
		adj.get(j).add(i);
	}
	static void display(List<List<Integer>> adj,int v) {
		for(int i=0;i<v;i++) {
			System.out.print(i+" : ");
			for(int j:adj.get(i))
				System.out.print(j+" ");
			System.out.println();
		}
	}
}
