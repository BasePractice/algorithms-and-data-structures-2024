package ru.mirea.practice.s00000030.task1;

public class BinarySearchNode {
    private int data;
    private BinarySearchNode left;
    private BinarySearchNode right;

    public BinarySearchNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public int getData() {
        return data;
    }

    public BinarySearchNode getLeft() {
        return left;
    }

    public BinarySearchNode getRight() {
        return right;
    }

    public void setLeft(BinarySearchNode left) {
        this.left = left;
    }

    public void setRight(BinarySearchNode right) {
        this.right = right;
    }
}
