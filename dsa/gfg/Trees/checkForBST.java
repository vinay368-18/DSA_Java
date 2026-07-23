package gfg.Trees;

public class checkForBST {

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
		
		boolean r = isBST(root);
		System.out.println("IS BST:"+r);
	}
	static boolean isBST(node root) {
		return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    static boolean check(node root, long min, long max) {

        if (root == null)
            return true;

        if (root.data <= min || root.data >= max)
            return false;

        return check(root.left, min, root.data)
                && check(root.right, root.data, max);
    }
}
