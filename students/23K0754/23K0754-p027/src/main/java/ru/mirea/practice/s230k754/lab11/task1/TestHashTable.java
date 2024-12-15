package ru.mirea.practice.s230k754.lab11.task1;

import org.jetbrains.annotations.NotNull;

public final class TestHashTable {
    private TestHashTable() {}

    public static void main(final String[] args) {
        var hashTable = getHashTable();

        // Проверка
        for (int i = 1; i <= 10; i++) {
            String key = "" + i;
            System.out.println(key + " : " + hashTable.hashtabLookup(key));
        }

        hashTable.hashtabDelete("10");

        System.out.println("Значение 10: " + hashTable.hashtabLookup("10"));

        System.out.println("Размер таблицы: " + hashTable.size());
    }

    private static @NotNull HashTab getHashTable() {
        var hashTable = new HashTab();

        hashTable.hashtabInit(5);
        hashTable.hashtabAdd("1", "Value_1");
        hashTable.hashtabAdd("2", "Value_2");
        hashTable.hashtabAdd("3", "Value_3");
        hashTable.hashtabAdd("4", "Value_4");
        hashTable.hashtabAdd("5", "Value_5");
        hashTable.hashtabAdd("6", "Value_5");
        hashTable.hashtabAdd("7", "Value_5");
        hashTable.hashtabAdd("8", "Value_5");
        hashTable.hashtabAdd("9", "Value_5");
        hashTable.hashtabAdd("10", "Value_5");
        return hashTable;
    }
}
