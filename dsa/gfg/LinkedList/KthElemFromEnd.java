package gfg.LinkedList;

public class KthElemFromEnd {

	public static void main(String[] args) {
		node head = new node(10);
		head.next = new node(20);
		head.next.next = new node(30);
		head.next.next.next  = new node(40);
		head.next.next.next.next  = new node(50);
		int k = 3;
		System.out.println(k+"th elem from end:"+find(head,k));
		
	}
	static int find(node head,int k) {
		int len =0;
		node temp = head;
		while(temp!=null) {
			len++;
			temp = temp.next;
		}
		if(k>len)
			return -1;
		temp = head;
		for(int i=0;i<len-k;i++)
			temp = temp.next;
		return temp.data;
	}
}
