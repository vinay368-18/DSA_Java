package gfg.searchingAlgorithms;

public class BotanicPoint {

	public static void main(String[] args) {
		
		int[] arr = {2,5,8,10,15,9,7,3,1};
		int botanic = findMaximum(arr);
		if(botanic == arr.length-1) {
			System.out.println("Elements before "+botanic+" are increasing");
		}
		else if(botanic == 0){
			System.out.println("Elements after "+botanic+" are decreasing");
		}
		else {
			System.out.println("Elements before "+botanic+" are increasing");
			System.out.println("Elements after "+botanic+" are decreasing");
		}
	}
	
	
	static int findMaximum(int[] arr) {
		int low=0,high =arr.length-1;
		while(low<high) {
			int mid = (low+high)/2;
			if(arr[mid]<arr[mid+1]) {
				low = mid+1;
			}
			else {
				high = mid;		// must include mid to next iteration bcz mid can be botanic point
			}
		}
		return arr[low];
	}



}
