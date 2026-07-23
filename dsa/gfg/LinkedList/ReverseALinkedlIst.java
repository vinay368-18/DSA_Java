package gfg.LinkedList;

public class ReverseALinkedlIst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node head = new node(10);
		head.next = new node(20);
		head.next.next = new node(30);
		head.next.next.next  = new node(40);
		head.next.next.next.next  = new node(50);
		head.next.next.next.next.next  = new node(60);
		node head = reverseList(head);
		System.out.println("Reversed Linked List:");
		node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	static node reverseList(node head) {
		node prev = null;
		node curr = head;
		node next = null;
		while(curr!=null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
}
