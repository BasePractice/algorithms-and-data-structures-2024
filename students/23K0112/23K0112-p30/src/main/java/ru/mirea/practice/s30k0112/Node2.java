package ru.mirea.practice.s30k0112;

class Node2 {
    char ch;
    int freq;
    Node2 left = null;
    Node2 right = null;

    Node2(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
    }

    public Node2(char ch, int freq, Node2 left, Node2 right) {
        this.ch = ch;
        this.freq = freq;
        this.left = left;
        this.right = right;
    }
}
