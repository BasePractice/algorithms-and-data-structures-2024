package ru.mirea.practice.s23k0368.prog1;

public abstract class CountOfNode {
    public static int countOfNode(Node node) {
        if (node == null) {
            return 0;
        } else {
            return countOfNode(node.left) + countOfNode(node.right) + 1;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Количество узлов в дереве: " + countOfNode(root));
    }
}
