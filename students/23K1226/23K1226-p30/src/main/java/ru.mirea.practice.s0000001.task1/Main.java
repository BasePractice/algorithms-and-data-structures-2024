package ru.mirea.practice.s0000001.task1;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public final class Main { // Финальный класс для утилитарности
    private Main() { // Приватный конструктор для предотвращения создания экземпляров
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { // try-with-resources для закрытия Scanner
            BinaryTree tree = new BinaryTree();
            System.out.println("Введите элементы бинарного дерева (через пробел):");
            String line = scanner.nextLine();
            String[] elements = line.split(" ");
            for (String element : elements) {
                int value = Integer.parseInt(element);
                tree.insert(value);
            }

            System.out.println("Символы и их частоты (формат: символ частота, через пробел):");
            String charFreqLine = scanner.nextLine();
            String[] charFreqInput = charFreqLine.split(" ");
            Map<Character, Integer> charFrequencies = new HashMap<>();
            for (int i = 0; i < charFreqInput.length; i += 2) {
                char character = charFreqInput[i].charAt(0);
                int frequency = Integer.parseInt(charFreqInput[i + 1]);
                charFrequencies.put(character, frequency);
            }

            System.out.println("Обход бинарного дерева (in-order):");
            tree.inorder();
            System.out.println();

            Huffman huffman = new Huffman();
            Map<Character, String> huffmanCodes = huffman.buildHuffmanTree(charFrequencies);

            System.out.println("Коды Хаффмана:");
            for (Map.Entry<Character, String> entry : huffmanCodes.entrySet()) {
                char character = entry.getKey();
                String code = entry.getValue();
                System.out.println(character + ": " + code);
            }
        }
    }
}
