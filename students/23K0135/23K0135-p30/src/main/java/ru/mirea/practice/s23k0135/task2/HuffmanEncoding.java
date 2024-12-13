package ru.mirea.practice.s23k0135.task2;


import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.Map;

public abstract class HuffmanEncoding {
    private static Map<Character, String> encodingMap = new HashMap<>();

    public static HuffmanTreeNode buildHuffmanTree(char[] characters, int[] frequencies) {
        PriorityQueue<HuffmanTreeNode> queue = new PriorityQueue<>(characters.length, new HuffmanTreeComparator());

        for (int i = 0; i < characters.length; i++) {
            queue.add(new HuffmanTreeNode(characters[i], frequencies[i]));
        }

        while (queue.size() > 1) {
            HuffmanTreeNode leftChild = queue.poll();
            HuffmanTreeNode rightChild = queue.poll();
            HuffmanTreeNode combinedNode = new HuffmanTreeNode('\0', leftChild.freq + rightChild.freq);
            combinedNode.left = leftChild;
            combinedNode.right = rightChild;
            queue.add(combinedNode);
        }

        return queue.poll();
    }

    public static void generateEncoding(HuffmanTreeNode node, String currentCode) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            encodingMap.put(node.character, currentCode);
        }

        generateEncoding(node.left, currentCode + "0");
        generateEncoding(node.right, currentCode + "1");
    }

    public static String encodeText(String inputText) {
        Map<Character, Integer> charFrequency = new HashMap<>();
        for (char character : inputText.toCharArray()) {
            charFrequency.put(character, charFrequency.getOrDefault(character, 0) + 1);
        }

        char[] characterArray = new char[charFrequency.size()];
        int[] frequencyArray = new int[charFrequency.size()];
        int idx = 0;

        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            characterArray[idx] = entry.getKey();
            frequencyArray[idx] = entry.getValue();
            idx++;
        }

        HuffmanTreeNode rootNode = buildHuffmanTree(characterArray, frequencyArray);
        generateEncoding(rootNode, "");

        StringBuilder encodedString = new StringBuilder();
        for (char character : inputText.toCharArray()) {
            encodedString.append(encodingMap.get(character));
        }

        return encodedString.toString();
    }

    public static String decodeText(HuffmanTreeNode rootNode, String encodedText) {
        StringBuilder decodedString = new StringBuilder();
        HuffmanTreeNode currentNode = rootNode;

        for (char bit : encodedText.toCharArray()) {
            currentNode = (bit == '0') ? currentNode.left : currentNode.right;

            if (currentNode.left == null && currentNode.right == null) {
                decodedString.append(currentNode.character);
                currentNode = rootNode;
            }
        }

        return decodedString.toString();
    }

    public static void main(String[] args) {
        String inputText = "hello huffman";
        System.out.println("Original text: " + inputText);

        String encodedText = encodeText(inputText);
        System.out.println("Encoded string: " + encodedText);

        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : inputText.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        char[] characters = new char[frequencyMap.size()];
        int[] frequencies = new int[frequencyMap.size()];
        int idx = 0;
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            characters[idx] = entry.getKey();
            frequencies[idx] = entry.getValue();
            idx++;
        }

        HuffmanTreeNode rootNode = buildHuffmanTree(characters, frequencies);

        String decodedText = decodeText(rootNode, encodedText);
        System.out.println("Decoded string: " + decodedText);
    }
}
