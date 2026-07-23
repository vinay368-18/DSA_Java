package gfg.Trees;

public class MinimumElemInBST {

	public static void main(String[] args) {
		node root =new node(20);
		root.left = new node(10);
		root.right = new node(30);
		root.left.right = new node(15);
		int min = minValue(root);
		System.out.println("Minimum Value:"+min);
	}
	static int minValue(node root) {
		if(root==null)
			return -1;
		while(root.left!=null)
			root = root.left;
		return root.data;
	}
}
