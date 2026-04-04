package gfg.SetsInterFace;
import java.util.*;
public class Subset {

	public static void main(String[] args) {
		int[] a = {11, 7, 1, 13, 21, 3, 7, 3};
		int[] b= {11, 3, 7, 1, 7};
		System.out.println("Is B is a Subset of A:"+checkSubset(a,b));
	}

	static boolean checkSubset(int[] a,int[] b) {
		Set<Integer> set = new HashSet<>();
		for(int i:a) {
			set.add(i);
		}
		for(int i:b) {
			if(set.contains(i) == false)
				return false;
		}
		return true;
	}
	
}
