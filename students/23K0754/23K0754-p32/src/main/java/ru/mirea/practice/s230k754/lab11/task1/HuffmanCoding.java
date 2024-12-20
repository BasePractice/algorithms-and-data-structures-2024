package ru.mirea.practice.s230k754.lab11.task1;

import java.util.HashMap;
import java.util.PriorityQueue;

public final class HuffmanCoding {
    private HuffmanCoding() {}

    public static void main(String[] args) {
        String message = "Huffman coding is a lossless data compression algorithm.";

        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : message.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<HaffmanN> priorityQueue =
            new PriorityQueue<>((a, b) -> a.frequency - b.frequency);

        for (char c : frequencyMap.keySet()) {
            priorityQueue.add(new HaffmanN(c, frequencyMap.get(c)));
        }

        while (priorityQueue.size() > 1) {
            HaffmanN left = priorityQueue.poll();
            HaffmanN right = priorityQueue.poll();

            HaffmanN newNode =
                new HaffmanN('$', left.frequency + right.frequency);

            newNode.left = left;
            newNode.right = right;
            priorityQueue.add(newNode);
        }

        HaffmanN root = priorityQueue.poll();

        System.out.println("Huffman codes:");
        printCodes(root, new StringBuilder());
    }

    public static void printCodes(HaffmanN root, StringBuilder code) {
        if (root == null) {
            return;
        }

        if (root.data != '$') {
            System.out.println(root.data + ": " + code);
        }

        if (root.left != null) {
            printCodes(root.left, code.append('0'));
            code.deleteCharAt(code.length() - 1);
        }

        if (root.right != null) {
            printCodes(root.right, code.append('1'));
            code.deleteCharAt(code.length() - 1);
        }
    }
}
