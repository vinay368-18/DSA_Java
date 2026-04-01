package CircularQueue;

public class CircularQueue {
	
	int max;
	int[] q;
	int f,r;
	CircularQueue(int max){
		if(max<=0) {
			throw new IllegalArgumentException("Invalid size");
		}
		this.max = max;
		f=-1;
		r=-1;
		q= new int[this.max];
	}
	
	void enqueue(int elem) {
		if(f==(r+1)%max) {  	// overflow
			System.out.println("Queue OverFlow:queue is full");
			return ;
		}
		else if(r == -1) {
			//adding first element
			f=0;
			r=0;
			q[r] = elem;
			System.out.println(q[r]+" is added to queue");
			return ;
		}
		else {
			r=(r+1)%max;
			q[r] = elem;
			System.out.println(q[r]+" is added to queue");
			return ;
		}	
	}
	
	
	void dequeue() {
		
		if(f==-1) {
			System.out.println("Queue UnderFlow:Queue is empty");
			return;
		}
		else if(f==r) {
			System.out.println(q[f]+" is dequeued from queue");
			f=-1;
			r=-1;
			System.out.println("Now Queue is empty");
			return ;
		}
		else {
			System.out.println(q[f]+" is dequeued from queue");
			f=(f+1)%max;
			return;
		}
	
	}
	
	
	void peek() {
		if(f==-1) {
			System.out.println("Queue is empty");
			return;
		}
		else {
			System.out.println(q[f]+" is the front element in queue");
		}
	}
	
	void display() {
		if(f==-1) {
			System.out.println("Queue is empty");
			return;
		}
		else {
			int i = f;
			System.out.println("Queue elements are");
			while(true) {
				System.out.println(q[i]+" ");
				if(i==r)
					break;
				i=(i+1)%max;
			}
		}
		System.out.println();
	}
}
