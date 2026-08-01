package GfgPractice.LinkedList;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		next = null;
	}
}
public class AddOneToLinkedList {

	public static void main(String[] args) {
		Node head = new Node(9);
		head.next = new Node(9);
		head.next.next = new Node(9);
		Solution obj = new Solution();
		head = obj.addOne(head);
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
}
class Solution{

	Node addOne(Node head) {
		Node prev=null,curr=head;
		while(curr.next!=null) {
			prev = curr;
			curr = curr.next;
		}
		if(curr.data!=9) {
			curr.data += 1;
		}
		else {
			if(prev == null) {
				Node newHead = new Node(1);
		        newHead.next = head;
		        head = newHead;
		        head.next.data = 0;
		        return head;
			}
			while(prev.data == 9 && prev!=head) {
				Node temp = head;
				while(temp.next!=prev && temp.next!=null)
					temp = temp.next;
				prev = temp;
			}
			if(prev==head && prev.data == 9) {
				Node newhead = new Node(1);
				newhead.next = head;
				head = newhead;
				Node temp = head.next;
				while(temp!=null) {
					temp.data = 0;
					temp = temp.next;
				}
			}
			else {
				prev.data+=1;
				prev = prev.next;
				while(prev!=null) {
					prev.data = 0;
					prev = prev.next;
				}
			}
		}
		return head;
	}
}
