package GfgPractice.searching;

public class PeakElem {

	public static void main(String[] args) {
		int[] arr = {1, 2, 4, 5, 7, 8, 3};
		int index = peakElement(arr);
		System.out.println(arr[index]+" is the peak elem");
	}
	static int peakElement(int[] arr) {
		if(arr.length==1)
			return 0;
		for(int i=1;i<arr.length-1;i++) {
			if(arr[i-1]<arr[i] && arr[i]>arr[i+1])
				return i;
		}
		if(arr[0]>arr[1])
			return 0; 
		if((arr[arr.length-1]) > (arr[arr.length-2]))
			return arr.length-1;
		return -1;
	}

}
