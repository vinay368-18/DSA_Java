package GfgPractice.LinkedList;

public class Sort012InLinkedList {

	public static void main(String[] args) {
		Node head  = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(2);
		head.next.next.next = new Node(1);
		head.next.next.next.next = new Node(0);
		head = segregate(head);
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}

	static Node segregate(Node head) {
		int zero=0,one=0,two=0;
		Node temp = head;
		while(temp!=null) {
			if(temp.data==0)
				zero++;
			else if(temp.data==1)
				one++;
			else
				two++;
			temp = temp.next;
		}
		temp = head;
		while(temp!=null) {
			while(zero!=0) {
				temp.data = 0;
				zero--;
				temp = temp.next;
			}
			while(one!=0) {
				temp.data = 1;
				one--;
				temp = temp.next;
			}
			while(two!=0) {
				temp.data = 2;
				two--;
				temp = temp.next;
			}
		}
		return head;
	}
}
