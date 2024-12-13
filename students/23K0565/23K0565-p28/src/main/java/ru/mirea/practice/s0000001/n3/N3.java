package ru.mirea.practice.s0000001.n3;

import java.util.HashMap;
import java.util.Map;

public final class N3 {
    private static final int TABLE_SIZE = 10;
    private static Map<Integer, String> hTable;

    private N3() {
    }

    public static int hash(double key) {
        return (int) (TABLE_SIZE * (key - Math.floor(key)));
    }

    public static void initTable() {
        hTable = new HashMap<>();
    }

    public static void insertTable(double key, String value) {
        int idx = hash(key);
        hTable.put(idx, value);
    }

    public static String lookup(double key) {
        int idx = hash(key);
        return hTable.get(idx);
    }

    public static void deleteFromTable(double key) {
        int idx = hash(key);
        hTable.remove(idx);
    }

    public static void main(String[] args) {
        initTable();

        insertTable(3.1415, "Pi");
        insertTable(2.7182, "Euler");
        insertTable(1.6180, "Golden Ratio");
        insertTable(0.5772, "Euler-Mascheroni");
        insertTable(6.6260, "Planck");

        System.out.println(lookup(3.1415));
        System.out.println(lookup(2.7182));

        deleteFromTable(2.7182);

        System.out.println(lookup(2.7182));
    }
}
