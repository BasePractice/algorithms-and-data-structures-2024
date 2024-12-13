package ru.mirea.practice.s23k0690;

public class Task1 {

    static class TreeNode {
        int key;

        TreeNode leftChild;

        TreeNode rightChild;

        public TreeNode(int key) {
            this.key = key;
            leftChild = rightChild = null;
        }
    }

    private TreeNode root;

    public Task1() {
        root = null;
    }

    public void add(int key) {
        root = addRecursively(root, key);
    }

    private TreeNode addRecursively(TreeNode current, int key) {
        if (current == null) {
            return new TreeNode(key);
        }

        if (key < current.key) {
            current.leftChild = addRecursively(current.leftChild, key);
        } else if (key > current.key) {
            current.rightChild = addRecursively(current.rightChild, key);
        }
        return current;
    }

    public void traverseInOrder() {
        traverseInOrderRecursively(root);
    }

    private void traverseInOrderRecursively(TreeNode current) {
        if (current != null) {
            traverseInOrderRecursively(current.leftChild);
            System.out.print(current.key + " ");
            traverseInOrderRecursively(current.rightChild);
        }
    }

    public void remove(int key) {
        root = removeRecursively(root, key);
    }

    private TreeNode removeRecursively(TreeNode current, int key) {
        if (current == null) {
            return current;
        }
        if (key < current.key) {
            current.leftChild = removeRecursively(current.leftChild, key);
        } else if (key > current.key) {
            current.rightChild = removeRecursively(current.rightChild, key);
        } else {
            if (current.leftChild == null) {
                return current.rightChild;
            } else if (current.rightChild == null) {
                return current.leftChild;
            }
            current.key = findMinValue(current.rightChild);
            current.rightChild = removeRecursively(current.rightChild, current.key);
        }
        return current;
    }

    private int findMinValue(TreeNode current) {
        int minValue = current.key;
        while (current.leftChild != null) {
            minValue = current.leftChild.key;
            current = current.leftChild;
        }
        return minValue;
    }

    public void clear() {
        root = null;
    }

    public static void main(String[] args) {
        Task1 tree = new Task1();
        int[] values = {10, 30, 20, 40, 60, 50, 80, 70, 90, 100};
        for (int value : values) {
            tree.add(value);
        }
        tree.traverseInOrder();
        System.out.println();
        tree.remove(100);
        tree.traverseInOrder();
        System.out.println();
        tree.clear();
    }
}
