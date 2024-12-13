package ru.mirea.practice.lab30.t1;

public abstract class BinaryTreeReverse {
    public static void reverse(TreeNode node) {
        if (node == null) {
            return;
        }
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        reverse(node.left);
        reverse(node.right);
    }
}
