package ru.mirea.practice.s0000001;

public class Ex {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    private Node root;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }
        if (data < node.data) {
            node.left = insertRec(node.left, data);
        } else if (data > node.data) {
            node.right = insertRec(node.right, data);
        }
        return node;
    }

    public void delete(int data) {
        root = deleteRec(root, data);
    }

    private Node deleteRec(Node node, int data) {
        if (node == null) {
            return null;
        }
        if (data < node.data) {
            node.left = deleteRec(node.left, data);
        } else if (data > node.data) {
            node.right = deleteRec(node.right, data);
        } else {
            if (node.left == null) {
                return node.right;
            }
            if (node.right == null) {
                return node.left;
            }

            node.data = findMin(node.right);
            node.right = deleteRec(node.right, node.data);
        }
        return node;
    }

    private int findMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node.data;
    }

    public void printTree() {
        printInOrder(root);
        System.out.println();
    }

    private void printInOrder(Node node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.print(node.data + " ");
            printInOrder(node.right);
        }
    }

    public void destroyTree() {
        root = null;
    }

    public int getHeight() {
        return getHeightRec(root);
    }

    private int getHeightRec(Node node) {
        if (node == null) {
            return 0;
        }
        return Math.max(getHeightRec(node.left), getHeightRec(node.right)) + 1;
    }

    public static void main(String[] args) {
        Ex tree = new Ex();

        int[] elements = {50, 30, 70, 20, 40, 60, 80, 10, 35, 65};
        for (int el : elements) {
            tree.insert(el);
        }

        System.out.println("Создание дерева с 10 узлами:");
        tree.printTree();

        tree.delete(30);
        System.out.println("Удаление узла 30:");
        tree.printTree();

        System.out.println("Высота дерева: " + tree.getHeight());

        tree.destroyTree();
        System.out.println("Дерево удалено.");
    }
}
