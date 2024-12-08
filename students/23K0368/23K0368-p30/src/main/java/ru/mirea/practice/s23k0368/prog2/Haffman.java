package ru.mirea.practice.s23k0368.prog2;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public abstract class Haffman {
    public static void haffman(Map<Character, Integer> charFreq) {
        PriorityQueue<Node> pq = new PriorityQueue<>();

        for (Map.Entry<Character, Integer> entry : charFreq.entrySet()) {
            pq.add(new Node(entry.getKey(), entry.getValue()));
        }

        while (pq.size() > 1) {
            Node left = pq.poll();
            Node right = pq.poll();

            Node parent = new Node('\0', left.getFrequency() + right.getFrequency());
            parent.setLeft(left);
            parent.setRight(right);
            pq.add(parent);
        }

        Node root = pq.peek();
        Map<Character, String> huffmanCodes = new HashMap<>();
        printCodes(root, "",  huffmanCodes);

        System.out.println("Символ\tкод");
        for (Map.Entry<Character, String> entry : huffmanCodes.entrySet()) {
            System.out.println(entry.getKey() + "\t\t" + entry.getValue());
        }
    }

    private static void printCodes(Node root, String currentCode, Map<Character, String> huffmanCodes) {
        if (root == null) {
            return;
        } else if (root.name != '\0') {
            huffmanCodes.put(root.name, currentCode);
        }
        printCodes(root.left, currentCode + "0", huffmanCodes);
        printCodes(root.right, currentCode + "1", huffmanCodes);
    }

    public static void main(String[] args) {
        Map<Character, Integer> charFrequencies = new HashMap<>();
        charFrequencies.put('A', 1);
        charFrequencies.put('B', 2);
        charFrequencies.put('C', 3);
        charFrequencies.put('D', 4);
        charFrequencies.put('E', 5);

        haffman(charFrequencies);
    }
}
