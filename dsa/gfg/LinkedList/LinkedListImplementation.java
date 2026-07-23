package gfg.LinkedList;
import java.util.*;
class node{
	int data;
	node next;
	node(int d){
		data = d;
		next = null;
	}
}
public class LinkedListImplementation {

	public static void main(String[] args) {
		node head = new node(10);
		head.next = new node(20);
		head.next.next = new node(30);
		node temp = head;
		do {
			System.out.print(temp.data+"  ");
			temp = temp.next;
		}while(temp!=null);
		
	}

}
