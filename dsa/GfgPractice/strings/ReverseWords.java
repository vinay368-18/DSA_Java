package GfgPractice.strings;
public class ReverseWords {

	public static void main(String[] args) {
		String s = "i.like.this.program.very.much";
		String r = reverseWords(s);
		System.out.println(r);
	}

	static String reverseWords(String s) {
		String[] str = s.split("\\.");
		int j=str.length-1;
		int i=0;
		String temp;
		while(i<=j ) {
			temp = str[i];
			str[i] = str[j];
			str[j] = temp;
			i++;
			j--;
		}
		StringBuilder sb = new StringBuilder();
		for(i=0;i<str.length;i++) {
			sb.append(str[i]);
			sb.append(".");
		}
		sb.delete(sb.length()-1, sb.length());
		
		
		
		return sb.toString();
				
		
	}

}
