package ru.mirea.practice.s30k0112;

import java.util.List;
import java.util.ArrayList;

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
