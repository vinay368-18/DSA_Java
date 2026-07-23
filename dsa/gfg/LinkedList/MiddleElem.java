package gfg.LinkedList;

public class MiddleElem {

	public static void main(String[] args) {
		node head = new node(10);
		head.next = new node(20);
		head.next.next = new node(30);
		head.next.next.next  = new node(40);
		head.next.next.next.next  = new node(50);
		head.next.next.next.next.next  = new node(60);
		int middle = getMiddle(head);
		System.out.println("Middle Elem:"+middle);
	}
	static int getMiddle(node head) {
		node temp = head;
		int len = 0;
		while(temp != null) {
			len++;
			temp = temp.next;
		}
		if(len%2 == 0) {
			len = len +2;
			len = len/2;
		}
		else {
			len = len + 1;
			len = len/2;
		}
		temp = head;
		for(int i=0;i<len-1;i++)
			temp = temp.next;
		return temp.data;
	}

}
