package ru.mirea.practice.s0000001;

import java.util.LinkedList;

public class Task3HashTable {
    private static final int SIZE = 100;
    private LinkedList<Node>[] table;

    private static class Node {
        double key;
        String value;

        Node(double key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public Task3HashTable() {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hashFunction(double key) {
        return (int) ((key * 31) % SIZE);
    }

    public void add(double key, String value) {
        int index = hashFunction(key);
        for (Node node : table[index]) {
            if (node.key == key) {
                node.value = value;
                return;
            }
        }
        table[index].add(new Node(key, value));
    }

    public String lookup(double key) {
        int index = hashFunction(key);
        for (Node node : table[index]) {
            if (node.key == key) {
                return node.value;
            }
        }
        return null;
    }

    public void delete(double key) {
        int index = hashFunction(key);
        table[index].removeIf(node -> node.key == key);
    }

    public static void main(String[] args) {
        Task3HashTable hashTable = new Task3HashTable();
        hashTable.add(3.14, "Pi");
        hashTable.add(2.71, "Euler");
        hashTable.add(1.41, "SquareRoot2");

        System.out.println("Lookup 3.14: " + hashTable.lookup(3.14));
        hashTable.delete(3.14);
        System.out.println("Lookup 3.14 after deletion: " + hashTable.lookup(3.14));
    }
}
