package gfg.Queue;

import java.util.*;

public class bfsTraversal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();

        int[][] a = new int[n][n];

        System.out.println("Enter adjacency matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        ArrayList<Integer> list = bfs(a, n);

        System.out.println("BFS traversal: " + list);
        sc.close();
    }

    static ArrayList<Integer> bfs(int[][] a, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();

        visited[0] = true;
        q.add(0);
        while(q.isEmpty()==false) {
        	int i = q.remove();
        	list.add(i);
        	for(int j=0;j<n;j++) {
        		if(a[i][j] == 1 && visited[j]==false) {
        			q.add(j);
        			visited[j] = true;
        		}
        	}
        }

        return list;
    }
}