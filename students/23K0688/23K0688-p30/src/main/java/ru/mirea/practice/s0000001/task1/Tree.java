package ru.mirea.practice.s0000001.task1;

public class Tree {
    static class Node {
        private int val;
        private Node left;
        private Node right;

        Node(int val) {
            this.val = val;
            left = right = null;
        }
    }

    private Node root;

    void add(int val) {
        root = addseeker(root, val);
    }

    private Node addseeker(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value < current.val) {
            current.left = addseeker(current.left, value);
        } else if (value > current.val) {
            current.right = addseeker(current.right, value);
        }

        return current;
    }

    boolean isVal(int value) {
        return valseeker(root, value);
    }

    private boolean valseeker(Node current, int val) {
        if (current == null) {
            return false;
        }
        if (val == current.val) {
            return true;
        }
        if (val < current.val) {
            return valseeker(current.left, val);
        } else {
            return valseeker(current.right, val);
        }
    }

    void sort() {
        sorter(root);
    }

    private void sorter(Node node) {
        if (node != null) {
            sorter(node.left);
            System.out.print(" " + node.val);
            sorter(node.right);
        }
    }

}
