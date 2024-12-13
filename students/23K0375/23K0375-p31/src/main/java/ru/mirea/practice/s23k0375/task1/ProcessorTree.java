package ru.mirea.practice.s23k0375.task1;

public class ProcessorTree {
    private Node root;

    public void add(int key) {
        root = addRecursive(root, key);
    }

    private Node addRecursive(Node node, int key) {
        if (node == null) {
            return new Node(key);
        }
        if (key < node.key) {
            node.left = addRecursive(node.left, key);
        } else if (key > node.key) {
            node.right = addRecursive(node.right, key);
        } else {
            System.out.println("Key " + key + " already exists.");
        }
        return node;
    }

    public void delete(int key) {
        root = deleteRecursive(root, key);
    }

    private Node deleteRecursive(Node node, int key) {
        if (node == null) {
            System.out.println("Key " + key + " not found.");
            return null;
        }
        if (key < node.key) {
            node.left = deleteRecursive(node.left, key);
        } else if (key > node.key) {
            node.right = deleteRecursive(node.right, key);
        } else {
            if (node.left == null && node.right == null) {
                return null;
            } else if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            } else {
                Node smallestValue = findSmallestValue(node.right);
                node.key = smallestValue.key;
                node.right = deleteRecursive(node.right, smallestValue.key);
            }
        }
        return node;
    }

    private Node findSmallestValue(Node node) {
        return node.left == null ? node : findSmallestValue(node.left);
    }

    public void printVariant1() {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }
        int height = getHeight(root);
        for (int level = height; level >= 1; level--) {
            printLevel(root, level);
        }
        System.out.println();
    }

    public void printVariant2() {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }
        int height = getHeight(root);
        for (int level = 1; level <= height; level++) {
            printLevel(root, level);
        }
        System.out.println();
    }

    public void printVariant3() {
        printVariant3Recursive(root);
        System.out.println();
    }

    private void printVariant3Recursive(Node node) {
        if (node != null) {
            printVariant3Recursive(node.left);
            System.out.print(node.key + " ");
            printVariant3Recursive(node.right);
        }
    }

    public void printVariant6() {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }
        int height = getHeight(root);
        for (int level = 1; level <= height; level++) {
            System.out.print("Level " + level + ": ");
            printLevel(root, level);
            System.out.println();
        }
    }

    private int getHeight(Node node) {
        if (node == null) {
            return 0;
        }
        return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
    }

    private void printLevel(Node node, int level) {
        if (node == null) {
            return;
        }
        if (level == 1) {
            System.out.print(node.key + " ");
        } else if (level > 1) {
            printLevel(node.left, level - 1);
            printLevel(node.right, level - 1);
        }
    }
}

