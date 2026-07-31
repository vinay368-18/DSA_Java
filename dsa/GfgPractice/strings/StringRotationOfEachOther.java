package GfgPractice.strings;
import java.util.*;
public class StringRotationOfEachOther {
	public static void main(String[] args) {
		String s1,s2;
		s1 = "abcd";
		s2 = "cdab";
		boolean r = areRotations(s1,s2);
		System.out.println(r);
	}
	static boolean areRotations(String s1,String s2) {
		s1 = s1+s1;
		return s1.contains(s2);	
	}

}
