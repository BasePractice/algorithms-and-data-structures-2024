package ru.mirea.practice.lab30.t1;

public abstract class BinaryTreeWidth {
    public static int getMaxWidth(TreeNode root) {
        int maxWidth = 0;
        int height = BinaryTreeHeight.height(root);
        for (int i = 1; i <= height; i++) {
            int width = getWidth(root, i);
            maxWidth = Math.max(maxWidth, width);
        }
        return maxWidth;
    }

    private static int getWidth(TreeNode root, int level) {
        if (root == null) {
            return 0;
        }
        if (level == 1) {
            return 1;
        }
        return getWidth(root.left, level - 1) + getWidth(root.right, level - 1);
    }
}

