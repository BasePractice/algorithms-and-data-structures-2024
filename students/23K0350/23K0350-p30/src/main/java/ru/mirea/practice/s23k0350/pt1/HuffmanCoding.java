package ru.mirea.practice.s23k0350.pt1;

import java.util.PriorityQueue;

class HuffmanCoding {
    public void printCodes(Node root, String str) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            System.out.println(root.ch + ": " + str);
            return;
        }

        printCodes(root.left, str + '0');
        printCodes(root.right, str + '1');
    }

    public Node buildHuffmanTree(char[] chars, int[] freq) {
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>((a, b) -> a.freq - b.freq);

        for (int i = 0; i < chars.length; i++) {
            priorityQueue.add(new Node(chars[i], freq[i]));
        }

        while (priorityQueue.size() > 1) {
            Node left = priorityQueue.poll();
            Node right = priorityQueue.poll();
            Node newNode = new Node('\0', left.freq + right.freq);
            newNode.left = left;
            newNode.right = right;
            priorityQueue.add(newNode);
        }
        return priorityQueue.poll();
    }
}
