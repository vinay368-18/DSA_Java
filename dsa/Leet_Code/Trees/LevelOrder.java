package Leet_Code.Trees;
import java.util.*;
public class LevelOrder {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		List<List<Integer>> list = levelOrder(root);
		System.out.println(list);
	}

	static List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<>();
		if(root == null)
			return list;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			int size = q.size();
			List<Integer> l = new ArrayList<>();
			for(int i=0;i<size;i++) {
				TreeNode node = q.poll(); 
				l.add(node.data);
				if(node.left!=null) {
					q.add(node.left);
				}
				if(node.right!=null) {
					q.add(node.right);
				}
			}
			list.add(l);
		}
		return list;
	}
}
