package ru.mirea.practice.s0000001.task2;

import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public abstract class HuffmanAlgorithm {

    public static Map<Character, Integer> generateFrequencyMap(String input) {
        Map<Character, Integer> frequencyMap = new TreeMap<>();
        for (char character : input.toCharArray()) {
            frequencyMap.put(character, frequencyMap.getOrDefault(character, 0) + 1);
        }
        return frequencyMap;
    }

    public static Map<Character, String> constructHuffmanTree(Map<Character, Integer> frequencyMap) {
        PriorityQueue<HuffmanTreeNode> priorityQueue = new PriorityQueue<>();
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            priorityQueue.add(new HuffmanTreeNode(entry.getKey(), entry.getValue()));
        }

        while (priorityQueue.size() > 1) {
            HuffmanTreeNode leftNode = priorityQueue.poll();
            HuffmanTreeNode rightNode = priorityQueue.poll();
            HuffmanTreeNode parentNode = new HuffmanTreeNode('\0', leftNode.frequency + rightNode.frequency);
            parentNode.left = leftNode;
            parentNode.right = rightNode;
            priorityQueue.add(parentNode);
        }

        Map<Character, String> huffmanCodes = new TreeMap<>();
        createHuffmanCodes(priorityQueue.peek(), "", huffmanCodes);

        return huffmanCodes;
    }

    public static void createHuffmanCodes(HuffmanTreeNode node, String code, Map<Character, String> huffmanCodes) {
        if (node != null) {
            if (node.character != '\0') {
                huffmanCodes.put(node.character, code);
            }
            createHuffmanCodes(node.left, code + "0", huffmanCodes);
            createHuffmanCodes(node.right, code + "1", huffmanCodes);
        }
    }

    public static class HuffmanTreeNode implements Comparable<HuffmanTreeNode> {
        char character;
        int frequency;
        HuffmanTreeNode left;
        HuffmanTreeNode right;

        HuffmanTreeNode(char character, int frequency) {
            this.character = character;
            this.frequency = frequency;
        }

        @Override
        public int compareTo(HuffmanTreeNode other) {
            return Integer.compare(this.frequency, other.frequency);
        }
    }
}