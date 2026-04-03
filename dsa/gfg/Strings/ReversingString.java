package gfg.Strings;

public class ReversingString {

	public static void main(String[] args) {
		
		String name = "Vinay";
		System.out.println("Original String:"+name);
		String r = Reverse(name);
		System.out.println("Reversed String:"+r);
		
	}
	static String Reverse(String s) {
		char[] arr = s.toCharArray();
		char t;
		int i =0,j=arr.length-1;
		while(i<j) {
			t = arr[i];
			arr[i] = arr[j];
			arr[j]= t;
			i++;
			j--;
		}
		return new String(arr);
	}
}
