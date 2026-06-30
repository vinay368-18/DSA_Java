package binaryTree;

public class MainBinaryTree {
    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();

        bt.insert(1);
        bt.insert(2);
        bt.insert(3);
        bt.insert(4);
        bt.insert(5);

        System.out.print("Inorder: ");
        bt.inorder(bt.root);

        System.out.print("\nPreorder: ");
        bt.preorder(bt.root);

        System.out.print("\nPostorder: ");
        bt.postorder(bt.root);

        System.out.print("\nLevel Order: ");
        bt.levelOrder();

        System.out.println("\nSearch 3: " + bt.search(bt.root, 3));

        System.out.println("Height: " + bt.height(bt.root));

        System.out.println("Total Nodes: " + bt.countNodes(bt.root));

        bt.delete(3);

        
        System.out.print("After Deletion (Level Order): ");
        bt.levelOrder();
    }
}