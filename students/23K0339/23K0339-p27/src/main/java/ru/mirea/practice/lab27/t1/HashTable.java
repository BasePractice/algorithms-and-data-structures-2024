package ru.mirea.practice.lab27.t1;

import java.util.LinkedList;

public abstract class HashTable<K, V> {
    private static final int INITIAL_CAPACITY = 16;
    private final LinkedList<Entry<K, V>>[] table;

    public HashTable() {
        table = new LinkedList[INITIAL_CAPACITY];
    }

    public void add(K key, V value) {
        int index = hash(key);
        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }
        for (Entry<K, V> entry : table[index]) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }
        table[index].add(new Entry<>(key, value));
    }

    public V lookup(K key) {
        int index = hash(key);
        if (table[index] != null) {
            for (Entry<K, V> entry : table[index]) {
                if (entry.getKey().equals(key)) {
                    return entry.getValue();
                }
            }
        }
        return null;
    }

    public void delete(K key) {
        int index = hash(key);
        if (table[index] != null) {
            table[index].removeIf(entry -> entry.getKey().equals(key));
        }
    }

    private int hash(K key) {
        return Math.abs(key.hashCode() % table.length);
    }
}

