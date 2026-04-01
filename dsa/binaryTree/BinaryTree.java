package binaryTree;

import java.util.*;

public class BinaryTree {

    public Node root;

    
    public void insert(int data) {
        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.poll();

            if (temp.left == null) {
                temp.left = newNode;
                return;
            } else {
                q.add(temp.left);
            }

            if (temp.right == null) {
                temp.right = newNode;
                return;
            } else {
                q.add(temp.right);
            }
        }
    }


    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }


    public void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }


    public void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

   
    public void levelOrder() {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.poll();
            System.out.print(temp.data + " ");

            if (temp.left != null) q.add(temp.left);
            if (temp.right != null) q.add(temp.right);
        }
    }


    public boolean search(Node root, int key) {
        if (root == null) return false;

        if (root.data == key) return true;

        return search(root.left, key) || search(root.right, key);
    }

    public int height(Node root) {
        if (root == null) return -1;

        return 1 + Math.max(height(root.left), height(root.right));
    }

 
    public int countNodes(Node root) {
        if (root == null) return 0;

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    // Delete (important)
    public void delete(int key) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            if (root.data == key) root = null;
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        Node keyNode = null;
        Node temp = null;

        while (!q.isEmpty()) {
            temp = q.poll();

            if (temp.data == key) {
                keyNode = temp;
            }

            if (temp.left != null) q.add(temp.left);
            if (temp.right != null) q.add(temp.right);
        }

        if (keyNode != null) {
            int x = temp.data; // deepest node
            deleteDeepest(temp);
            keyNode.data = x;
        }
    }

    private void deleteDeepest(Node delNode) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.poll();

            if (temp.left != null) {
                if (temp.left == delNode) {
                    temp.left = null;
                    return;
                } else {
                    q.add(temp.left);
                }
            }

            if (temp.right != null) {
                if (temp.right == delNode) {
                    temp.right = null;
                    return;
                } else {
                    q.add(temp.right);
                }
            }
        }
    }
}
