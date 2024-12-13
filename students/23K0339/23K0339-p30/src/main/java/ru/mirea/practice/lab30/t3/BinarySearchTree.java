package ru.mirea.practice.lab30.t3;

class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    public void printTree() {
        printRec(root);
        System.out.println();
    }

    private void printRec(Node root) {
        if (root != null) {
            printRec(root.left);
            System.out.print(root.data + " ");
            printRec(root.right);
        }
    }

    public void delete(int data) {
        root = deleteRec(root, data);
    }

    private Node deleteRec(Node root, int data) {
        if (root == null) {
            return root;
        }

        if (data < root.data) {
            root.left = deleteRec(root.left, data);
        } else if (data > root.data) {
            root.right = deleteRec(root.right, data);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.data = minValue(root.right);
            root.right = deleteRec(root.right, root.data);
        }
        return root;
    }

    private int minValue(Node root) {
        int minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }

    public void deleteTree() {
        root = deleteTreeRec(root);
    }

    private Node deleteTreeRec(Node root) {
        if (root == null) {
            return null;
        }
        root.left = deleteTreeRec(root.left);
        root.right = deleteTreeRec(root.right);
        root = null;
        return root;
    }
}

