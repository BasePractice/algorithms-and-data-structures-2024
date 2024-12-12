package ru.mirea.practice.s00000030.task1;

public class BinarySearchTree {
    private BinarySearchNode root;

    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    private BinarySearchNode insertRecursive(BinarySearchNode node, int data) {
        if (node == null) {
            return new BinarySearchNode(data);
        }
        if (data < node.getData()) {
            node.setLeft(insertRecursive(node.getLeft(), data));
        } else if (data > node.getData()) {
            node.setRight(insertRecursive(node.getRight(), data));
        }
        return node;
    }

    public void delete(int data) {
        root = deleteRecursive(root, data);
    }

    private BinarySearchNode deleteRecursive(BinarySearchNode node, int data) {
        if (node == null) {
            return null;
        }
        if (data < node.getData()) {
            node.setLeft(deleteRecursive(node.getLeft(), data));
        } else if (data > node.getData()) {
            node.setRight(deleteRecursive(node.getRight(), data));
        } else {
            if (node.getLeft() == null) {
                return node.getRight();
            } else if (node.getRight() == null) {
                return node.getLeft();
            }
            int minValue = findMin(node.getRight());
            node = new BinarySearchNode(minValue);
            node.setRight(deleteRecursive(node.getRight(), minValue));
        }
        return node;
    }

    private int findMin(BinarySearchNode node) {
        while (node.getLeft() != null) {
            node = node.getLeft();
        }
        return node.getData();
    }

    public void printInOrder() {
        printInOrderRecursive(root);
        System.out.println();
    }

    private void printInOrderRecursive(BinarySearchNode node) {
        if (node == null) {
            return;
        }
        printInOrderRecursive(node.getLeft());
        System.out.print(node.getData() + " ");
        printInOrderRecursive(node.getRight());
    }

    public void clear() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }
}
