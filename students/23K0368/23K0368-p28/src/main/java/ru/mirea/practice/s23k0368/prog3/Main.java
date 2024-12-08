package ru.mirea.practice.s23k0368.prog3;

public abstract class Main {
    public static void main(String[] args) {
        Table<String> hashTable = new Table<>();
        hashTable.put(3.14159, "pi");
        hashTable.put(2.71828, "e");
        hashTable.put(1.60217, "q");
        System.out.println(hashTable.get(3.14159));
        System.out.println(hashTable.get(2.7));
        System.out.println(hashTable.get(1.6));
    }
}
