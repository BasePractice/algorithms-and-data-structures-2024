package ru.mirea.practice.task1.task2;

public class HuffmanNode {
    char ch;
    int frequency;
    HuffmanNode left;
    HuffmanNode right;

    public HuffmanNode(char ch, int frequency) {
        this.ch = ch;
        this.frequency = frequency;
        this.left = this.right = null;
    }
}

