package gfg.Queue;

import java.util.*;

public class queueOperations {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("Initial Queue: " + q);
        System.out.println("offer(40): " + q.offer(40));
        System.out.println("Queue after offer: " + q);

        System.out.println("peek(): " + q.peek());
        System.out.println("element(): " + q.element());

        System.out.println("remove(): " + q.remove());
        System.out.println("poll(): " + q.poll());
        System.out.println("Queue after removal: " + q);

        System.out.println("contains(30): " + q.contains(30));
        System.out.println("size(): " + q.size());

        System.out.println("remove(30): " + q.remove(30));
        System.out.println("Queue: " + q);

        System.out.println("poll(): " + q.poll());
        System.out.println("poll() on empty queue: " + q.poll());

        System.out.println("isEmpty(): " + q.isEmpty());
        System.out.println("peek() on empty queue: " + q.peek());

        q.add(50);
        q.add(60);
        System.out.println("Before clear: " + q);

        q.clear();
        System.out.println("After clear: " + q);
        System.out.println("isEmpty(): " + q.isEmpty());
    }
}
