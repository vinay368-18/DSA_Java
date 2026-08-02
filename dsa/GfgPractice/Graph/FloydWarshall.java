package GfgPractice.Graph;

public class FloydWarshall {

	public static void main(String[] args) {
		int dist[][] = {{0, 4, 108, 5, 108}, {108, 0, 1, 108, 6},
				{2, 108, 0, 3, 108}, {108, 108, 1, 0, 2}, 
				{1, 108, 108, 4, 0}};
		System.out.println("original Distance");
		for(int i=0;i<dist.length;i++) {
			for(int j=0;j<dist.length;j++) {
				System.out.print(dist[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("All Pair shortest path");
		floydWarshall(dist);
		for(int i=0;i<dist.length;i++) {
			for(int j=0;j<dist.length;j++) {
				System.out.print(dist[i][j]+"\t");
			}
			System.out.println();
		}
	}

	static void floydWarshall(int[][] dist) {
		// TODO Auto-generated method stub
		for(int k=0;k<dist.length;k++) {
			for(int i=0;i<dist.length;i++) {
				for(int j=0;j<dist.length;j++) {
					if(dist[i][j]>dist[i][k]+dist[k][j] && dist[i][k] != 100000000 && dist[k][j] != 100000000)
						dist[i][j] = dist[i][k]+dist[k][j];
				}
			}
		}
	}

}
