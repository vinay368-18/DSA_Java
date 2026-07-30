package GfgPractice.strings;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "geeks";
		String s2 = "kseeg";
		System.out.println("Is Anagram:"+areAnagrams(s1,s2));
	}

	static boolean areAnagrams(String s1, String s2) {
		if(s1.length()!=s2.length())
			return false;
		int[] freq = new int[26];
		
		for(int i=0;i<s1.length();i++) 
			freq[s1.charAt(i) - 'a'] += 1;
		
		for(int i=0;i<s2.length();i++)
			freq[s2.charAt(i) - 'a'] -= 1;
		
			
		for(int i=0;i<26;i++)
			if(freq[i]!=0)
				return false;
		return true;
	}
}
