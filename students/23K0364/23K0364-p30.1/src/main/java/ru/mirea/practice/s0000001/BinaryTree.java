package ru.mirea.practice.s0000001;

public class BinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Node root;

    public void add(int data) {
        root = addRecursive(root, data);
    }

    private Node addRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }
        if (data < current.data) {
            current.left = addRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        }
        return current;
    }

    public boolean lookup(int target) {
        return lookupRecursive(root, target);
    }

    private boolean lookupRecursive(Node current, int target) {
        if (current == null) {
            return false;
        }
        if (current.data == target) {
            return true;
        }
        return target < current.data
            ? lookupRecursive(current.left, target)
            : lookupRecursive(current.right, target);
    }

    public int height() {
        return heightRecursive(root);
    }

    private int heightRecursive(Node current) {
        if (current == null) {
            return 0;
        }
        int leftHeight = heightRecursive(current.left);
        int rightHeight = heightRecursive(current.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public void mirror() {
        root = mirrorRecursive(root);
    }

    private Node mirrorRecursive(Node current) {
        if (current == null) {
            return null;
        }
        Node left = mirrorRecursive(current.left);
        Node right = mirrorRecursive(current.right);
        current.left = right;
        current.right = left;
        return current;
    }

    public void printInOrder() {
        printInOrderRecursive(root);
    }

    private void printInOrderRecursive(Node current) {
        if (current != null) {
            printInOrderRecursive(current.left);
            System.out.print(current.data + " ");
            printInOrderRecursive(current.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(50);
        tree.add(30);
        tree.add(70);
        tree.add(20);
        tree.add(40);
        tree.add(60);
        tree.add(80);

        System.out.println("Tree elements (in-order):");
        tree.printInOrder();

        System.out.println("\nHeight of tree: " + tree.height());

        System.out.println("Looking for 40: " + tree.lookup(40));
        System.out.println("Looking for 90: " + tree.lookup(90));

        System.out.println("Mirroring tree...");
        tree.mirror();
        System.out.println("Tree elements after mirroring (in-order):");
        tree.printInOrder();
    }
}
