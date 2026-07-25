package gfg.Graphs;
import java.util.*;

public class DFSImplementation {
    public static void main(String[] args) {
        int v;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertices:");
        v = sc.nextInt();

        List<List<Integer>> adj = new ArrayList<>(v);
        for(int i = 0; i < v; i++)
            adj.add(new ArrayList<>());

        adj.get(0).add(2);
        adj.get(0).add(3);
        adj.get(0).add(1);
        adj.get(2).add(4);

        List<Integer> list = dfs(adj, v);
        System.out.println(list);

        sc.close();
    }

    static List<Integer> dfs(List<List<Integer>> adj, int v) {
        List<Integer> list = new ArrayList<>();
        boolean[] vis = new boolean[v];

        dfsTraversal(0, adj, vis, list);

        return list;
    }

    static void dfsTraversal(int curr, List<List<Integer>> adj,
                             boolean[] vis, List<Integer> list) {

        vis[curr] = true;
        list.add(curr);

        for(int x : adj.get(curr)) {
            if(!vis[x]) {
                dfsTraversal(x, adj, vis, list);
            }
        }
    }
}