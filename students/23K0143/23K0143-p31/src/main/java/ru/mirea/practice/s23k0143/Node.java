package ru.mirea.practice.s23k0143;

import java.util.ArrayList;
import java.util.List;

public class Node {
    List<ProcessorRecord> records;
    List<Node> children;
    boolean isLeaf;

    public Node() {
        records = new ArrayList<>();
        children = new ArrayList<>();
        isLeaf = true;
    }
}
