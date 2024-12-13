package ru.mirea.practice.s23k0368.prog1;

public abstract class Comparison {
    public static boolean compare(Node node1, Node node2) {
        if (node1 == null && node2 == null) {
            return true;
        } else if (node1 != null && node2 != null) {
            return node1.data == node2.data && compare(node1.left, node2.left) && compare(node1.right, node2.right);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);

        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);

        if (compare(root1, root2)) {
            System.out.println("Деревья равны");
        } else {
            System.out.println("Деревья разные");
        }
    }
}
