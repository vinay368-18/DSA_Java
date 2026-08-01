package GfgPractice.LinkedList;
import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(20);
		head.next.next.next = new Node(25);
		removeDupClass obj = new removeDupClass();
		head = obj.removeDuplicates(head);
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
}
class removeDupClass{
	Node removeDuplicates(Node head) {
		Set<Integer> set = new HashSet<>();
		Node temp = head;
		Node prev = null;
		while(temp!=null) {
			
			if(!set.contains(temp.data)) {
				set.add(temp.data);
				prev = temp;
				temp = temp.next;
			}
			else {
				prev.next = temp.next;
				temp = temp.next;
			}
			
		}
		return head;
	}
}
