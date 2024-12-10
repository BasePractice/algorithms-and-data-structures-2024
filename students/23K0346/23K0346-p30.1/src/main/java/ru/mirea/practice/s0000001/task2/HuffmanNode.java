package ru.mirea.practice.s0000001.task2;

class HuffmanNode implements Comparable<HuffmanNode> {
    int frequency;
    char character;
    HuffmanNode left;
    HuffmanNode right;

    public HuffmanNode(char character, int frequency) {
        this.character = character;
        this.frequency = frequency;
        left = right = null;
    }

    @Override
    public int compareTo(HuffmanNode other) {
        return this.frequency - other.frequency;
    }
}

