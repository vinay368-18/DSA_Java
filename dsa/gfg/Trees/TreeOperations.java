package gfg.Trees;
class node{
	int data;
	node left,right;
	node(int d){
		data = d;
		left=right=null;
	}
}
public class TreeOperations {

	public static void main(String[] args) {
		node root =new node(1);
		root.left = new node(2);
		root.right = new node(3);
		root.left.right = new node(4);
		System.out.println("inorder:");
		inorder(root);
		System.out.println();
		System.out.println("preorder:");
		preorder(root);
		System.out.println();
		System.out.println("postorder:");
		postorder(root);
	}
	static void inorder(node root) {
		if(root == null)
			return;
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	static void preorder(node root) {
		if(root==null)
			return;
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	static void postorder(node root) {
		if(root==null)
			return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}
}
