package ru.mirea.practice.s23k0143;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Huffman {
    public void printCodes(HuffmanNode root, String s) {
        if (root.left == null && root.right == null) {
            System.out.println(root.data + ": " + s);
            return;
        }
        printCodes(root.left, s + "0");
        printCodes(root.right, s + "1");
    }

    public void huffmanAlgorithm(char[] charArray, int[] charFreq) {
        PriorityQueue<HuffmanNode> q = new PriorityQueue<>(charArray.length, Comparator.comparingInt(node -> node.freq));

        for (int i = 0; i < charArray.length; i++) {
            q.add(new HuffmanNode(charArray[i], charFreq[i]));
        }

        HuffmanNode root = null;

        while (q.size() > 1) {
            HuffmanNode left = q.poll();
            HuffmanNode right = q.poll();

            HuffmanNode f = new HuffmanNode('$', left.freq + right.freq);
            f.left = left;
            f.right = right;
            root = f;

            q.add(f);
        }

        printCodes(root, "");
    }
}

