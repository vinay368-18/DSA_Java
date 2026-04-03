package gfg.Strings;

public class Panagram {

	public static void main(String[] args) {
		
		String s1 = "Bawds jog, flick quartz, vex nymph";
		String s2 = " Hello World";
		System.out.println("Original strings");
		System.out.println("String 1:"+s1);
		System.out.println("String 2:"+s2);
		
		System.out.println("\n\nAre strings panagram");
		System.out.println("String 1:"+checkPanagram(s1));
		System.out.println("String 2:"+checkPanagram(s2));
		
	}

	static boolean checkPanagram(String s) {
		
		s = s.toLowerCase();
		boolean[] present = new boolean[26];
		for(int i =0; i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z') {
				present[ch-'a'] = true;
			}
		}
		for(int i=0;i<26;i++) {
			if(present[i]!=true)
				return false;
		}
		return true;
	}
	


}
