package ru.mirea.practice.lab30.t1;

public abstract class BinaryTreeHeight {
    public static int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
