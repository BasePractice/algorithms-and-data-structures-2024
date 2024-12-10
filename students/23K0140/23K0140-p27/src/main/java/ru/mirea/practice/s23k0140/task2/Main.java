package ru.mirea.practice.s23k0140.task2;

public abstract class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);

        hashTable.hashtabAdd("key1", "value1");
        hashTable.hashtabAdd("key2", "value2");
        hashTable.hashtabAdd("key3", "value3");
        hashTable.hashtabAdd("key4", "value4");
        hashTable.hashtabAdd("key5", "value5");
        hashTable.hashtabAdd("key6", "value6");
        hashTable.hashtabAdd("key7", "value7");
        hashTable.hashtabAdd("key8", "value8");
        hashTable.hashtabAdd("key9", "value9");
        hashTable.hashtabAdd("key10", "value10");

        System.out.println("Вывод:");
        for (int i = 1; i <= 10; i++) {
            String key = "key" + i;
            String value = hashTable.hashtabLookup(key);
            System.out.println(key + ": " + value);
        }

        hashTable.hashtabDelete("key6");
        System.out.println("\nПосле удаления key6:");
        for (int i = 1; i <= 10; i++) {
            String key = "key" + i;
            String value = hashTable.hashtabLookup(key);
            System.out.println(key + ": " + value);
        }
    }
}