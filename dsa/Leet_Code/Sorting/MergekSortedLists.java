package Leet_Code.Sorting;
import java.util.*;
class ListNode {
	 int val;
	 ListNode next;
	 ListNode() {}
	 ListNode(int val) { this.val = val; }
	 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class MergekSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode list1 = new ListNode(1);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(5);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode list3 = new ListNode(2);
        list3.next = new ListNode(6);

        ListNode[] lists = {list1, list2, list3};
        
		ListNode r = mergeKLists(lists);
		while(r!=null) {
			System.out.print(r.val + " ");
			r = r.next;
		}
		
	}
	static ListNode mergeKLists(ListNode[] lists) {
	        PriorityQueue<ListNode> q = new PriorityQueue<>((a,b) -> a.val - b.val);
	        for(ListNode list:lists) {
	        	if(list!=null) {
	        		q.add(list);
	        	}
	        }
	        ListNode head = new ListNode(0);
	        ListNode temp = head;
	        while(q.isEmpty()==false) {
	        	temp.next = q.poll();
	        	temp = temp.next;
	        }
	        return head.next;
	}
	        
}
