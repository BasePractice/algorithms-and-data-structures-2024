package ru.mirea.practice.task1.task2;

import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.Map;

public final class HuffmanCoding {

    private HuffmanCoding() {
        throw new UnsupportedOperationException("Это утилитный класс, и его нельзя создавать.");
    }

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

            HuffmanNode newNode = new HuffmanNode('\0', left.frequency + right.frequency);
            newNode.left = left;
            newNode.right = right;

            priorityQueue.offer(newNode);
        }

        HuffmanNode root = priorityQueue.poll();

        Map<Character, String> huffmanCodeMap = new HashMap<>();
        generateHuffmanCodes(root, "", huffmanCodeMap);

        System.out.println("Хаффмановские коды:");
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
        String text = "Это пример для кодирования Хаффмана";
        buildHuffmanTree(text);
    }
}
