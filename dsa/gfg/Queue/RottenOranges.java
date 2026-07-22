package gfg.Queue;

import java.util.*;

public class RottenOranges {

    public static void main(String[] args) {
        int[][] a = {
            {2, 1, 0, 2, 1},
            {1, 0, 1, 2, 1},
            {1, 0, 0, 2, 1}
        };

        int r = orangesRot(a);
        System.out.println(r); // 2
    }

    static int orangesRot(int[][] a) {
        int rows = a.length;
        int cols = a[0].length;

        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;

        // Add all initially rotten oranges to queue
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (a[i][j] == 2) {
                    q.add(new int[]{i, j});
                } else if (a[i][j] == 1) {
                    fresh++;
                }
            }
        }

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        int time = 0;

        while (!q.isEmpty() && fresh > 0) {
            int size = q.size();

            // One complete BFS level = one minute
            for (int x = 0; x < size; x++) {
                int[] current = q.remove();
                int r = current[0];
                int c = current[1];

                for (int d = 0; d < 4; d++) {
                    int nr = r + dr[d];
                    int nc = c + dc[d];

                    if (nr >= 0 && nr < rows &&
                        nc >= 0 && nc < cols &&
                        a[nr][nc] == 1) {

                        a[nr][nc] = 2;
                        fresh--;
                        q.add(new int[]{nr, nc});
                    }
                }
            }

            time++;
        }

        return fresh == 0 ? time : -1;
    }
}