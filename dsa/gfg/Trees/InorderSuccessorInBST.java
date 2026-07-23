package gfg.Trees;


public class InorderSuccessorInBST {

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

        // Find successor of 15
        node k = root.left.right;

        int ans = inOrderSuccessor(root, k);

        if (ans == -1)
            System.out.println("No Inorder Successor");
        else
            System.out.println("Inorder Successor of " + k.data + " = " + ans);
    }

    static int inOrderSuccessor(node root, node k) {

        node succ = null;

        while (root != null) {

            if (k.data < root.data) {
                succ = root;
                root = root.left;
            } 
            else if (k.data > root.data) {
                root = root.right;
            }
            else {

                if (root.right != null) {
                    node curr = root.right;

                    while (curr.left != null)
                        curr = curr.left;

                    return curr.data;
                }

                break;
            }
        }

        return (succ == null) ? -1 : succ.data;
    }
}