package ru.mirea.practice.s23k0145.lab1;

public abstract class HashTableTest {
    public static void main(String[] args) {
        CustomHashTable hashTable = new CustomHashTable();
        hashTable.initializeTable();

        hashTable.insert("apple", "fruit");
        hashTable.insert("carrot", "vegetable");
        hashTable.insert("banana", "fruit");

        System.out.println("Search for 'apple': " + hashTable.find("apple"));
        System.out.println("Search for 'carrot': " + hashTable.find("carrot"));
        System.out.println("Search for 'banana': " + hashTable.find("banana"));

        hashTable.displayTable();

        hashTable.remove("carrot");
        System.out.println("After removing 'carrot':");
        hashTable.displayTable();
    }
}
