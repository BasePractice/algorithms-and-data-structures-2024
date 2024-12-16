package ru.mirea.practice.s0000001.task1;

public abstract class Lookup {
    public static int lookup(Node node, int key) {
        if (node == null) {
            return 0;
        } else {
            if (key == node.data) {
                return 1;
            } else {
                if (key < node.data) {
                    return lookup(node.left, key);
                } else {
                    return lookup(node.right, key);
                }
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        if (lookup(root, 3) == 1) {
            System.out.println("Значение найдено");
        } else {
            System.out.println("Значение отсутствует");
        }

    }
}
