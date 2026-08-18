package Leet_Code.Trees;
class TreeNode{
	int data;
	TreeNode left,right;
	TreeNode(int data){
		this.data = data;
		left = null;
		right = null;
	}
}
public class MaximumDepth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		System.out.println("Max depth:"+maxDepth(root));
	}
	static int maxDepth(TreeNode root) {
		if(root == null)
			return 0;
		int left = maxDepth(root.left);
		int right = maxDepth(root.right);
		
		return 1 + Math.max(left,right);
	}
}
