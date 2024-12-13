package ru.mirea.practice.s0000001.num1;

import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList;
import java.util.Queue;

public final class Main {

    private Main() {
    }

    static Node root;

    static int height(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(height(node.left), height(node.right));
    }

    static int width(Node node) {
        if (node == null) {
            return 0;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        int maxWidth = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            maxWidth = Math.max(maxWidth, size);
            for (int i = 0; i < size; i++) {
                Node current = queue.poll();
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
        }
        return maxWidth;
    }

    static void mirror(Node node) {
        if (node == null) {
            return;
        }
        Node temp = node.left;
        node.left = node.right;
        node.right = temp;
        mirror(node.left);
        mirror(node.right);
    }

    static boolean search(Node node, char key) {
        if (node == null) {
            return false;
        }
        if (node.ch == key) {
            return true;
        }
        return search(node.left, key) || search(node.right, key);
    }

    static void printHuffmanCode(Map<Character, String> codes) {
        for (Map.Entry<Character, String> entry : codes.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    static Node buildHuffmanTree(Map<Character, Integer> freqMap) {
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.freq, b.freq));
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            pq.add(new Node(entry.getKey(), entry.getValue()));
        }
        while (pq.size() > 1) {
            Node left = pq.poll();
            Node right = pq.poll();
            Node newNode = new Node('\0', left.freq + right.freq);
            newNode.left = left;
            newNode.right = right;
            pq.add(newNode);
        }
        return pq.poll();
    }

    static void generateHuffmanCodes(Node node, String code, Map<Character, String> codes) {
        if (node == null) {
            return;
        }
        if (node.ch != '\0') {
            codes.put(node.ch, code);
        }
        generateHuffmanCodes(node.left, code + "0", codes);
        generateHuffmanCodes(node.right, code + "1", codes);
    }

    public static void main(String[] args) {
        root = new Node('A', 5);
        root.left = new Node('B', 3);
        root.right = new Node('C', 2);

        System.out.println("Высота дерева: " + height(root));
        System.out.println("Ширина дерева: " + width(root));
        mirror(root);
        System.out.println("Дерево после отражения:");

        System.out.println("Поиск элемента 'B': " + search(root, 'B'));

        Map<Character, Integer> freqMap = new HashMap<>();
        freqMap.put('A', 5);
        freqMap.put('B', 3);
        freqMap.put('C', 2);

        Node huffmanRoot = buildHuffmanTree(freqMap);
        Map<Character, String> codes = new HashMap<>();
        generateHuffmanCodes(huffmanRoot, "", codes);
        System.out.println("Коды Хаффмана:");
        printHuffmanCode(codes);
    }
}

