package ru.mirea.practice.s0000001;

import java.util.PriorityQueue;

public abstract class HuffmanTree {
    static class Node implements Comparable<Node> {
        char ch;
        int freq;
        Node left;
        Node right;

        Node(char ch, int freq) {
            this.ch = ch;
            this.freq = freq;
        }

        Node(int freq, Node left, Node right) {
            this.freq = freq;
            this.left = left;
            this.right = right;
        }

        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.freq, other.freq);
        }
    }

    public static void buildHuffmanTree(char[] chars, int[] freqs) {
        PriorityQueue<Node> pq = new PriorityQueue<>();

        for (int i = 0; i < chars.length; i++) {
            pq.add(new Node(chars[i], freqs[i]));
        }

        while (pq.size() > 1) {
            Node left = pq.poll();
            Node right = pq.poll();
            Node parent = new Node(left.freq + right.freq, left, right);
            pq.add(parent);
        }

        printHuffmanCodes(pq.poll(), "");
    }

    private static void printHuffmanCodes(Node root, String code) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                System.out.println(root.ch + ": " + code);
            }
            printHuffmanCodes(root.left, code + "0");
            printHuffmanCodes(root.right, code + "1");
        }
    }

    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'd', 'e'};
        int[] freqs = {12, 4, 15, 8, 25};

        buildHuffmanTree(chars, freqs);
    }
}

