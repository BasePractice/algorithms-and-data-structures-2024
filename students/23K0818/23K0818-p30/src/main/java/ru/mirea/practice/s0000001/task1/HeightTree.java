package ru.mirea.practice.s0000001.task1;

import static java.lang.Math.max;

public abstract class HeightTree {
    public static int heightTree(Node node) {
        if (node == null) {
            return -1;
        } else {
            int leftHeight = heightTree(node.left);
            int rightHeight = heightTree(node.right);
            return max(leftHeight, rightHeight) + 1;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Высота бинарного дерева " + heightTree(root));
    }
}
