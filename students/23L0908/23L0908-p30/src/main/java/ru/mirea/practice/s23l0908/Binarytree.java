package ru.mirea.practice.s23l0908;

public class Binarytree {
    Node root;

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.data) {
            root.left = insertRec(root.left, value);
        } else if (value > root.data) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    public boolean lookup(int target) {
        return lookupRec(root, target);
    }

    private boolean lookupRec(Node node, int target) {
        if (node == null) {
            return false;
        }
        if (target == node.data) {
            return true;
        } else if (target < node.data) {
            return lookupRec(node.left, target);
        } else {
            return lookupRec(node.right, target);
        }
    }

    public int height() {
        return heightRec(root);
    }

    private int heightRec(Node node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = heightRec(node.left);
        int rightHeight = heightRec(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public int getMaxWidth() {
        int maxWidth = 0;
        int height = height();
        for (int i = 1; i <= height; i++) {
            int width = getWidth(root, i);
            maxWidth = Math.max(maxWidth, width);
        }
        return maxWidth;
    }

    private int getWidth(Node node, int level) {
        if (node == null) {
            return 0;
        }
        if (level == 1) {
            return 1;
        } else {
            return getWidth(node.left, level - 1) + getWidth(node.right, level - 1);
        }
    }

    public boolean sameTree(Node a, Node b) {
        if (a == null && b == null) {
            return true;
        }
        if (a != null && b != null) {
            return a.data == b.data && sameTree(a.left, b.left) && sameTree(a.right, b.right);
        }
        return false;
    }

    public void reverse() {
        root = reverseRec(root);
    }

    private Node reverseRec(Node node) {
        if (node != null) {
            Node temp = node.left;
            node.left = node.right;
            node.right = temp;
            reverseRec(node.left);
            reverseRec(node.right);
        }
        return node;
    }

    public void printInOrder() {
        printInOrderRec(root);
        System.out.println();
    }

    private void printInOrderRec(Node node) {
        if (node != null) {
            printInOrderRec(node.left);
            System.out.print(node.data + " ");
            printInOrderRec(node.right);
        }
    }
}
