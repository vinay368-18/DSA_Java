package Leet_Code.DFS;
import java.util.*;
public class PathSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(5);

		root.left = new TreeNode(4);
		root.right = new TreeNode(8);

		root.left.left = new TreeNode(11);

		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(4);

		root.left.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(2);

		root.right.right.left = new TreeNode(5);
		root.right.right.right = new TreeNode(1);

		int targetSum = 22;
		List<List<Integer>> r = pathSumTwo(root,targetSum);
		System.out.println(r);
	}

	static List<List<Integer>> pathSumTwo(TreeNode root, int targetSum) {
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> l = new ArrayList<>();
		sum(root,list,l,targetSum);
		return list;
	}

	static void sum(TreeNode root, List<List<Integer>> list, List<Integer> l, int targetSum) {
		if(root == null)
			return ;
		l.add(root.data);
		targetSum -= root.data;
		if(root.left == null && root.right == null) {
			if(targetSum == 0)
				list.add(new ArrayList<>(l));
		}
		else {
			sum(root.left,list,l,targetSum);
			sum(root.right,list,l,targetSum);
		}
		l.remove(l.size()-1);
	}
}
