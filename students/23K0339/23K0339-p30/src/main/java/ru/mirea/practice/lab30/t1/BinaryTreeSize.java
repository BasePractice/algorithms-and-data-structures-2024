package ru.mirea.practice.lab30.t1;

public abstract class BinaryTreeSize {
    public static int size(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return size(node.left) + 1 + size(node.right);
    }
}

