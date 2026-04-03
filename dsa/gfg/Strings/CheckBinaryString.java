package gfg.Strings;

public class CheckBinaryString {

	public static void main(String[] args) {
		
		String s1 = "0111010010";
		String s2 = "0110105681201";
		
		System.out.println("Original Strings");
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		
		boolean r1 = checkBinary(s1);
		boolean r2 = checkBinary(s2);
		
		System.out.println("Is given String binary");
		System.out.println("s1:"+r1);
		System.out.println("s2:"+r2);
		

	}
	static boolean checkBinary(String s) {
		char[] arr = s.toCharArray();
		int i = 0;
		while(i<arr.length) {
			if(arr[i]!='0' && arr[i]!='1')
				return false;
			i++;
		}
		return true;
	}
}
