package ru.mirea.practice.s23k0368.prog3;

import java.util.ArrayList;
import java.util.List;

public class Table<V> {
    private static final int defoultCapacity = 17;
    private static final double defoultLoad = 0.75;
    private static final double multiplier = 1000000;

    private int capacity;
    private int size;
    private double load;
    private List<Entry<V>>[] table;

    public Table() {
        this(defoultCapacity, defoultLoad);
    }

    public Table(int capacity, double load) {
        this.capacity = capacity;
        this.load = load;
        this.table = (ArrayList<Entry<V>>[]) new ArrayList[capacity];
    }

    private int hash(double key) {
        int iKey = (int) (key * multiplier);
        return Math.abs(iKey % capacity);
    }

    public void put(double key, V value) {
        int index = hash(key);
        if (table[index] == null) {
            table[index] = new ArrayList<>();
        }
        table[index].add(new Entry<>(key, value));
        size++;

        if ((double) size / capacity >= load) {
            resize();
        }
    }

    public V get(double key) {
        int index = hash(key);
        if (table[index] != null) {
            for (Entry<V> entry : table[index]) {
                if (entry.key == key) {
                    return entry.value;
                }
            }
        }
        return null;
    }

    private void resize() {
        int newCapacity = capacity * 2 + 1;
        @SuppressWarnings("unchecked")
        List<Entry<V>>[] newTable = (List<Entry<V>>[]) new ArrayList[newCapacity];
        for (List<Entry<V>> list : table) {
            if (list != null) {
                for (Entry<V> entry : list) {
                    int index = hash(entry.key);
                    if (newTable[index] == null) {
                        newTable[index] = new ArrayList<>();
                    }
                    newTable[index].add(entry);
                }
            }
        }
        table = newTable;
        capacity = newCapacity;
    }
}
