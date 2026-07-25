package gfg.Graphs;

public class countIslands {

    public static void main(String[] args) {

        char[][] grid = {
                {'L','L','W','W','W'},
                {'W','L','W','W','L'},
                {'L','W','W','L','L'},
                {'W','W','W','W','W'},
                {'L','W','L','L','W'}
        };

        System.out.println(countislands(grid));
    }

    static int countislands(char[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        boolean[][] vis = new boolean[n][m];
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == 'L' && !vis[i][j]) {
                    dfs(grid, vis, i, j);
                    count++;
                }
            }
        }

        return count;
    }

    static void dfs(char[][] grid, boolean[][] vis, int row, int col) {

        vis[row][col] = true;

        int[] dr = {-1,-1,-1,0,0,1,1,1};
        int[] dc = {-1,0,1,-1,1,-1,0,1};

        for (int i = 0; i < 8; i++) {

            int nr = row + dr[i];
            int nc = col + dc[i];

            if (nr >= 0 && nr < grid.length &&
                nc >= 0 && nc < grid[0].length &&
                grid[nr][nc] == 'L' &&
                !vis[nr][nc]) {

                dfs(grid, vis, nr, nc);
            }
        }
    }
}