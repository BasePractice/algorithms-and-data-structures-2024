package ru.mirea.practice.s00000028.task3;

import java.util.LinkedList;

public class SimpleHashTable<K extends Number, V> {
    private static final int SIZE = 16;
    private final LinkedList<Entry<K, V>>[] table;

    @SuppressWarnings("unchecked")
    public SimpleHashTable() {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    public void put(K key, V value) {
        int index = hash(key);
        for (Entry<K, V> entry : table[index]) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        table[index].add(new Entry<>(key, value));
    }

    public V get(K key) {
        int index = hash(key);
        for (Entry<K, V> entry : table[index]) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    private int hash(K key) {
        double goldenRatioConstant = 0.6180339887; // "золотое сечение" для хеш-функции
        int hash = (int) Math.floor(SIZE * (key.doubleValue() * goldenRatioConstant % 1));
        return Math.abs(hash) % SIZE;
    }

    private static class Entry<K, V> {
        private final K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        SimpleHashTable<Double, String> hashTable = new SimpleHashTable<>();

        hashTable.put(3.14, "Pi");
        hashTable.put(2.71, "Euler");
        hashTable.put(1.41, "Root2");
        hashTable.put(1.73, "Root3");
        hashTable.put(2.50, "Value");

        System.out.println("Значение для ключа 3.14: " + hashTable.get(3.14));
        System.out.println("Значение для ключа 1.73: " + hashTable.get(1.73));
        System.out.println("Значение для ключа 2.50: " + hashTable.get(2.50));
        System.out.println("Значение для несуществующего ключа 4.00: " + hashTable.get(4.00));
    }
}
