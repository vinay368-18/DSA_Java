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
public class LeftViewOfBinaryTree {
	static Node root;
	public static void main(String[] args) {
		insert(10);
		insert(20);
		insert(30);
		ArrayList <Integer> list = leftView(root);
		System.out.println(list);
	}
	private static ArrayList<Integer> leftView(Node root2) {
		ArrayList<Integer> list = new ArrayList<>();
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(q.isEmpty()==false) {
			int size = q.size();
			for(int i=0;i<size;i++) {
				Node temp = q.poll();
				if(i==0)
					list.add(temp.data);
				if(temp.left!=null)
					q.add(temp.left);
				if(temp.right!=null)
					q.add(temp.right);
			}
		}
		return list;
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
			else {
				q.add(temp.left);
			}
			if(temp.right == null) {
				temp.right = newNode;
				return;
			}
			else {
				q.add(temp.right);
			}
		}
	}
	
}
