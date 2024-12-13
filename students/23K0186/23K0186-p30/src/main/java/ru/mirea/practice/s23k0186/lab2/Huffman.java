package ru.mirea.practice.s23k0145.lab2;

import java.util.PriorityQueue;
import java.util.Map;
import java.util.HashMap;

abstract class Huffman {
    public static void generateHuffmanTree(String input) {
        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        for (char ch : input.toCharArray()) {
            charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<TreeNode> priorityQueue = new PriorityQueue<>();
        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            priorityQueue.add(new TreeNode(entry.getKey(), entry.getValue()));
        }

        while (priorityQueue.size() > 1) {
            TreeNode leftChild = priorityQueue.poll();
            TreeNode rightChild = priorityQueue.poll();
            TreeNode parentNode = new TreeNode('\0', leftChild.frequency + rightChild.frequency);
            parentNode.left = leftChild;
            parentNode.right = rightChild;
            priorityQueue.add(parentNode);
        }

        TreeNode rootNode = priorityQueue.poll();

        Map<Character, String> huffmanCodeMap = new HashMap<>();
        createHuffmanCodes(rootNode, "", huffmanCodeMap);

        for (Map.Entry<Character, String> entry : huffmanCodeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static void createHuffmanCodes(TreeNode currentNode, String code, Map<Character, String> codeMap) {
        if (currentNode == null) {
            return;
        }
        if (currentNode.character != '\0') {
            codeMap.put(currentNode.character, code);
        }
        createHuffmanCodes(currentNode.left, code + "0", codeMap);
        createHuffmanCodes(currentNode.right, code + "1", codeMap);
    }

    public static void main(String[] args) {
        String sampleText = "aabacabad";
        generateHuffmanTree(sampleText);
    }
}
