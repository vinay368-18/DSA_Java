package Leet_Code.DFS;
class TreeNode{
	int data ;
	TreeNode left,right;
	TreeNode(int data){
		this.data = data;
		left = right = null;
	}
}
public class PathSum {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.right = new TreeNode(8);

		root.left.left = new TreeNode(11);

		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(4);

		root.left.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(2);

		root.right.right.right = new TreeNode(1);
		int targetSum = 22;
		System.out.println(hasPathSum(root, targetSum));
	}

	static boolean hasPathSum(TreeNode root, int targetSum) {
		if(root == null)
			return false;
		else if(root.left == null && root.right==null)
			return targetSum == root.data;
		else
			return hasPathSum(root.left,targetSum-root.data) || hasPathSum(root.right,targetSum-root.data);
	}
	

}
