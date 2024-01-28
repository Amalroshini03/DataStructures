package Tree;
import java.util.Scanner;

class TreeNode6 {
    int data;
    TreeNode6 left;
    TreeNode6 right;

    // Constructor
    public TreeNode6(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BSTAll {
    TreeNode6 root;

    // Constructor for the root node
    public BSTAll(int rootData) {
        this.root = new TreeNode6(rootData);
    }

    // Method for inserting a value into the BST
    public void insert(int data) {
        root = insertVal(root, data);
    }

    // Recursive method for inserting a value into the BST
    private TreeNode6 insertVal(TreeNode6 root, int data) {
        if (root == null) {
            return new TreeNode6(data);
        }

        if (data < root.data) {
            root.left = insertVal(root.left, data);
        } else {
            root.right = insertVal(root.right, data);
        }
        return root;
    }

    // Traversal methods
    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

    public void preOrderTraversal() {
        preOrderTraversal(root);
    }

    public void postOrderTraversal() {
        postOrderTraversal(root);
    }

    private void inOrderTraversal(TreeNode6 root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }

    private void preOrderTraversal(TreeNode6 root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    private void postOrderTraversal(TreeNode6 root) {
        if (root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the root value: ");
        int rootValue = sc.nextInt();
        BSTAll bst = new BSTAll(rootValue);

        System.out.println("Enter the number of nodes: ");
        int numNodes = sc.nextInt();

        for (int i = 0; i < numNodes; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            int nodeValue = sc.nextInt();
            bst.insert(nodeValue);
        }

        System.out.println("InOrder Traversal: ");
        bst.inOrderTraversal();

        System.out.println("\nPreOrder Traversal: ");
        bst.preOrderTraversal();

        System.out.println("\nPostOrder Traversal: ");
        bst.postOrderTraversal();

        sc.close();
    }
}
