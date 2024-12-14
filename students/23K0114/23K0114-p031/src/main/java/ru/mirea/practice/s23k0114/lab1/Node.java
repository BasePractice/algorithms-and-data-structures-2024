package ru.mirea.practice.s23k0114.lab1;


import java.util.ArrayList;
import java.util.List;

public class Node {
    List<Processor> keys;
    List<Node> children;
    boolean isLeaf;

    public Node(boolean isLeaf) {
        keys = new ArrayList<>();
        children = new ArrayList<>();
        this.isLeaf = isLeaf;
    }
}
