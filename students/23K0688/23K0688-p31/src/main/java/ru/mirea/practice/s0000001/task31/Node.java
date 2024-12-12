package ru.mirea.practice.s0000001.task31;

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
