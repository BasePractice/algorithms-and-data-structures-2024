package ru.mirea.practice.s0000001.task2;

class Node implements Comparable<Node> {
    int frequency;
    char character;
    Node left;
    Node right;

    public Node(char character, int frequency) {
        this.frequency = frequency;
        this.character = character;
        left = right = null;
    }

    @Override
    public int compareTo(Node other) {
        return Integer.compare(this.frequency, other.frequency);
    }
}
