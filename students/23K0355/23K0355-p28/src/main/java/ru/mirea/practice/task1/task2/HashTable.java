package ru.mirea.practice.task1.task2;

import java.util.LinkedList;

class HashTable {
    private static final int SIZE = 100;
    private LinkedList<Entry>[] tbl;

    public HashTable() {
        tbl = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            tbl[i] = new LinkedList<>();
        }
    }

    private static class Entry {
        double key;
        String value;

        Entry(double key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private int hash(double key) {
        long res = (long) ((key * 2654435761L) % Integer.MAX_VALUE);
        return (int) (res % SIZE);
    }

    public void put(double key, String value) {
        int idx = hash(key);
        LinkedList<Entry> bucket = tbl[idx];
        for (Entry e : bucket) {
            if (e.key == key) {
                e.value = value;
                return;
            }
        }
        bucket.add(new Entry(key, value));
    }

    public String get(double key) {
        int idx = hash(key);
        LinkedList<Entry> bucket = tbl[idx];
        for (Entry e : bucket) {
            if (e.key == key) {
                return e.value;
            }
        }
        return null;
    }

    public void remove(double key) {
        int idx = hash(key);
        LinkedList<Entry> bucket = tbl[idx];
        bucket.removeIf(e -> e.key == key);
    }

    public boolean contains(double key) {
        return get(key) != null;
    }

    public void printTable() {
        for (int i = 0; i < SIZE; i++) {
            if (!tbl[i].isEmpty()) {
                for (Entry e : tbl[i]) {
                    System.out.println("Индекс " + i + ": Ключ = " + e.key + ", Значение = " + e.value);
                }
            }
        }
    }

    public static void main(String[] args) {
        HashTable ht = new HashTable();

        ht.put(3.14, "Pi");
        ht.put(2.71, "e");
        ht.put(1.41, "sqrt(2)");

        ht.printTable();

        System.out.println("Значение для 3.14: " + ht.get(3.14));
        System.out.println("Значение для 2.71: " + ht.get(2.71));

        ht.remove(2.71);
        System.out.println("После удаления 2.71, значение: " + ht.get(2.71));
    }
}
