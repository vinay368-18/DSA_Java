package Leet_Code.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"flower","flow","flight"};
		String p = commonPrefix(strs);
		System.out.println(p);
	}

	static String commonPrefix(String[] strs) {
		if(strs==null || strs.length ==0)
			return "";
		String prefix = strs[0];
		for(int i=1;i<strs.length;i++) {
			while(!strs[i].startsWith(prefix)) {
				prefix = prefix.substring(0,prefix.length()-1);
				if(prefix.isEmpty())
					return "";
			}
		}
		return prefix;
	}
	
}
