package ru.mirea.practice.s23k0143;

public class BinaryTree {
    Node root;

    int lookup(Node node, int target) {
        if (node == null) {
            return 0;
        }
        if (target == node.data) {
            return 1;
        }
        return target < node.data ? lookup(node.left, target) : lookup(node.right, target);
    }

    int size(Node node) {
        if (node == null) {
            return 0;
        }
        return size(node.left) + 1 + size(node.right);
    }

    void reverse(Node p) {
        if (p != null) {
            Node temp = p.left;
            p.left = p.right;
            p.right = temp;

            reverse(p.left);
            reverse(p.right);
        }
    }

    int getMaxWidth(Node root) {
        int maxWdth = 0;
        int h = height(root);
        for (int i = 1; i <= h; i++) {
            int width = getWidth(root, i);
            if (width > maxWdth) {
                maxWdth = width;
            }
        }
        return maxWdth;
    }

    int height(Node node) {
        if (node == null) {
            return 0;
        }
        return Math.max(height(node.left), height(node.right)) + 1;
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

    boolean sameTree(Node a, Node b) {
        if (a == null && b == null) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }
        return a.data == b.data && sameTree(a.left, b.left) && sameTree(a.right, b.right);
    }
}
