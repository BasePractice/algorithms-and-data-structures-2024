package ru.mirea.practice.s0000001;

public class TreeNode {
    private int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setLeft(TreeNode node) {
        this.left = node;
    }

    public void setRight(TreeNode node) {
        this.right = node;
    }

    public TreeNode getRight() {
        return this.right;
    }

    public TreeNode getLeft() {
        return this.left;
    }

    public int getData() {
        return this.data;
    }

    public int height(TreeNode node) {
        if (node == null) {
            return -1;
        }
        int right = height(node.right);
        int left = height(node.left);
        return Math.max(right, left);
    }

    public void reverse(TreeNode node) {
        if (node == null) {
            return;
        }
        reverse(node.left);
        reverse(node.right);
        TreeNode tn;
        tn = node.left;
        node.left = node.right;
        node.right = tn;
    }

    public int lookup(TreeNode node, int data) {
        if (node == null) {
            return 0;
        } else {
            if (data == node.getData()) {
                return 1;
            } else {
                if (data < node.getData()) {
                    return lookup(node.left, data);
                } else {
                    return lookup(node.right, data);
                }
            }
        }
    }

    public int width(TreeNode root, int level) {
        if (root == null) {
            return 0;
        }
        if (level == 1) {
            return 1;
        } else if (level > 1) {
            return width(root.left, level - 1) + width(root.right, level - 1);
        }
        width(root.right, level - 1);
        return 0;
    }

    public int size(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            return size(node.left) + 1 + size(node.right);
        }
    }

    public boolean sameTree(TreeNode a, TreeNode b) {
        if (a == null && b == null) {
            return true;
        } else if (a != null && b != null) {
            return a.getData() == b.getData() && sameTree(a.left, b.left) && sameTree(a.right, b.right);
        }
        return false;
    }
}
