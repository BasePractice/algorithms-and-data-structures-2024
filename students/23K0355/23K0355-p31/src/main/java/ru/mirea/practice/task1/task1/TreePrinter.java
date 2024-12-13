package ru.mirea.practice.task1.task1;

public final class TreePrinter {

    private TreePrinter() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated.");
    }

    public static void printTree(Node node, int level) {
        if (node == null) {
            return;
        }

        printTree(node.left, level + 1);
        printTree(node.middle, level + 1);
        printTree(node.right, level + 1);

        System.out.println("Значение: " + node.value + ", Уровень: " + level);
    }

    public static void main(String[] args) {
        final Node root = new Node(5);
        final Node node2 = new Node(2);
        final Node node3 = new Node(6);
        final Node node4 = new Node(1);
        final Node node5 = new Node(3);
        final Node node6 = new Node(4);

        root.left = node2;
        root.middle = node3;
        root.right = node4;

        node2.left = node5;
        node2.right = node6;

        printTree(root, 0);
    }
}
