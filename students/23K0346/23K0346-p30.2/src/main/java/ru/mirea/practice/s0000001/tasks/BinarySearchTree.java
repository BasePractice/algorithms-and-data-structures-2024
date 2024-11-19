package ru.mirea.practice.s0000001.tasks;

class BinarySearchTree {
    Node root;

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

    public void printInOrder() {
        printInOrderRec(root);
    }

    private void printInOrderRec(Node root) {
        if (root != null) {
            printInOrderRec(root.left);
            System.out.print(root.data + " ");
            printInOrderRec(root.right);
        }
    }

    public void destroy() {
        root = destroyRec(root);
    }

    private Node destroyRec(Node root) {
        if (root == null) {
            return null;
        }
        root.left = destroyRec(root.left);
        root.right = destroyRec(root.right);
        root = null;
        return root;
    }

    public Node findMin() {
        return findMinRec(root);
    }

    private Node findMinRec(Node root) {
        if (root == null || root.left == null) {
            return root;
        }
        return findMinRec(root.left);
    }

    public Node findMax() {
        return findMaxRec(root);
    }

    private Node findMaxRec(Node root) {
        if (root == null || root.right == null) {
            return root;
        }
        return findMaxRec(root.right);
    }
}

