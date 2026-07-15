package gfg.Queue;
import java.util.*;
class myStack{
	Queue <Integer> q = new LinkedList<>();
	void push(int x) {
		q.add(x);
		for(int i=0;i<q.size()-1;i++) {
			q.add(q.poll());
		}
	}
	int pop() {
		if(q.isEmpty())
			return -1;
		else
			return q.poll();
	}
	int top() {
		if(q.isEmpty())
			return -1;
		else
			return q.peek();
	}
	int size() {
			return q.size();
	}
}

class stackUsingQueue {

	public static void main(String[] args) {
		myStack s = new myStack();
		Scanner sc = new Scanner(System.in);
		int choice;
		int elem;
		while(true) {
			System.out.println("Enter your choice:");
			System.out.println("1.push\n2.pop\n3.top\n4.size\n5.exit");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter elem to push");
				elem = sc.nextInt();
				s.push(elem);
				System.out.println("push successful");
				break;
			case 2:
				elem = s.pop();
				if(elem == -1)
					System.out.println("Stack underflow");
				else
					System.out.println("popped elem:"+elem);
				break;
			case 3:
				elem = s.top();
				if(elem == -1)
					System.out.println("Stack is empty");
				else
					System.out.println("top most elem:"+elem);
				break;
			case 4:
				elem = s.size();
				if(elem == 0)
					System.out.println("Stack is empty");
				else
					System.out.println("size:"+elem);
				break;
			case 5:
				System.out.println("Exiting...");
				return;
			default:
				System.out.println("Inavlid choice try again");
			}
		}
		
	}
	
}
