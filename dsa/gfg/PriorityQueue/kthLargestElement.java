package gfg.PriorityQueue;
import java.util.*;
public class kthLargestElement {

	public static void main(String[] args) {
		int[] arr = {12, 5, 787, 1, 23};
		int k = 2;
		ArrayList<Integer> list = new ArrayList<>();
		list = kLargest(arr,k);
		Iterator<Integer> it = list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
	static ArrayList<Integer> kLargest(int[] arr,int k){
		ArrayList<Integer> list = new ArrayList<>();
		PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
		for(int i: arr)
			q.add(i);
		while(k>0) {
			list.add(q.poll());
			k--;
		}
		return list;
	}
}
