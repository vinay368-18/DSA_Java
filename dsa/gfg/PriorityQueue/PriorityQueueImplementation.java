package gfg.PriorityQueue;
import java.util.*;
public class PriorityQueueImplementation {

	public static void main(String[] args) {
		PriorityQueue<Integer> minheap = new PriorityQueue<>(); //min heap
		PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder()); //max heap
		
		minheap.add(50);
		minheap.add(30);
		minheap.add(70);
		minheap.add(80);
		minheap.add(20);
		minheap.add(40);
		
		maxheap.add(50);
		maxheap.add(30);
		maxheap.add(70);
		maxheap.add(80);
		maxheap.add(20);
		maxheap.add(40);
		
		Iterator<Integer> it1 = minheap.iterator();
		Iterator<Integer> it2 = maxheap.iterator();
		System.out.println("PriorityQueue or Heap (min):");
		while(it1.hasNext())
			System.out.print(it1.next()+" ");
		System.out.println();
		System.out.println("PriorityQueue or Heap (min):");
		while(it2.hasNext())
			System.out.print(it2.next()+" ");
		System.out.println();
		System.out.println("Peak Elem of min heap:"+minheap.peek());
		System.out.println("Peak Elem of max heap:"+maxheap.peek());
		
		
	}

}
