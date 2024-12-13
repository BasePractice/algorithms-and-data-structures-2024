package ru.mirea.practice.s0000001.num2;

import java.util.PriorityQueue;
import java.util.Map;
import java.util.HashMap;

final class Main {
    private Main() { }

    static final class Huffman {
        private Huffman() { }

        public static void buildHuffmanTree(String text) {
            Map<Character, Integer> freqMap = new HashMap<>();
            for (char c : text.toCharArray()) {
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            }

            PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.freq - b.freq);
            for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
                Node node = new Node(entry.getKey(), entry.getValue());
                pq.add(node);
            }

            while (pq.size() > 1) {
                Node left = pq.poll();
                Node right = pq.poll();
                Node node = new Node('\0', left.freq + right.freq);
                node.left = left;
                node.right = right;
                pq.add(node);
            }

            Node root = pq.poll();
            printCodes(root, "");
        }

        private static void printCodes(Node root, String code) {
            if (root == null) {
                return;
            }
            if (root.c != '\0') {
                System.out.println(root.c + ": " + code);
            }
            printCodes(root.left, code + "0");
            printCodes(root.right, code + "1");
        }
    }

    static class Node {
        char c;
        int freq;
        Node left;
        Node right;

        Node(char c, int freq) {
            this.c = c;
            this.freq = freq;
            left = null;
            right = null;
        }
    }

    public static void main(String[] args) {
        String text = "привет";
        System.out.println("Коды Хаффмана для строки \"" + text + "\":");
        Huffman.buildHuffmanTree(text);
    }
}

