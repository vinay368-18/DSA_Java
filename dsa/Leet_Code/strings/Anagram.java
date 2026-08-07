package Leet_Code.strings;
import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		List<List<String>> list = groupAnagrams(strs);
		System.out.println(list);
	}

	static List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String,List<String>> map = new HashMap<>();
		for(String str:strs) {
			char[] ch = str.toCharArray();
			Arrays.sort(ch);
			String s = new String(ch);
			if(map.containsKey(s) == false) {
				map.put(s,new ArrayList<>());
			}
			map.get(s).add(str);
		}
		return new ArrayList<>(map.values());
	}
}
