package ru.mirea.practice.s30k0112;

import java.util.LinkedList;

class HashTab {
    private static class KeyValue {
        String key;
        String value;

        KeyValue(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<KeyValue>[] table;
    private int size;

    @SuppressWarnings("unchecked")
    public HashTab(int size) {
        this.size = size;
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hashtabHash(String key) {
        return Math.abs(key.hashCode() % size);
    }

    public void hashtabAdd(String key, String value) {
        int index = hashtabHash(key);
        for (KeyValue kv : table[index]) {
            if (kv.key.equals(key)) {
                kv.value = value;
                return;
            }
        }
        table[index].add(new KeyValue(key, value));
    }

    public String hashtabLookup(String key) {
        int index = hashtabHash(key);
        for (KeyValue kv : table[index]) {
            if (kv.key.equals(key)) {
                return kv.value;
            }
        }
        return null; // Если ключ не найден
    }

    public void hashtabDelete(String key) {
        int index = hashtabHash(key);
        table[index].removeIf(kv -> kv.key.equals(key));
    }

    public void printTable() {
        for (int i = 0; i < size; i++) {
            if (!table[i].isEmpty()) {
                System.out.print("Bucket " + i + ": ");
                for (KeyValue kv : table[i]) {
                    System.out.print("[" + kv.key + ": " + kv.value + "] ");
                }
                System.out.println();
            }
        }
    }
}
