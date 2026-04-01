package gfg.searchingAlgorithms;

public class SecondLargest {

	public static void main(String[] args) {
		
		int[] arr = {20,30,40,50,12,10};
		
		int sec_largest = get_sec_largest(arr);
		
		if(sec_largest!=-1) {
			System.out.println("Second Largest:"+sec_largest);
		}
		else {
			System.out.println("No second Largest element");
		}
	}
	
	static int get_sec_largest(int[] arr) {
		int fl = -1;
		int sl = -1;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>fl) {
				sl = fl;
				fl = arr[i];
			}
			
			else if(arr[i]>sl && arr[i]!=fl) {
				sl = arr[i];
			}
			
		}
		return sl;
		
	}
	

}
