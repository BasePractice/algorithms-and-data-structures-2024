package ru.mirea.practice.lab30.t2;

import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public abstract class HuffmanCoding {

    public static Map<Character, Integer> createFrequencyMap(String message) {
        Map<Character, Integer> frequencyMap = new TreeMap<>();
        for (char c : message.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        return frequencyMap;
    }

    public static Map<Character, String> buildHuffmanTree(Map<Character, Integer> frequencyMap) {
        PriorityQueue<HuffmanNode> queue = new PriorityQueue<>();
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            queue.add(new HuffmanNode(entry.getKey(), entry.getValue()));
        }

        while (queue.size() > 1) {
            HuffmanNode left = queue.poll();
            HuffmanNode right = queue.poll();
            HuffmanNode parent = new HuffmanNode('\0', left.frequency + right.frequency);
            parent.left = left;
            parent.right = right;
            queue.add(parent);
        }

        Map<Character, String> huffmanCodes = new TreeMap<>();
        generateHuffmanCodes(queue.peek(), "", huffmanCodes);

        return huffmanCodes;
    }

    public static void generateHuffmanCodes(HuffmanNode node, String code, Map<Character, String> huffmanCodes) {
        if (node != null) {
            if (node.character != '\0') {
                huffmanCodes.put(node.character, code);
            }
            generateHuffmanCodes(node.left, code + "0", huffmanCodes);
            generateHuffmanCodes(node.right, code + "1", huffmanCodes);
        }
    }

    public static class HuffmanNode implements Comparable<HuffmanNode> {
        char character;
        int frequency;
        HuffmanNode left;
        HuffmanNode right;

        HuffmanNode(char character, int frequency) {
            this.character = character;
            this.frequency = frequency;
        }

        @Override
        public int compareTo(HuffmanNode other) {
            return Integer.compare(this.frequency, other.frequency);
        }
    }
}
