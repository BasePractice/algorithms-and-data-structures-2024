package ru.mirea.practice.s23k0145.lab1;

class BinarySearchTree {
    TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    public void addNode(int value) {
        root = addNodeRecursive(root, value);
    }

    private TreeNode addNodeRecursive(TreeNode current, int value) {
        if (current == null) {
            return new TreeNode(value);
        }

        if (value < current.value) {
            current.left = addNodeRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addNodeRecursive(current.right, value);
        }

        return current;
    }

    public void removeNode(int value) {
        root = removeNodeRecursive(root, value);
    }

    private TreeNode removeNodeRecursive(TreeNode current, int value) {
        if (current == null) {
            return null;
        }

        if (value < current.value) {
            current.left = removeNodeRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = removeNodeRecursive(current.right, value);
        } else {
            if (current.left == null && current.right == null) {
                return null;
            } else if (current.left == null) {
                return current.right;
            } else if (current.right == null) {
                return current.left;
            }

            int smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = removeNodeRecursive(current.right, smallestValue);
        }

        return current;
    }

    private int findSmallestValue(TreeNode current) {
        return current.left == null ? current.value : findSmallestValue(current.left);
    }

    public void traverseInOrder() {
        traverseInOrderRecursive(root);
    }

    private void traverseInOrderRecursive(TreeNode current) {
        if (current != null) {
            traverseInOrderRecursive(current.left);
            System.out.print(current.value + " ");
            traverseInOrderRecursive(current.right);
        }
    }

    public void clearTree() {
        root = null;
    }
}
