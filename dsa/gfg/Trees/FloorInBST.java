package gfg.Trees;

public class FloorInBST {
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
		
		int key = 21;
		
		int floor = findMaxFork(root, key);
		System.out.println("Floor Elem:"+floor);
	}
	static int findMaxFork(node root,int key) {
		int floor = -1;
		while(root!=null) {
			if(root.data == key)
				return root.data;
			if(root.data<key) {
				floor = root.data;
				root = root.right;
			}
			else
				root = root.left;
		}
		return floor;
	}
}
