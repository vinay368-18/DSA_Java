package gfg.Stack;
import java.util.*;
public class nextGreatestElem {

	public static void main(String[] args) {
		int[] arr = {1,3,2,4};
		ArrayList<Integer> l = new ArrayList<>();
		l = nextGreatest(arr);
		System.out.println("Result Array:"+l);
	}
	static ArrayList<Integer> nextGreatest(int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		ArrayDeque<Integer> s = new ArrayDeque<>();
		for(int i=0;i<arr.length;i++) {
			int j = i+1;
			while(j<arr.length) {
				if(arr[i]<arr[j]) {
					list.add(arr[j]);
					break;
				}
				j++;
			}
			if(j==arr.length)
				list.add(-1);
		}
		return list;
	}
}
