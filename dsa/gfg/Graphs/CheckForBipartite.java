package gfg.Graphs;

import java.util.*;

public class CheckForBipartite {

    public static void main(String[] args) {

        int V = 3;

        int[][] edges = {
                {0, 1},
                {1, 2}
        };

        System.out.println(isBipartite(V, edges));
    }

    static boolean isBipartite(int V, int[][] edges) {

        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int[] color = new int[V];
        Arrays.fill(color, -1);

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < V; i++) {

            if (color[i] != -1)
                continue;

            color[i] = 0;
            q.offer(i);

            while (!q.isEmpty()) {

                int curr = q.poll();

                for (int x : adj.get(curr)) {

                    if (color[x] == -1) {
                        color[x] = 1 - color[curr];
                        q.offer(x);
                    } else if (color[x] == color[curr]) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}