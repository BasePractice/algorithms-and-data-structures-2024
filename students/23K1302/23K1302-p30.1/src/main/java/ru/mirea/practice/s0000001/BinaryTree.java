package ru.mirea.practice.s0000001;

import java.util.PriorityQueue;
import java.util.Comparator;

public final class BinaryTree {

    private BinaryTree() {
        // Пусто
    }

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static int height(Node node) {
        if (node == null) {
            return 0;
        }
        return Math.max(height(node.left), height(node.right)) + 1;
    }

    public static Node mirror(Node node) {
        if (node == null) {
            return null;
        }
        Node temp = node.left;
        node.left = mirror(node.right);
        node.right = mirror(temp);
        return node;
    }

    public static boolean search(Node node, int value) {
        if (node == null) {
            return false;
        }
        if (node.data == value) {
            return true;
        }
        return value < node.data ? search(node.left, value) : search(node.right, value);
    }

    public static void huffmanEncoding(int[] frequencies) {
        PriorityQueue<Node> queue = new PriorityQueue<>(Comparator.comparingInt(n -> n.data));
        for (int freq : frequencies) {
            queue.add(new Node(freq));
        }
        while (queue.size() > 1) {
            Node left = queue.poll();
            Node right = queue.poll();
            Node parent = new Node(left.data + right.data);
            parent.left = left;
            parent.right = right;
            queue.add(parent);
        }
        printHuffmanTree(queue.poll(), "");
    }

    private static void printHuffmanTree(Node root, String code) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            System.out.println("Значение: " + root.data + ", Код: " + code);
        }
        printHuffmanTree(root.left, code + "0");
        printHuffmanTree(root.right, code + "1");
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(3);
        root.left.right = new Node(7);

        System.out.println("Высота: " + height(root));
        System.out.println("Найти 7: " + search(root, 7));
        System.out.println("Найти 20: " + search(root, 20));

        mirror(root);

        System.out.println("Алгоритм Хаффмана:");
        int[] frequencies = {2, 3, 5, 7, 11, 13};
        huffmanEncoding(frequencies);
    }
}
