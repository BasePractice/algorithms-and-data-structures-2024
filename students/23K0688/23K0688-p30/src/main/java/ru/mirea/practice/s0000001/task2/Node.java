package ru.mirea.practice.s0000001.task2;

public class Node implements Comparable<Node> {
    int freq;
    char chara;
    Node left;
    Node right;

    public Node(char chara, int freq) {
        this.chara = chara;
        this.freq = freq;
        this.left = null;
        this.right = null;
    }

    @Override
    public int compareTo(Node node) {
        return Integer.compare(this.freq, node.freq);
    }
}
