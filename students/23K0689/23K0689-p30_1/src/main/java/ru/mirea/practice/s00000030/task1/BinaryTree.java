package ru.mirea.practice.s00000030.task2;

public class BinaryTree {
    private Node root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(char character, int frequency) {
        Node newNode = new Node(character, frequency);
        if (root == null) {
            root = newNode;
        } else {
            insertRecursive(root, newNode);
        }
    }

    private void insertRecursive(Node current, Node newNode) {
        if (newNode.frequency < current.frequency) {
            if (current.left == null) {
                current.left = newNode;
            } else {
                insertRecursive(current.left, newNode);
            }
        } else {
            if (current.right == null) {
                current.right = newNode;
            } else {
                insertRecursive(current.right, newNode);
            }
        }
    }

    public void inorder() {
        inorderRecursive(root);
    }

    private void inorderRecursive(Node current) {
        if (current != null) {
            inorderRecursive(current.left);
            System.out.print(current.character + " ");
            inorderRecursive(current.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert('a', 5);
        tree.insert('b', 2);
        tree.insert('c', 8);
        tree.inorder();
    }
}
