package ru.mirea.practice.s23k0215.task1;



public abstract class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);
        hashTable.hashtabAdd("key1", "value1");
        hashTable.hashtabAdd("key2", "value2");
        System.out.println(hashTable.hashtabLookup("key1"));
        hashTable.hashtabDelete("key1");
        System.out.println(hashTable.hashtabLookup("key1"));
    }
}

