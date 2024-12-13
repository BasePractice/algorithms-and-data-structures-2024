package ru.mirea.practice.s23k0145.lab2;

import java.util.LinkedList;

public class CustomHashTable {
    private static final int TABLE_SIZE = 16;
    private LinkedList<KeyValuePair>[] table;

    private static class KeyValuePair {
        String key;
        String value;

        KeyValuePair(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public void initializeTable() {
        table = new LinkedList[TABLE_SIZE];
        for (int i = 0; i < TABLE_SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int computeHash(String key) {
        return Math.abs(key.hashCode() % TABLE_SIZE);
    }

    public void insert(String key, String value) {
        int index = computeHash(key);
        for (KeyValuePair pair : table[index]) {
            if (pair.key.equals(key)) {
                pair.value = value;
                return;
            }
        }
        table[index].add(new KeyValuePair(key, value));
    }

    public String find(String key) {
        int index = computeHash(key);
        for (KeyValuePair pair : table[index]) {
            if (pair.key.equals(key)) {
                return pair.value;
            }
        }
        return null;
    }

    public void remove(String key) {
        int index = computeHash(key);
        table[index].removeIf(pair -> pair.key.equals(key));
    }

    public void displayTable() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            System.out.print("Index " + i + ": ");
            for (KeyValuePair pair : table[i]) {
                System.out.print("[" + pair.key + " -> " + pair.value + "] ");
            }
            System.out.println();
        }
    }
}
