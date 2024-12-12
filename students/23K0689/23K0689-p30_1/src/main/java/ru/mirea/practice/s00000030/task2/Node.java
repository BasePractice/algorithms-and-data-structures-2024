package ru.mirea.practice.s00000030.task2;

public class Node {
    int frequency;
    char character;
    Node left;
    Node right;

    Node(char character, int frequency) {
        this.character = character;
        this.frequency = frequency;
        this.left = null;
        this.right = null;
    }
}
