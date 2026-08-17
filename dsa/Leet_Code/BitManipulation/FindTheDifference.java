package Leet_Code.BitManipulation;
import java.util.*;
public class FindTheDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two strings");
		String s = sc.next(); //abcd
		String t = sc.next(); //abcde
		System.out.println("char: "+ findTheDifference(s,t)); //e
		sc.close();
	}

	static char findTheDifference(String s, String t) {
		TreeMap<Character,Integer> map = new TreeMap<>();
		for(int i=0;i<t.length();i++) {
			if(!map.containsKey(t.charAt(i)))
				map.put(t.charAt(i),1);
			else {
				int freq = map.get(t.charAt(i));
				map.replace(t.charAt(i),freq+1);
			}
		}
		for(int i=0;i<s.length();i++) {
			if(map.containsKey(s.charAt(i))==true) {
				int f = map.get(s.charAt(i));
				f--;
				map.replace(s.charAt(i),f);
			}		
		}
		Iterator<Map.Entry<Character,Integer>> it = map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Character, Integer> entry = it.next();
			char key = entry.getKey();
			if(entry.getValue()!=0)
				return key;
		}
		return '0';
	}
}
