package ru.mirea.practice.s23k0087.task1;

public class BinaryTree {
    Node root;

    int height(Node node) {
        if (node == null) {
            return 0;
        }
        int heightLeft = height(node.left);
        int heightRight = height(node.right);
        return Math.max(heightLeft, heightRight) + 1;
    }

    boolean lookup(Node node, int target) {
        if (node == null) {
            return false;
        }
        if (node.data == target) {
            return true;
        }
        if (target < node.data) {
            return lookup(node.left, target);
        } else {
            return lookup(node.right, target);
        }
    }

    int getMaxWidth(Node root) {
        int h = this.height(this.root);
        int maxWidth = 0;
        for (int i = 1; i <= h; i++) {
            int w = getWidth(this.root, i);
            if (w > maxWidth) {
                maxWidth = w;
            }
        }
        return maxWidth;
    }

    int getWidth(Node node, int level) {
        if (node == null) {
            return 0;
        }
        if (level == 1) {
            return 1;
        }
        return getWidth(node.left, level - 1) + getWidth(node.right, level - 1);
    }

    int size(Node node) {
        if (node == null) {
            return 0;
        }
        return size(node.left) + 1 + size(node.right);
    }

    boolean sameTree(Node a, Node b) {
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
