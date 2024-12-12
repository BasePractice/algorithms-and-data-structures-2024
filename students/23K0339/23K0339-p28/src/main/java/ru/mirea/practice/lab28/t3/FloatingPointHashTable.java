package ru.mirea.practice.lab28.t3;

import java.util.LinkedList;

public abstract class FloatingPointHashTable<V> {
    private static final int CAPACITY = 16;
    private final LinkedList<Entry<V>>[] table;

    public static final class Entry<V> {
        private final double key;
        private V value;

        public Entry(double key, V value) {
            this.key = key;
            this.value = value;
        }

        public double getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

    public FloatingPointHashTable() {
        table = new LinkedList[CAPACITY];
    }

    private int hash(double key) {
        double fractionalPart = key - Math.floor(key);
        int intKey = (int) Math.floor(CAPACITY * fractionalPart);
        return Math.abs(intKey % CAPACITY);
    }

    public void add(double key, V value) {
        int index = hash(key);
        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }
        for (Entry<V> entry : table[index]) {
            if (Double.compare(entry.getKey(), key) == 0) {
                entry.setValue(value);
                return;
            }
        }
        table[index].add(new Entry<>(key, value));
    }

    public V lookup(double key) {
        int index = hash(key);
        if (table[index] != null) {
            for (Entry<V> entry : table[index]) {
                if (Double.compare(entry.getKey(), key) == 0) {
                    return entry.getValue();
                }
            }
        }
        return null;
    }

    public void delete(double key) {
        int index = hash(key);
        if (table[index] != null) {
            table[index].removeIf(entry -> Double.compare(entry.getKey(), key) == 0);
        }
    }
}
