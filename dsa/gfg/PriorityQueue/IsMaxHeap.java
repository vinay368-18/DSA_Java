package gfg.PriorityQueue;

class node{
	int data;
	node left;
	node right;
	node(int d){
		data = d;
		left = right = null;
	}
}
public class IsMaxHeap {

	public static void main(String[] args) {
		node root = new node(20);
		root.left = new node(10);
		root.right = new node(30);

		root.left.left = new node(5);
		root.left.right = new node(15);

		root.right.left = new node(25);
		root.right.right = new node(35);

		root.left.left.left = new node(2);
		root.left.left.right = new node(8);

		root.left.right.left = new node(12);
		root.left.right.right = new node(18);

		root.right.left.left = new node(22);
		root.right.left.right = new node(28);
		
		boolean r = isHeap(root);
		System.out.println("Is Heap:"+r);
	}
	static boolean isHeap(node root) {
		if(root == null)
			return true;
		if(root.left == null && root.right == null)
			return true;
		if((root.left!=null && root.left.data>root.data) || (root.right.data > root.data))
			return false;
		else
			return isHeap(root.left) && isHeap(root.right);
	}

}
