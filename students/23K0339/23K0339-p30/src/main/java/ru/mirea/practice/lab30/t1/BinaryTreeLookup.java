package ru.mirea.practice.lab30.t1;

public abstract class BinaryTreeLookup {
    public static boolean lookup(TreeNode node, int target) {
        if (node == null) {
            return false;
        }
        if (node.data == target) {
            return true;
        }
        return target < node.data
            ? lookup(node.left, target)
            : lookup(node.right, target);
    }
}

