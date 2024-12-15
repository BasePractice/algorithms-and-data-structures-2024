package ru.mirea.practice.s23k0350.pt1;

class Node {
    int freq;
    char ch;
    Node left;
    Node right;

    Node(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
        this.left = null;
        this.right = null;
    }
}