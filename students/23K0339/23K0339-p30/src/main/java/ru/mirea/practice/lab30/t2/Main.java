package ru.mirea.practice.lab30.t2;

import java.util.Map;

public abstract class Main {

    public static void main(String[] args) {
        String message = "abracadabra";

        Map<Character, Integer> frequencyMap = HuffmanCoding.createFrequencyMap(message);
        System.out.println("Частотная карта:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        Map<Character, String> huffmanCodes = HuffmanCoding.buildHuffmanTree(frequencyMap);
        System.out.println("\nКоды Хаффмана:");
        for (Map.Entry<Character, String> entry : huffmanCodes.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
