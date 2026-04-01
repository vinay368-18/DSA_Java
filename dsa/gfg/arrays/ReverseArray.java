package gfg.arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = {25,55,75,95,105};
		System.out.println("Original array");
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		reverse(arr);
		System.out.println("After reversing");
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
	
	static void reverse(int[] arr) {
		
		int i=0,j=arr.length-1;
		int temp;
		while(i<j) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
