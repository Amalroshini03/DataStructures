package Tree;
import java.util.Scanner;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    // Constructor
    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

// Main class
public class BinaryTree {
    TreeNode root;

    // Constructor using main class passing the parameter
    public BinaryTree(int rootData) {
        // this obj is for tree node and for data
        this.root = new TreeNode(rootData);
    }

    // Method for invoking insert
    public void insert(int data) {
        root = insertVal(root, data);
    }

    // Loop doesn't need for working overall
    private TreeNode insertVal(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }

        // Nested if
        if (data < root.data) {
            root.left = insertVal(root.left, data);
        } else {
            if (data > root.data) {
                root.right = insertVal(root.right, data);
            }
        }
        return root;
    }

    // Order
    // Preorder - RO L R
    // Inorder - L RO R
    // Post order - L R RO

    // Root decides before allocation -> Pre-order
    public void inorder() {
        // To get the base for L & R i.e., root
        inorderVal(root); // It gets allocated
    }

    public void preOrderTraversal() {
        preOrderTraversal(root);
    }

    public void postOrderTraversal() {
        postOrderTraversal(root);
    }

    // Orderwise allocate
    private void inorderVal(TreeNode root) {
        if (root != null) {
            inorderVal(root.left);
            System.out.print(root.data + " ");
            inorderVal(root.right);
        }
    }

    private void preOrderTraversal(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    private void postOrderTraversal(TreeNode root) {
        if (root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a root value: ");
        int rootValue = sc.nextInt();
        BinaryTree tree = new BinaryTree(rootValue);

        System.out.println("Enter the number of node value: ");
        int numNode = sc.nextInt();

        // To run globally so that all the nodes are created and data implemented
        for (int i = 0; i < numNode; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            int nodeValue = sc.nextInt();
            tree.insert(nodeValue);
        }

        System.out.println("InOrder Traversal: ");
        tree.inorder();

        System.out.println("\nPreOrder Traversal: ");
        tree.preOrderTraversal();

        System.out.println("\nPostOrder Traversal: ");
        tree.postOrderTraversal();

        sc.close();
    }
}
