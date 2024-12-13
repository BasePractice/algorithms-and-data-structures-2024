package ru.mirea.practice.s0000001.task1;

class SearchTree {
    private TreeNode root;

    public SearchTree() {
        root = null;
    }

    public void insert(int key) {
        root = insertNode(root, key);
    }

    private TreeNode insertNode(TreeNode current, int key) {
        if (current == null) {
            current = new TreeNode(key);
            return current;
        }
        if (key < current.value) {
            current.leftChild = insertNode(current.leftChild, key);
        } else if (key > current.value) {
            current.rightChild = insertNode(current.rightChild, key);
        }
        return current;
    }

    public void printTree() {
        inOrderTraversal(root);
        System.out.println();
    }

    private void inOrderTraversal(TreeNode current) {
        if (current != null) {
            inOrderTraversal(current.leftChild);
            System.out.print(current.value + " ");
            inOrderTraversal(current.rightChild);
        }
    }

    public void delete(int key) {
        root = deleteNode(root, key);
    }

    private TreeNode deleteNode(TreeNode current, int key) {
        if (current == null) {
            return current;
        }

        if (key < current.value) {
            current.leftChild = deleteNode(current.leftChild, key);
        } else if (key > current.value) {
            current.rightChild = deleteNode(current.rightChild, key);
        } else {
            if (current.leftChild == null) {
                return current.rightChild;
            } else if (current.rightChild == null) {
                return current.leftChild;
            }

            current.value = getMinValue(current.rightChild);
            current.rightChild = deleteNode(current.rightChild, current.value);
        }
        return current;
    }

    private int getMinValue(TreeNode current) {
        int minValue = current.value;
        while (current.leftChild != null) {
            minValue = current.leftChild.value;
            current = current.leftChild;
        }
        return minValue;
    }

    public void clear() {
        root = clearAll(root);
    }

    private TreeNode clearAll(TreeNode current) {
        if (current == null) {
            return null;
        }
        current.leftChild = clearAll(current.leftChild);
        current.rightChild = clearAll(current.rightChild);
        current = null;
        return current;
    }
}

