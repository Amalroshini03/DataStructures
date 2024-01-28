package Tree;

class TreeNode2 {
    int data;
    TreeNode2 left;
    TreeNode2 right;

    // Constructor for subclass
    public TreeNode2(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinarySearchTree {
    TreeNode2 root;

    // Constructor for parameter -> binary search tree
    public BinarySearchTree(int rootData) {
        this.root = new TreeNode2(rootData);
    }

    // Method for invoking insertion in BST
    public void insert(int data) {
        root = insertVal(root, data);
    }

    // Recursive method for inserting a value in BST
    private TreeNode2 insertVal(TreeNode2 root, int data) {
        if (root == null) {
            return new TreeNode2(data);
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

    private void inOrderTraversal(TreeNode2 root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(3);
        bst.insert(7);

        // Perform In-Order Traversal
        System.out.print("In-Order Traversal: ");
        bst.inOrderTraversal();
    }
}
