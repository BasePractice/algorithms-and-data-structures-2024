package ru.mirea.practice.s23k0368.prog2;

public class Node implements Comparable<Node> {
    char name;
    float frequency;
    Node left;
    Node right;

    public Node(char name, float frequency) {
        this.name = name;
        this.frequency = frequency;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public float getFrequency() {
        return frequency;
    }

    public void setFrequency(float frequency) {
        this.frequency = frequency;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public int compareTo(Node other) {
        return (int) (this.frequency - other.frequency);
    }
}
