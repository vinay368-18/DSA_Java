package dsa.LinearQueue;

public class LinearQueue {
	
	int f=0;
	int r=-1;
	int[] q ;
	int max;
	LinearQueue(int max) {
		if(max>0) {
			this.max = max;
			q = new int[this.max];
		}
		else
			System.out.println("\nInvalid queue size");
	}
	
	void enqueue(int elem) {
		if(r == max-1) {
			System.out.println("\nQueue Overflow:Queue is full");
			return;
		}
		else {
			q[++r] = elem;
			System.out.println("\n"+q[r]+" is added to queue");
			return;
		}
	}
	
	void dequeue() {
		if(f>r) {
			System.out.println("\n"+"Queue Underflow:Queue is empty");
			return ;
		}
		else {
			int elem = q[f++];
			System.out.println("\n"+elem+" is dequeued from queue");
		}
	}
	
	void peek() {
		if(f>r) {
			System.out.println("\n"+"Queue is empty");
			return ;
		}
		else {
			System.out.println("\n"+q[r]+" is the last element in queue");
		}
	}
	
	
	void display() {
		if(f>r) {
			System.out.println("\n"+"Queue is empty");
			return ;
		}
		else{
			System.out.println("\n"+"Queue Elements are:");
			int i=f;
			while(i<=r) {
				System.out.print(q[i++]+" ");
			}
			System.out.println();
		}
	}
	
	
	
	
}
