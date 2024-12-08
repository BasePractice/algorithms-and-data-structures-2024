package ru.mirea.practice.s23k0155;

import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;

public class HaffmansNode {
    char symbol;
    int freq;
    HaffmansNode left;
    HaffmansNode right;

    public HaffmansNode(char symbol, int freq) {
        this.symbol = symbol;
        this.freq = freq;
    }

    public HaffmansNode(int freq, HaffmansNode left, HaffmansNode right) {
        this.symbol = '0';
        this.freq = freq;
        this.left = left;
        this.right = right;
    }

    public static HaffmansNode huffmansTree(Map<Character, Integer> element) {
        PriorityQueue<HaffmansNode> queue = new PriorityQueue<>(Comparator.comparingInt(node -> node.freq));

        for (Map.Entry<Character, Integer> entry : element.entrySet()) {
            queue.add(new HaffmansNode(entry.getKey(), entry.getValue()));
        }
        while (queue.size() > 1) {
            HaffmansNode left = queue.poll();
            HaffmansNode right = queue.poll();
            HaffmansNode parent = new HaffmansNode(left.freq + right.freq, left, right);
            queue.add(parent);
        }
        return queue.poll();
    }

    public static void generateCode(HaffmansNode node, String code, Map<Character, String> hafCode) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            hafCode.put(node.symbol, code);
            return;
        }
        generateCode(node.left, code + "0", hafCode);
        generateCode(node.right, code + "1", hafCode);
    }
}
