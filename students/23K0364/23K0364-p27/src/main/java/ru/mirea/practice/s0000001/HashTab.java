package ru.mirea.practice.s0000001;

import java.util.LinkedList;

public class HashTab {
    private static final int SIZE = 100;
    private LinkedList<Node>[] table;

    private static class Node {
        String key;
        String value;

        Node(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public void hashtabInit() {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hashtabHash(String key) {
        return Math.abs(key.hashCode() % SIZE);
    }

    public void hashtabAdd(String key, String value) {
        int index = hashtabHash(key);
        for (Node node : table[index]) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }
        table[index].add(new Node(key, value));
    }

    public String hashtabLookup(String key) {
        int index = hashtabHash(key);
        for (Node node : table[index]) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null;
    }

    public void hashtabDelete(String key) {
        int index = hashtabHash(key);
        table[index].removeIf(node -> node.key.equals(key));
    }
}
