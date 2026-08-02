package GfgPractice.Trees;
import java.util.*;
public class Zig_Zag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node newNode = new Node(1);
		newNode.left = new Node(2);
		newNode.right = new Node(3);
		newNode.left.left = new Node(4);
		newNode.left.right = new Node(5);
		newNode.right.left = new Node(6);
		newNode.right.right = new Node(7);
		
		ArrayList<Integer> list = zigZagTraversal(newNode);
		System.out.println(list);
	}

	static ArrayList<Integer> zigZagTraversal(Node root) {
		ArrayList<Integer> list = new ArrayList<>();
		if(root == null)
			return list;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		boolean leftToRight = true;
		while(!q.isEmpty()) {
			int size = q.size();
			ArrayList<Integer> l = new ArrayList<>();
			for(int i=0;i<size;i++) {
				Node temp = q.poll();
				l.add(temp.data);
				if(temp.left!=null)
					q.add(temp.left);
				
				if(temp.right!=null)
					q.add(temp.right);
			}
			
			if(leftToRight==false)
				Collections.reverse(l);
			list.addAll(l);
			leftToRight = !leftToRight;
		}
		return list;	
	}
}
