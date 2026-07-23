package gfg.Trees;

public class searchInBST {
	public static void main(String[] args) {
		node root =new node(10);
		root.left = new node(5);
		root.right = new node(15);
		root.left.right = new node(8);
		int key = 8;
		boolean r = search(root,key);
		if(r==false)
			System.out.println(key+" not found");
		else
			System.out.println(key+" found in BST");
	}
	static boolean search(node root,int key) {
		if(root==null)
			return false;
		else if (root.data == key)
			return true;
		else if(root.data > key)
			return search(root.left,key);
		else 
			return search(root.right,key);
	}
}
