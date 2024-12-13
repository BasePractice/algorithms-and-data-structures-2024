package ru.mirea.practice.s0000001.num1;

public class Node {
    char ch;
    int freq;
    Node left;
    Node right;

    public Node(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
        this.left = null;
        this.right = null;
    }
}
