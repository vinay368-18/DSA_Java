package gfg.Strings;

public class Palindrome {

	public static void main(String[] args) {
		
		String s1 = "Madam";
		String s2 = "NMIT";
		System.out.println("Strings");
		System.out.println("String 1:"+s1);
		System.out.println("String 2:"+s2);
		System.out.println("\nPalindrome Status");
		System.out.println("String 1:"+checkPalindrome(s1));
		System.out.println("String 2:"+checkPalindrome(s2));
	}
	static boolean checkPalindrome(String s) {
		s = s.toLowerCase();	// to avoid case senstive
		int i =0;
		int j = s.length()-1;
		while(i<j) {
			if(s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

}
