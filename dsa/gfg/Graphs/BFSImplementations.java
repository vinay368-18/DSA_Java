package gfg.Graphs;
import java.util.*;
public class BFSImplementations {
	public static void main(String[] args) {
		int v;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of vertices:");
		v = sc.nextInt();
		List<List<Integer>> adj = new ArrayList<>(v);
		for(int i=0;i<v;i++)
			adj.add(new ArrayList<>());
		adj.get(0).add(2);
		adj.get(0).add(3);
		adj.get(0).add(1);
		adj.get(2).add(4);
		List<Integer> list = new ArrayList<>();
		list = bfs(adj,v);
		System.out.println(list);
	}
	static List<Integer> bfs(List<List<Integer>> adj,int v){
		List<Integer> list = new ArrayList<>();
		Queue<Integer> q = new LinkedList<>();
		boolean[] vis = new boolean[v];
		q.offer(0);
		vis[0] = true;
		while(q.isEmpty()==false) {
			int curr = q.poll();
			list.add(curr);
			for(int x:adj.get(curr)) {
				if(!vis[x]) {
					q.offer(x);
					vis[x] = true;
				}
			}
				
		}
		return list;
	}
}
