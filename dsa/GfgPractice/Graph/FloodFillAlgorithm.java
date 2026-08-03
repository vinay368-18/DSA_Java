package GfgPractice.Graph;

public class FloodFillAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] image = {{1, 1, 1, 0}, {0, 1, 1, 1}, {1, 0, 1, 1}};
		for(int i=0;i<image.length;i++) {
			for(int j=0;j<image[0].length;j++) {
				System.out.print(image[i][j]+" ");
			}
			System.out.println();
		}
		int starting_row = 1;
		int starting_col = 2;
		int newCol = 2;
		int[][] newImg = floodFill(image,starting_row,starting_col,newCol);
		System.out.println("\nNew Image");
		for(int i=0;i<image.length;i++) {
			for(int j=0;j<image[0].length;j++) {
				System.out.print(image[i][j]+" ");
			}
			System.out.println();
		}
	}

	static int[][] floodFill(int[][] image, int sr, int sc, int newCol) {
		int original_col = image[sr][sc];
		if(original_col== newCol)
			return image;
		dfs(image,sr,sc,original_col,newCol);
		return image;
	}
	static void dfs(int[][]image,int r,int c,int ori_col,int newCol) {
		int m = image.length;
		int n = image[0].length;
		
		if(r<0 || r >=m || c<0 || c>=n)
			return ;
		if(image[r][c]!=ori_col)
			return;
		image[r][c] = newCol;
		dfs(image,r-1,c,ori_col,newCol);
		dfs(image,r+1,c,ori_col,newCol);
		dfs(image,r,c-1,ori_col,newCol);
		dfs(image,r,c+1,ori_col,newCol);
	}
}
