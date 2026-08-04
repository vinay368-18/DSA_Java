package GfgPractice.Backtracking;
import java.util.*;
public class RatInMaze {

	public static void main(String[] args) {
		int[][] maze = {{1, 0, 0, 0},
						{1, 1, 0, 1}, 
						{1, 1, 0, 0},
						{0, 1, 1, 1}};
		for(int i=0;i<maze.length;i++) {
			for(int j=0;j<maze[0].length;j++) {
				System.out.print(maze[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		ArrayList<String> list = ratInMaze(maze);
		System.out.println(list);
	}

	static ArrayList<String> ratInMaze(int[][] maze) {
		
		ArrayList<String> list = new ArrayList<>();
		int n = maze.length;
		if(maze[0][0] == 0)
			return list;
		boolean[][] vis = new boolean[n][n];
		backtrack(maze,0,0,n,vis,"",list);
		Collections.sort(list);
		return list;
	}

	static void backtrack(int[][] maze,int i,int j,int n,boolean[][] vis,String path, ArrayList<String> list){
		if(i<0 || j<0 || i>=n || j>=n)
			return ;
		if(maze[i][j] == 0 || vis[i][j] == true)
			return;
		
		if(i==n-1 && j==n-1) {
			list.add(path);
			return;
		}
		
		vis[i][j] = true;
		
		backtrack(maze,i-1,j,n,vis,path+'U',list);
		backtrack(maze,i+1,j,n,vis,path+'D',list);
		backtrack(maze,i,j-1,n,vis,path+'L',list);
		backtrack(maze,i,j+1,n,vis,path+'R',list);
		
		
		vis[i][j] = false;		
	}
}
