package ru.mirea.practice.s0000001.n1;

import java.util.HashMap;
import java.util.Map;

public final class Hashtab {
    private static final int SIZE = 10;
    private static Map<Integer, String> hTable;

    private Hashtab() {
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

        hashtabAdd("ключ1", "значение1");
        hashtabAdd("ключ2", "значение2");
        hashtabAdd("ключ3", "значение3");
        hashtabAdd("ключ4", "значение4");
        hashtabAdd("ключ5", "значение5");
        hashtabAdd("ключ6", "значение6");
        hashtabAdd("ключ7", "значение7");
        hashtabAdd("ключ8", "значение8");
        hashtabAdd("ключ9", "значение9");
        hashtabAdd("ключ10", "значение10");

        System.out.println("Поиск ключа 'ключ3'..: " + hashtabLookup("ключ3"));

        hashtabDelete("ключ3");
        System.out.println("После удаления ключа 'ключ3': " + hashtabLookup("ключ3"));
    }
}
//Upd
