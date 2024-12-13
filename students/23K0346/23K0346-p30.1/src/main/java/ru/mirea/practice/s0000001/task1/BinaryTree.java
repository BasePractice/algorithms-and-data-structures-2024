package ru.mirea.practice.s0000001.task1;

class BinaryTree {
    TreeNode root;

    public int height(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            int leftHeight = height(node.left);
            int rightHeight = height(node.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    public void reverse(TreeNode node) {
        if (node == null) {
            return;
        }
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        reverse(node.left);
        reverse(node.right);
    }

    public boolean lookup(TreeNode node, int target) {
        if (node == null) {
            return false;
        }
        if (node.data == target) {
            return true;
        }
        return target < node.data ? lookup(node.left, target) : lookup(node.right, target);
    }

    public int size(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return size(node.left) + 1 + size(node.right);
    }

    public boolean sameTree(TreeNode a, TreeNode b) {
        if (a == null && b == null) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }
        return a.data == b.data && sameTree(a.left, b.left) && sameTree(a.right, b.right);
    }
}

