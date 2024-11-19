package ru.mirea.practice.s0000001.task1;

public abstract class Application {
    public static void main(String[] args) {
        SimpleHashTable myHashTable = new SimpleHashTable(10);
        myHashTable.insert("item1", "data1");
        myHashTable.insert("item2", "data2");
        System.out.println(myHashTable.retrieve("item1"));
        myHashTable.remove("item1");
        System.out.println(myHashTable.retrieve("item1"));
    }
}