package ru.mirea.practice.s0000001.task2;

import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.Map;

public abstract class HuffmanCoding {

    // Метод для построения дерева Хаффмана
    public static Node buildHuffmanTree(Map<Character, Integer> frequencyMap) {
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>();

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            priorityQueue.add(new Node(entry.getKey(), entry.getValue()));
        }

        while (priorityQueue.size() > 1) {
            Node left = priorityQueue.poll();
            Node right = priorityQueue.poll();
            Node sum = new Node('\0', left.frequency + right.frequency);
            sum.left = left;
            sum.right = right;
            priorityQueue.add(sum);
        }

        return priorityQueue.poll();
    }

    // Метод для создания кодов Хаффмана
    public static void generateHuffmanCodes(Node root, String code, Map<Character, String> huffmanCode) {
        if (root == null) {
            return;
        }

        // Если это листовой узел, добавляем его код
        if (root.left == null && root.right == null) {
            huffmanCode.put(root.character, code);
        }

        generateHuffmanCodes(root.left, code + "0", huffmanCode);
        generateHuffmanCodes(root.right, code + "1", huffmanCode);
    }

    // Основной метод
    public static void main(String[] args) {
        String text = "hello huffman"; // Пример текста для сжатия
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Подсчет частоты символов
        for (char c : text.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        Node root = buildHuffmanTree(frequencyMap);
        Map<Character, String> huffmanCode = new HashMap<>();
        generateHuffmanCodes(root, "", huffmanCode);

        // Вывод кодов
        System.out.println("Коды Хаффмана:");
        for (Map.Entry<Character, String> entry : huffmanCode.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}