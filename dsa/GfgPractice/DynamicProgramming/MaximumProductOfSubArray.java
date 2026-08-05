package GfgPractice.DynamicProgramming;

public class MaximumProductOfSubArray {

	public static void main(String[] args) {
		int[] arr = {-2, 6, -3, -10, 0, 2};
		System.out.println(maxProduct(arr));
	}

	static int maxProduct(int[] arr) {
		int minProd = arr[0];
		int maxProd = arr[0];
		int ans = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<0) {
				int temp = minProd;
				minProd = maxProd;
				maxProd = temp;
			}
			minProd = Math.min(arr[i],minProd*arr[i]);
			maxProd = Math.max(arr[i], maxProd*arr[i]);
			ans = Math.max(ans, maxProd);
		}
		
		return ans;
	}
	

}
