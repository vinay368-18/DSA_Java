package gfg.SetsInterFace;
import java.util.*;
public class typesOfSets {

	public static void main(String[] args) {
		String[] fruits = {"bannana","orange","apple"};
		
		Set <String> hashset = new HashSet<>(Arrays.asList(fruits));
		System.out.println("HashSet:"+hashset);
		
		Set<String> linkedhashset = new LinkedHashSet<>(Arrays.asList(fruits));
		System.out.println("Linked Hash Set:"+linkedhashset);
		
		Set<String> treeset = new TreeSet<>(Arrays.asList(fruits));
		System.out.println("TreeSet:"+treeset);
	}

}
