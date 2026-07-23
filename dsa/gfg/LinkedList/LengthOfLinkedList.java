package gfg.LinkedList;

public class LengthOfLinkedList {

	public static void main(String[] args) {
		
		node head = new node(10);
		head.next = new node(20);
		head.next.next = new node(30);
		head.next.next.next  = new node(40);
		head.next.next.next.next  = new node(50);
		int length = getCount(head);
		System.out.println("Length:"+length);
	}
	static int getCount(node head) {
		node temp = head;
		int l = 0; 
		while(temp!=null) {
			l++;
			temp = temp.next;
		}
		return l;
	}
}
