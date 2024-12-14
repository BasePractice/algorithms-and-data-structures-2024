package ru.mirea.practice.s0000001.n2;

import java.util.PriorityQueue;

public final class HufAlg {

    private HufAlg() {
        throw new UnsupportedOperationException("Utility class");
    }

    static HufNod buildHuffmanTree(int[] freqs) {
        PriorityQueue<HufNod> pq = new PriorityQueue<>((a, b) -> a.freq - b.freq);
        for (int f : freqs) {
            pq.add(new HufNod(f));
        }

        while (pq.size() > 1) {
            HufNod a = pq.poll();
            HufNod b = pq.poll();
            HufNod sum = new HufNod(a.freq + b.freq);
            sum.left = a;
            sum.right = b;
            pq.add(sum);
        }
        return pq.poll();
    }

    static void printHuffmanTree(HufNod root, String code) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            System.out.println("Символ: " + root.freq + " Код: " + code);
        }
        printHuffmanTree(root.left, code + "0");
        printHuffmanTree(root.right, code + "1");
    }

    public static void main(String[] args) {
        int[] freqs = {2, 3, 5, 7, 11, 13, 17};

        HufNod root = buildHuffmanTree(freqs);
        System.out.println("Корень дерева Хаффмана: " + root.freq);
        System.out.println("Коды Хаффмана для символов:");
        printHuffmanTree(root, "");
    }
}
