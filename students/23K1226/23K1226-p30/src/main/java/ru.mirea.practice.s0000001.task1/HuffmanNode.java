package ru.mirea.practice.s0000001.task1;

class HuffmanNode implements Comparable<HuffmanNode> {
    int frequency;
    char character;
    HuffmanNode left;
    HuffmanNode right;

    HuffmanNode(int frequency, char character) {
        this.frequency = frequency;
        this.character = character;
        this.left = null;
        this.right = null;
    }

    @Override
    public int compareTo(HuffmanNode other) {
        return Integer.compare(this.frequency, other.frequency);
    }
}
