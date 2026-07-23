package gfg.LinkedList;

public class searchInLinkedList {

	public static void main(String[] args) {
		node head = new node(10);
		head.next = new node(20);
		head.next.next = new node(30);
		head.next.next.next  = new node(40);
		head.next.next.next.next  = new node(50);
		boolean r = searchKey(head,30);
		System.out.println("Is 30 present in Linked List:"+r);
	}
	static boolean searchKey(node head,int key) {
		node temp = head;
		while(temp!=null) {
			if(temp.data == key)
				return true;
			temp = temp.next;
		}
		return false;
	}

}
