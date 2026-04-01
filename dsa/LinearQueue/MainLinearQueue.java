package LinearQueue;
import java.util.Scanner;
public class MainLinearQueue {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Queue size");
		int n = sc.nextInt();
		LinearQueue q = new LinearQueue(n);
		q.enqueue(10);
		q.display();
		q.enqueue(20);
		q.display();
		q.enqueue(100);
		q.display();
		q.enqueue(25);
		q.display();
		q.enqueue(77);
		q.display();
		q.enqueue(18);
		q.display();
		q.dequeue();
		q.display();
		q.dequeue();
		q.display();
		q.dequeue();
		q.display();
		q.dequeue();
		q.dequeue();
		q.display();

	}

}
