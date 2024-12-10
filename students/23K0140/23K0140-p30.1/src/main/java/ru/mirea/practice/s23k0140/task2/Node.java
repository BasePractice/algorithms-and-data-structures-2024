package ru.mirea.practice.s23k0140.task2;

class Node implements Comparable<Node> {
    int frequency;
    char character;
    Node left;
    Node right;

    public Node(char character, int frequency) {
        this.character = character;
        this.frequency = frequency;
        left = right = null;
    }

    @Override
    public int compareTo(Node other) {
        return this.frequency - other.frequency;
    }
}