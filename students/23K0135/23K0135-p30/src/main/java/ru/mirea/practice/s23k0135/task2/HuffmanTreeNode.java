package ru.mirea.practice.s23k0135.task2;

public class HuffmanTreeNode {
    int freq;
    char character;
    HuffmanTreeNode left;
    HuffmanTreeNode right;

    HuffmanTreeNode(char character, int freq) {
        this.character = character;
        this.freq = freq;
        left = right = null;
    }
}
