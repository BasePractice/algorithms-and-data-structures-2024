package ru.mirea.practice.s23k0690;

public final class Task1 {

    private Task1() {}

    public static void printTree(Node node, int level) {
        if (node == null) {
            return;
        }

        printTree(node.left, level + 1);
        printTree(node.middle, level + 1);
        printTree(node.right, level + 1);

        System.out.println("Знач: " + node.value + ", Ур: " + level);
    }

    public static void main(String[] args) {
        final Node root = new Node(1);
        final Node node2 = new Node(3);
        final Node node3 = new Node(2);
        final Node node4 = new Node(4);
        final Node node5 = new Node(6);
        final Node node6 = new Node(5);
        root.left = node2;
        root.middle = node3;
        root.right = node4;
        node2.left = node5;
        node2.right = node6;
        printTree(root, 0);
    }
}
