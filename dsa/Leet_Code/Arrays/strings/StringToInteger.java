package Leet_Code.Arrays.strings;
import java.util.*;
public class StringToInteger {

	public static void main(String[] args) {
		String  s = " -42";
		int num = myAtoi(s);
		System.out.println(num);
	}

	static int myAtoi(String s) {
		s = s.trim();
		String num = "";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if((ch == '-' || ch == '+') && i==0)
				num+=ch;
			else if(Character.isDigit(ch))
				num+=ch;
			else
				break ;
		}
		if(num.equals("+")||num.equals("-")||num.equals(""))
			return 0;
		return Integer.parseInt(num);
	}
	

}
