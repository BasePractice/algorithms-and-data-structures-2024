package ru.mirea.practice.lab28.t3;

public abstract class Main {
    public static void main(String[] args) {
        FloatingPointHashTable<String> hashTable = new FloatingPointHashTable<>() {};
        hashTable.add(1.23, "Value1");
        hashTable.add(4.56, "Value2");
        hashTable.add(1.23, "Value3");
        System.out.println("Поиск ключа 1.23: " + hashTable.lookup(1.23));
        hashTable.delete(4.56);
        System.out.println("Поиск удаленного ключа 4.56: " + hashTable.lookup(4.56));
    }
}

