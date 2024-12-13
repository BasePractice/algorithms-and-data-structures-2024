package ru.mirea.practice.s0000001;

public class BstTree {
    private TreeNode root;
    int count;

    public BstTree() {
        this.root = null;
        this.count = 0;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public int search(BstTree tree, int item) {
        TreeNode searchnode = tree.root;
        while (true) {
            if (searchnode == null) {
                return 0;
            } else if (item == searchnode.getData()) {
                return 1;
            } else if (item > searchnode.getData()) {
                searchnode = searchnode.right;
            } else {
                searchnode = searchnode.left;
            }
        }
    }

    public TreeNode insert(TreeNode root, int item) {
        if (root == null) {
            root = new TreeNode(item);
            return root;
        }
        if (item < root.getData()) {
            root.left = insert(root.left, item);
        } else if (item > root.getData()) {
            root.right = insert(root.right, item);
        }
        return root;
    }

    public static void destroy(TreeNode root) {
        if (root == null) {
            return;
        }
        destroy(root.left);
        destroy(root.right);
        root = null;
    }

    public void delete(BstTree tree, int item) {
        TreeNode searchnode = tree.root;
        while (true) {
            if (searchnode == null) {
                return;
            } else if (item == searchnode.getData()) {
                BstTree.destroy(searchnode);
                return;
            } else if (item > searchnode.getData()) {
                searchnode = searchnode.right;
            } else if (item < searchnode.getData()) {
                searchnode = searchnode.left;
            }
        }
    }
}
