package Leet_Code.BitManipulation;

public class countingBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int[] arr = countBits(n);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	static int[] countBits(int n) {
		int[] arr = new int[n+1];
		for(int i=1;i<=n;i++)
			arr[i] = arr[i>>1]+ (i&1);
		return arr;
	}
	

}
