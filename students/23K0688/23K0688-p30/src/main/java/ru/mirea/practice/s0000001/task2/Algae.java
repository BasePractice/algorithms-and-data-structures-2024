package ru.mirea.practice.s0000001.task2;

import java.util.PriorityQueue;

public class Algae {
    private String[] codes; // Array to store codes for characters

    public Algae() {
        // Initialize the codes array for ASCII characters (256 characters)
        codes = new String[256];
    }

    public void hasher(Node root, String code) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            codes[root.chara] = code; // Store the code in the array
        }
        hasher(root.left, code + "0");
        hasher(root.right, code + "1");
    }

    public static Node tree(char[] chars, int[] freqs) {
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < chars.length; i++) {
            priorityQueue.add(new Node(chars[i], freqs[i]));
        }
        while (priorityQueue.size() > 1) {
            Node left = priorityQueue.poll();
            Node right = priorityQueue.poll();
            Node newNode = new Node('\0', left.freq + right.freq);
            newNode.left = left;
            newNode.right = right;
            priorityQueue.add(newNode);
        }
        return priorityQueue.poll();
    }

    public String hash(String text) {
        StringBuilder encodedString = new StringBuilder();
        for (char character : text.toCharArray()) {
            String code = codes[character]; // Retrieve the code from the array
            if (code != null) {
                encodedString.append(code);
            }
        }
        return encodedString.toString();
    }

    public static class Node implements Comparable<Node> {
        char chara;
        int freq;
        Node left;
        Node right;

        public Node(char chara, int freq) {
            this.chara = chara;
            this.freq = freq;
        }

        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.freq, other.freq);
        }
    }
}
