package ru.mirea.practice.s23k0368.prog5;

public abstract class Tree {
    public static void printTree(Node node, int level) {
        if (node == null) {
            return;
        }

        printTree(node.left, level + 1);
        printTree(node.middle, level + 1);
        printTree(node.right, level + 1);
        System.out.print(node.data + "-Уровень:" + level);

        if (node.left != null && node.right != null) {
            System.out.print("—");
        }
        System.out.print("       ");
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(2);
        root.middle = new Node(3);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(2);
        root.middle.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);

        int level = 1;
        printTree(root, level);
    }
}
