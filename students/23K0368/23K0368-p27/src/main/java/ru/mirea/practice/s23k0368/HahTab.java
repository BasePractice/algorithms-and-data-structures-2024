package ru.mirea.practice.s23k0368;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class HahTab {
    private List<LinkedList<Node>> table;
    private int capacity;

    private int hashtabHash(String key) {
        return Math.abs(key.hashCode() % capacity);
    }

    public void hashtabInit(int capacity) {
        this.capacity = capacity;

        table = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            table.add(new LinkedList<>());
        }
    }

    public void hashtabAdd(String key, String value) {
        int hash = hashtabHash(key);
        LinkedList<Node> bucket = table.get(hash);
        for (Node node : bucket) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }
        bucket.add(new Node(key, value));
    }

    public String hashtableLookup(String key) {
        int hash = hashtabHash(key);
        LinkedList<Node> bucket = table.get(hash);
        for (Node node : bucket) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null;
    }

    public boolean hashtabDelete(String key) {
        int hash = hashtabHash(key);
        LinkedList<Node> bucket = table.get(hash);
        for (Node node : bucket) {
            if (node.key.equals(key)) {
                bucket.remove(node);
                return true;
            }
        }
        return false;
    }

    public void printTable() {
        for (int i = 0; i < capacity; i++) {
            System.out.println(i + ": ");
            for (Node node : table.get(i)) {
                System.out.println("(" + node.key + ", " + node.value + ") ");
            }
            System.out.println();
        }
    }
}
