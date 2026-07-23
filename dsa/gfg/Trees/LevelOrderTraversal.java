package gfg.Trees;
import java.util.*;
public class LevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node root =new node(1);
		root.left = new node(2);
		root.right = new node(3);
		root.left.right = new node(4);
		root.left.right.left = new node(5);
		ArrayList<Integer> list = new ArrayList<>();
		list = levelOrder(root);
		System.out.println("level Order:"+list);
	}

	static ArrayList<Integer> levelOrder(node root) {
		ArrayList<Integer> list = new ArrayList<>();
		Queue<node> q = new LinkedList<>();
		determineLevelOrder(root,list,q);
		return list;
	}

	static void determineLevelOrder(node root, ArrayList<Integer> list, Queue<node> q) {

	    if (root == null)
	        return;

	    q.add(root);

	    while (!q.isEmpty()) {

	        node curr = q.poll();
	        list.add(curr.data);

	        if (curr.left != null)
	            q.add(curr.left);

	        if (curr.right != null)
	            q.add(curr.right);
	    }
	}
}
