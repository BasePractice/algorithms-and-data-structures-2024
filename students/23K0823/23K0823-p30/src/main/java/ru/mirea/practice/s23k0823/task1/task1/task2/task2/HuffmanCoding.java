package ru.mirea.practice.s23k0823.task1.task1.task2.task2;

import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.Map;

public abstract class HuffmanCoding {
    private static Map<Character, String> huffmanCodeMap = new HashMap<>();

    public static HuffmanNode buildHuffmanTree(char[] charArray, int[] charFreq) {
        PriorityQueue<HuffmanNode> priorityQueue = new PriorityQueue<>(charArray.length, new HuffmanComparator());

        for (int i = 0; i < charArray.length; i++) {
            priorityQueue.add(new HuffmanNode(charArray[i], charFreq[i]));
        }

        while (priorityQueue.size() > 1) {
            HuffmanNode left = priorityQueue.poll();
            HuffmanNode right = priorityQueue.poll();
            HuffmanNode sum = new HuffmanNode('\0', left.freq + right.freq);
            sum.left = left;
            sum.right = right;
            priorityQueue.add(sum);
        }

        return priorityQueue.poll();
    }

    public static void generateHuffmanCodes(HuffmanNode root, String code) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            huffmanCodeMap.put(root.c, code);
        }

        generateHuffmanCodes(root.left, code + "0");
        generateHuffmanCodes(root.right, code + "1");
    }

    public static String encode(String text) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : text.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        char[] charArray = new char[frequencyMap.size()];
        int[] charFreq = new int[frequencyMap.size()];
        int index = 0;

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            charArray[index] = entry.getKey();
            charFreq[index] = entry.getValue();
            index++;
        }

        HuffmanNode root = buildHuffmanTree(charArray, charFreq);
        generateHuffmanCodes(root, "");

        StringBuilder encodedString = new StringBuilder();
        for (char c : text.toCharArray()) {
            encodedString.append(huffmanCodeMap.get(c));
        }

        return encodedString.toString();
    }

    public static String decode(HuffmanNode root, String encodedString) {
        StringBuilder decodedString = new StringBuilder();
        HuffmanNode current = root;

        for (char bit : encodedString.toCharArray()) {
            current = (bit == '0') ? current.left : current.right;

            if (current.left == null && current.right == null) {
                decodedString.append(current.c);
                current = root;
            }
        }

        return decodedString.toString();
    }

    public static void main(String[] args) {
        String text = "hello huffman";
        System.out.println("Исходный текст: " + text);

        String encodedString = encode(text);
        System.out.println("Закодированная строка: " + encodedString);

        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : text.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        char[] charArray = new char[frequencyMap.size()];
        int[] charFreq = new int[frequencyMap.size()];
        int index = 0;
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            charArray[index] = entry.getKey();
            charFreq[index] = entry.getValue();
            index++;
        }

        HuffmanNode root = buildHuffmanTree(charArray, charFreq);

        String decodedString = decode(root, encodedString);
        System.out.println("Декодированная строка: " + decodedString);
    }
}
