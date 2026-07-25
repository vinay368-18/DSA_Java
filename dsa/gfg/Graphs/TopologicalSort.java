package gfg.Graphs;

import java.util.*;

public class TopologicalSort {

    public static void main(String[] args) {

        int V = 4;

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        addEdge(adj, 3, 0);
        addEdge(adj, 1, 0);
        addEdge(adj, 2, 0);

        List<Integer> ans = topoSort(adj, V);
        System.out.println(ans);
    }

    static void addEdge(List<List<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
    }

    static List<Integer> topoSort(List<List<Integer>> adj, int V) {

        List<Integer> list = new ArrayList<>();
        int[] indegree = new int[V];

        for (int i = 0; i < V; i++) {
            for (int x : adj.get(i))
                indegree[x]++;
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0)
                q.offer(i);
        }

        while (!q.isEmpty()) {
            int curr = q.poll();
            list.add(curr);

            for (int x : adj.get(curr)) {
                indegree[x]--;

                if (indegree[x] == 0)
                    q.offer(x);
            }
        }

        return list;
    }
}