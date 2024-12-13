package ru.mirea.practice.s23k0623;

public class Node {
    Processor[] procs;
    Node[] nodes;
    int cnt;

    public Node() {
        procs = new Processor[10];
        nodes = new Node[10];
        cnt = 0;
    }
}
