package ru.mirea.practice.s23k0143;

public abstract class TestHashTable {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);

        hashTable.add("key1", "value1");
        hashTable.add("key2", "value2");
        hashTable.add("key3", "value3");
        hashTable.add("key4", "value4");
        hashTable.add("key5", "value5");
        hashTable.add("key6", "value6");
        hashTable.add("key7", "value7");
        hashTable.add("key8", "value8");
        hashTable.add("key9", "value9");
        hashTable.add("key10", "value10");

        System.out.println("Содержимое хеш-таблицы:");
        hashTable.printTable();

        String value = hashTable.lookup("key5");
        System.out.println("Поиск key5: " + (value != null ? value : "not found"));

        hashTable.delete("key5");
        System.out.println("После удаления key5:");
        hashTable.printTable();

        value = hashTable.lookup("key5");
        System.out.println("Поиск key5 после удаления: " + (value != null ? value : "not found"));
    }
}
