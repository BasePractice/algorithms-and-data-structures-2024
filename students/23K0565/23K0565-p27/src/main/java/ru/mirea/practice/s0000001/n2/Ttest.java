package ru.mirea.practice.s0000001.n2;

import java.util.HashMap;
import java.util.Map;

public final class Ttest {
    private static final int SIZE = 10;
    private static Map<Integer, String> hTable;

    private Ttest() {
    }

    public static int hashtabHash(String key) {
        return Math.abs(key.hashCode() % SIZE);
    }

    public static void hashtabInit() {
        hTable = new HashMap<>();
    }

    public static void hashtabAdd(String key, String value) {
        int idx = hashtabHash(key);
        hTable.put(idx, value);
    }

    public static String hashtabLookup(String key) {
        int idx = hashtabHash(key);
        return hTable.get(idx);
    }

    public static void hashtabDelete(String key) {
        int idx = hashtabHash(key);
        hTable.remove(idx);
    }

    public static void main(String[] args) {
        hashtabInit();

        hashtabAdd("ключ1", "мангоо");
        hashtabAdd("ключ2", "манго");
        hashtabAdd("ключ3", "манго13");
        hashtabAdd("ключ4", "манго14");
        hashtabAdd("ключ5", "манго15");
        hashtabAdd("ключ6", "манго16");
        hashtabAdd("ключ7", "манго17");
        hashtabAdd("ключ8", "манго18");
        hashtabAdd("ключ9", "манго19");
        hashtabAdd("ключ10", "манго20");

        System.out.println("Словарь после добавления элементов:");
        for (Map.Entry<Integer, String> entry : hTable.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + ", Значение: " + entry.getValue());
        }
    }
}
