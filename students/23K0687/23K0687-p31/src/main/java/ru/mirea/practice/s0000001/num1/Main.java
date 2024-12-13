package ru.mirea.practice.s0000001.num1;

public final class Main {

    private Main() {
    }

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static void printTreeByLevels(Node root) {
        int depth = getDepth(root);
        for (int i = 0; i < depth; i++) {
            printLevel(root, i, 0);
            System.out.println();
        }
    }

    private static int getDepth(Node node) {
        if (node == null) {
            return 0;
        }
        int leftDepth = getDepth(node.left);
        int rightDepth = getDepth(node.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }

    private static void printLevel(Node node, int level, int currentLevel) {
        if (node == null) {
            return;
        }

        if (currentLevel == level) {
            System.out.print(node.data + " ");
            return;
        }

        printLevel(node.left, level, currentLevel + 1);
        printLevel(node.right, level, currentLevel + 1);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        Node left = new Node(20);
        Node right = new Node(30);
        root.left = left;
        root.right = right;

        Node leftLeft = new Node(40);
        Node leftRight = new Node(50);
        left.left = leftLeft;
        left.right = leftRight;

        Node rightLeft = new Node(60);
        Node rightRight = new Node(70);
        right.left = rightLeft;
        right.right = rightRight;

        System.out.println("Tree by levels:");
        printTreeByLevels(root);
    }
}
