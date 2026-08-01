package GfgPractice.Trees;
import java.util.*;
class Node{
	int data;
	Node left,right;
	Node(int data){
		this.data = data;
		this.left = this.right = null;
	}
}
public class ChildrenSum {
	static Node root;
	public static void main(String[] args) {
		insert(30);
		insert(10);
		insert(20);
		insert(5);
		insert(5);
		boolean r = isSumProperty(root);
		System.out.println(r);
	}
	static boolean isSumProperty(Node root) {

	    if(root == null)
	        return true;

	    Queue<Node> q = new LinkedList<>();
	    q.add(root);

	    while(!q.isEmpty()) {

	        Node temp = q.poll();

	        int sum = 0;

	        if(temp.left != null){
	            sum += temp.left.data;
	            q.add(temp.left);
	        }

	        if(temp.right != null){
	            sum += temp.right.data;
	            q.add(temp.right);
	        }

	        if((temp.left != null || temp.right != null) && temp.data != sum)
	            return false;
	    }

	    return true;
	}
	static void insert(int data) {

	    Node newNode = new Node(data);

	    if(root == null) {
	        root = newNode;
	        return;
	    }

	    Queue<Node> q = new LinkedList<>();
	    q.add(root);

	    while(!q.isEmpty()) {

	        Node temp = q.poll();

	        if(temp.left == null) {
	            temp.left = newNode;
	            return;
	        }
	        else
	            q.add(temp.left);

	        if(temp.right == null) {
	            temp.right = newNode;
	            return;
	        }
	        else
	            q.add(temp.right);
	    }
	}

}
