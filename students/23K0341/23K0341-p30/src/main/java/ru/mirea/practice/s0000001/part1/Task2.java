package ru.mirea.practice.s0000001.part1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * Реализовать алгоритм Хаффмана
 */

public abstract class Task2 {
    static class HuffmanNode {
        char data;
        int frequency;
        HuffmanNode left;
        HuffmanNode right;

        HuffmanNode(char data, int frequency) {
            this.data = data;
            this.frequency = frequency;
            left = null;
            right = null;
        }
    }

    public static void main(String[] args) {
        String message = "Test this string of text that has that many letters t.";

        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : message.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<HuffmanNode> priorityQueue =
                new PriorityQueue<>(Comparator.comparingInt(a -> a.frequency));

        for (char c : frequencyMap.keySet()) {
            priorityQueue.add(new HuffmanNode(c, frequencyMap.get(c)));
        }

        while (priorityQueue.size() > 1) {
            HuffmanNode left = priorityQueue.poll();
            HuffmanNode right = priorityQueue.poll();

            HuffmanNode newNode = new HuffmanNode('$', left.frequency + right.frequency);

            newNode.left = left;
            newNode.right = right;
            priorityQueue.add(newNode);
        }

        HuffmanNode root = priorityQueue.poll();

        System.out.println("Коды:");
        printCodes(root, new StringBuilder());
    }

    static void printCodes(HuffmanNode root, StringBuilder code) {
        if (root == null) {
            return;
        }

        if (root.data != '$') {
            System.out.println(root.data + ": " + code);
        }

        // Traverse the left subtree
        if (root.left != null) {
            printCodes(root.left, code.append('0'));
            code.deleteCharAt(code.length() - 1);
        }

        // Traverse the right subtree
        if (root.right != null) {
            printCodes(root.right, code.append('1'));
            code.deleteCharAt(code.length() - 1);
        }
    }
}
