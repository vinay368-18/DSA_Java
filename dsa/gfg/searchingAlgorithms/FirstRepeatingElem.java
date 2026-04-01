package gfg.searchingAlgorithms;

public class FirstRepeatingElem {

	public static void main(String[] args) {
		
		int[] arr = {20,21,22,23,21,22,25,30};
		
		int i = repeatingelem(arr);
		
		if(i!=-1) {
			System.out.println("First Repeating elem is:"+arr[i-1]+" and it is found at index:"+i);
		}
		else {
			System.out.println("No repeating element");
		}

	}
	
	
	static int repeatingelem(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j])
					return i+1;
			}
		}
		return -1;
	}

}
