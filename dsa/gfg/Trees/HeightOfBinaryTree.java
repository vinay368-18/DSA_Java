package gfg.Trees;

public class HeightOfBinaryTree {

	public static void main(String[] args) {
		node root =new node(1);
		root.left = new node(2);
		root.right = new node(3);
		root.left.right = new node(4);
		int height = height(root);
		System.out.println("Height:"+height);
	}
	static int height(node root) {
		if(root==null)
			return -1;
		int ht_left = height(root.left);
		int ht_right = height(root.right);
		return Math.max(ht_left, ht_right)+1;
	}

}
