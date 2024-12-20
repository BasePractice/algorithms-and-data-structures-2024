package ru.mirea.practice.s23k0755.task1;

import java.util.LinkedList;

public class HashTab {
    private static class KeyValue {
        private String key;
        private String value;

        KeyValue(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<KeyValue>[] linkedLists;
    private int size;

    public HashTab(int size) {
        this.size = size;
        linkedLists = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            linkedLists[i] = new LinkedList<>();
        }
    }

    public int hash(String key) {
        return key.hashCode() % size;
    }

    public void add(String key, String value) {
        int ind = hash(key);
        for (KeyValue keyValue : linkedLists[ind]) {
            if (keyValue.key.equals(key)) {
                keyValue.value = value;
            }
        }
        linkedLists[ind].add(new KeyValue(key, value));
    }

    public String lookUp(String key) {
        int ind = hash(key);
        for (KeyValue keyValue : linkedLists[ind]) {
            if (keyValue.key.equals(key)) {
                return keyValue.value;
            }
        }
        return null;
    }

    public void delete(String key) {
        int ind = hash(key);
        linkedLists[ind].removeIf(keyValue -> keyValue.key.equals(key));
    }

    public void getInfHashTab() {
        for (int ind = 0; ind < size; ind++) {
            if (!linkedLists[ind].isEmpty()) {
                for (KeyValue keyValue : linkedLists[ind]) {
                    System.out.println("Key: " + keyValue.key + " Value: " + keyValue.value);
                }
            }
        }
    }
}
