package Leet_Code.BinarySearch;

public class searchTwoDMatrix {

	public static void main(String[] args) {

		int[][] matrix = {
				{1, 3, 5, 7},
				{10, 11, 16, 20},
				{23, 30, 34, 60}
		};

		int target = 16;

		System.out.println(searchMatrix(matrix, target));
	}

	static boolean searchMatrix(int[][] matrix, int target) {

		int m = matrix.length;
		int n = matrix[0].length;

		int i;
		int j = 0;

		for (i = 1; i < m; i++) {
			if (target < matrix[i][0]) {
				j = i - 1;
				break;
			}
		}

		if (i == m)
			j = m - 1;

		int low = 0;
		int high = n - 1;

		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (matrix[j][mid] == target)
				return true;
			else if (matrix[j][mid] < target)
				low = mid + 1;
			else
				high = mid - 1;
		}

		return false;
	}
}