package GfgPractice.HashMap;
import java.util.*;
public class NonRepeatingCharacter {

	public static void main(String[] args) {
		String s = "geeksforgeeks";
		System.out.println("Non Repeating char in string:"+nonRepeatingChar(s));

	}

	static char nonRepeatingChar(String s) {
		Map<Character,Integer> map = new LinkedHashMap<>();
		char[] arr = s.toCharArray();
		for(char i:arr) {
			if(map.containsKey(i)) {
				int val = map.get(i) + 1;
				map.replace(i,val);
			}
			else
				map.put(i,1);
		}
		Iterator<Character> it = map.keySet().iterator();
		while(it.hasNext()) {
			char key = it.next();
			if(map.get(key)==1)
				return key;
		}
		return '$';
	}
}
