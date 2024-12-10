package ru.mirea.practice.s0000001;

class Node {
    char ch;
    int freq;
    Node left = null;
    Node right = null;

    Node(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
    }

    public Node(char ch, int freq, Node left, Node right) {
        this.ch = ch;
        this.freq = freq;
        this.left = left;
        this.right = right;
    }
}
