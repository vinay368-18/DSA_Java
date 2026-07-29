package GfgPractice.Arrays;

import java.util.Arrays;

public class MissingInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,5};
		int elem = missingNum(arr);
		System.out.println(elem);
	}

	static int missingNum(int[] arr) {
		 Arrays.sort(arr);
	        int largest=0;
	        for(int i=0;i<arr.length;i++){
	            if(arr[i]>largest)
	                largest = arr[i];
	        }
	        int i=0;
	        for(int elem=1;elem<=largest;elem++){
	            if(arr[i++] != elem)
	                return elem;
	        }
	    
	        return largest+1;
	}
}
