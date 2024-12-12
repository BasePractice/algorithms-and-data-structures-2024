package ru.mirea.practice.s23k0145.lab1;

class TernaryTree {
    private TreeNode root;

    public TernaryTree() {
        this.root = null;
    }

    public void insert(int key) {
        root = insertNode(root, key);
    }

    private TreeNode insertNode(TreeNode node, int key) {
        if (node == null) {
            return new TreeNode(key);
        }

        if (key < node.key) {
            node.left = insertNode(node.left, key);
        } else if (key == node.key) {
            node.middle = insertNode(node.middle, key);
        } else {
            node.right = insertNode(node.right, key);
        }

        return node;
    }

    public void delete(int key) {
        root = deleteNode(root, key);
    }

    private TreeNode deleteNode(TreeNode node, int key) {
        if (node == null) {
            System.out.println("Key " + key + " not found in the tree.");
            return null;
        }

        if (key < node.key) {
            node.left = deleteNode(node.left, key);
        } else if (key > node.key) {
            node.right = deleteNode(node.right, key);
        } else {
            if (node.middle != null) {
                node.middle = deleteNode(node.middle, key);
            } else if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            } else {
                TreeNode minNode = findMin(node.right);
                node.key = minNode.key;
                node.right = deleteNode(node.right, minNode.key);
            }
        }

        return node;
    }

    private TreeNode findMin(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public void printVariant5() {
        printRecursiveVariant5(root, 1);
        System.out.println();
    }

    private void printRecursiveVariant5(TreeNode node, int level) {
        if (node != null) {
            printRecursiveVariant5(node.left, level + 1);
            printRecursiveVariant5(node.middle, level + 1);
            printRecursiveVariant5(node.right, level + 1);
            System.out.println("Node: " + node.key + " at level: " + level);
        }
    }
}
