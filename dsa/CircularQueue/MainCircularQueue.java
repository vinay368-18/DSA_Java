package dsa.CircularQueue;
import java.util.Scanner;
public class MainCircularQueue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter size of queue");
		n=sc.nextInt();
		CircularQueue q= new CircularQueue(n);
		q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        q.display();
        q.peek();

        q.dequeue();
        q.dequeue();

        q.display();

        q.enqueue(50);
        q.enqueue(60);

        q.display();

        q.enqueue(70);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.display();

	}

}
