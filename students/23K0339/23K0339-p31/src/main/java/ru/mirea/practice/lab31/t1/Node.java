package ru.mirea.practice.lab31.t1;

import java.util.ArrayList;
import java.util.List;


public class Node {
    boolean isLeaf;
    List<Integer> key = new ArrayList<>();
    List<Node> child = new ArrayList<>();

    public Node(boolean isLeaf) {
        this.isLeaf = isLeaf;
    }
}


