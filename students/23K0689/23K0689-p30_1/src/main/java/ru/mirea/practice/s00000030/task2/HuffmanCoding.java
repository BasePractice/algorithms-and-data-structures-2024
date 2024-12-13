package ru.mirea.practice.s00000030.task2;

import java.util.PriorityQueue;

public final class HuffmanCoding {

    // Приватный конструктор, чтобы предотвратить создание экземпляров класса
    private HuffmanCoding() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    static class Node implements Comparable<Node> {
        char ch;
        int freq;
        Node left;
        Node right;

        Node(char ch, int freq) {
            this.ch = ch;
            this.freq = freq;
            this.left = null;
            this.right = null;
        }

        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.freq, other.freq);
        }
    }

    public static Node buildHuffmanTree(char[] charArray, int[] freqArray) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        for (int i = 0; i < charArray.length; i++) {
            pq.add(new Node(charArray[i], freqArray[i]));
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

    public static void generateCodes(Node root, String code, String[] codes) {
        if (root == null) {
            return;
        }

        if (root.ch != '\0') {
            codes[root.ch] = code;
        }

        generateCodes(root.left, code + "0", codes);
        generateCodes(root.right, code + "1", codes);
    }

    public static void main(String[] args) {
        char[] chars = { 'a', 'b', 'c', 'd', 'e' };
        int[] freqs = { 12, 4, 15, 8, 25 };

        Node root = buildHuffmanTree(chars, freqs);

        String[] codes = new String[256];
        generateCodes(root, "", codes);

        for (char ch : chars) {
            System.out.println(ch + ": " + codes[ch]);
        }
    }
}
