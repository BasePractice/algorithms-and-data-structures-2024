package ru.mirea.practice.s0000001.task1;

import java.util.LinkedList;

class SimpleHashTable {
    private LinkedList<HashEntry>[] buckets;
    private int capacity;

    private static class HashEntry {
        String identifier;
        String data;

        HashEntry(String identifier, String data) {
            this.identifier = identifier;
            this.data = data;
        }
    }

    public SimpleHashTable(int capacity) {
        this.capacity = capacity;
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int computeHash(String identifier) {
        return Math.abs(identifier.hashCode()) % capacity;
    }

    public void insert(String identifier, String data) {
        int index = computeHash(identifier);
        LinkedList<HashEntry> entries = buckets[index];

        for (HashEntry entry : entries) {
            if (entry.identifier.equals(identifier)) {
                entry.data = data;
                return;
            }
        }
        entries.add(new HashEntry(identifier, data));
    }

    public String retrieve(String identifier) {
        int index = computeHash(identifier);
        LinkedList<HashEntry> entries = buckets[index];

        for (HashEntry entry : entries) {
            if (entry.identifier.equals(identifier)) {
                return entry.data;
            }
        }
        return null;
    }

    public void remove(String identifier) {
        int index = computeHash(identifier);
        LinkedList<HashEntry> entries = buckets[index];

        entries.removeIf(entry -> entry.identifier.equals(identifier));
    }

    public void reset() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }
}