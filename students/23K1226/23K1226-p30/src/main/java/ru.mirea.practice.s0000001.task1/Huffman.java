package ru.mirea.practice.s0000001.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Huffman {
    public Map<Character, String> buildHuffmanTree(Map<Character, Integer> charFrequencies) {
        PriorityQueue<HuffmanNode> queue = new PriorityQueue<>();

        for (Map.Entry<Character, Integer> entry : charFrequencies.entrySet()) {
            queue.add(new HuffmanNode(entry.getValue(), entry.getKey()));
        }

        while (queue.size() > 1) {
            HuffmanNode left = queue.poll();
            HuffmanNode right = queue.poll();

            HuffmanNode combined = new HuffmanNode(left.frequency + right.frequency, '-');
            combined.left = left;
            combined.right = right;

            queue.add(combined);
        }

        HuffmanNode root = queue.poll();
        Map<Character, String> huffmanCodes = new HashMap<>();
        generateCodes(root, "", huffmanCodes);
        return huffmanCodes;
    }

    private void generateCodes(HuffmanNode root, String code, Map<Character, String> huffmanCodes) {
        if (root == null) {
            return;
        }
        if (root.character != '-') {
            huffmanCodes.put(root.character, code);
        }
        generateCodes(root.left, code + "0", huffmanCodes);
        generateCodes(root.right, code + "1", huffmanCodes);
    }
}
