package ru.mirea.practices0000001.task1;

public class HuffmanNode {
    int freq;
    char data;
    HuffmanNode left;
    HuffmanNode right;

    HuffmanNode(char data, int freq) {
        left = right = null;
        this.data = data;
        this.freq = freq;
    }
}
