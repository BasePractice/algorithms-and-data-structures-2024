package ru.mirea.practice.s23k1167.task1.task1.task2.task2;

class HuffmanNode {
    int freq;

    char c;

    HuffmanNode left;

    HuffmanNode right;

    HuffmanNode(char c, int freq) {
        this.c = c;
        this.freq = freq;
        left = right = null;
    }
}
