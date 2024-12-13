package ru.mirea.practice.s23k0690;

import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.Map;

public final class Task2 {

    private Task2() {}

    public static void buildHuffmanTree(String text) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : text.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        PriorityQueue<HuffmanNode> priorityQueue = new PriorityQueue<>(
            (a, b) -> a.frequency - b.frequency
        );

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            priorityQueue.offer(new HuffmanNode(entry.getKey(), entry.getValue()));
        }

        while (priorityQueue.size() > 1) {
            HuffmanNode left = priorityQueue.poll();
            HuffmanNode right = priorityQueue.poll();

            assert right != null;
            HuffmanNode newNode = new HuffmanNode('\0', left.frequency + right.frequency);
            newNode.left = left;
            newNode.right = right;

            priorityQueue.offer(newNode);
        }

        HuffmanNode root = priorityQueue.poll();

        Map<Character, String> huffmanCodeMap = new HashMap<>();
        generateHuffmanCodes(root, "", huffmanCodeMap);

        for (Map.Entry<Character, String> entry : huffmanCodeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        StringBuilder compressedText = new StringBuilder();
        for (char ch : text.toCharArray()) {
            compressedText.append(huffmanCodeMap.get(ch));
        }

        System.out.println("Сжатый текст: " + compressedText.toString());
    }

    private static void generateHuffmanCodes(HuffmanNode root, String code, Map<Character, String> huffmanCodeMap) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            huffmanCodeMap.put(root.ch, code);
        }

        generateHuffmanCodes(root.left, code + "0", huffmanCodeMap);
        generateHuffmanCodes(root.right, code + "1", huffmanCodeMap);
    }

    public static void main(String[] args) {
        String text = "Hello, world!";
        buildHuffmanTree(text);
    }
}

