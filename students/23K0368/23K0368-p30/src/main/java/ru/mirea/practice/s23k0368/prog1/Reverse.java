package ru.mirea.practice.s23k0368.prog1;

public abstract class Reverse {
    public static void reverse(Node node) {
        if (node == null) {
            return;
        } else {
            Node temp = node.left;
            node.left = node.right;
            node.right = temp;

            reverse(node.left);
            reverse(node.right);
        }
    }

    public static void printTree(Node node, String prefix, boolean isLeft) {
        if (node != null) {
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + node.getData());
            printTree(node.getLeft(), prefix + (isLeft ? "│   " : "    "), true);
            printTree(node.getRight(), prefix + (isLeft ? "│   " : "    "), false);
        }
    }

    public static void printTree(Node node) {
        printTree(node, "", false);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Оригинальное дерево:");
        printTree(root);
        reverse(root);
        System.out.println("Зеркальное дерево:");
        printTree(root);
    }
}
