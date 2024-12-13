package ru.mirea.practice.lab30.t1;

public abstract class BinaryTreeComparison {
    public static boolean sameTree(TreeNode a, TreeNode b) {
        if (a == null && b == null) {
            return true;
        }
        if (a != null && b != null) {
            return a.data == b.data
                && sameTree(a.left, b.left)
                && sameTree(a.right, b.right);
        }
        return false;
    }
}
