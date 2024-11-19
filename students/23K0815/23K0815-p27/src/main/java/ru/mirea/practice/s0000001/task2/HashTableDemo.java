package ru.mirea.practice.s0000001.task2;

public abstract class HashTableDemo {
    public static void main(String[] args) {
        MyHashTable myHashTable = new MyHashTable(10);

        myHashTable.insert("item1", "data1");
        myHashTable.insert("item2", "data2");
        myHashTable.insert("item3", "data3");
        myHashTable.insert("item4", "data4");
        myHashTable.insert("item5", "data5");
        myHashTable.insert("item6", "data6");
        myHashTable.insert("item7", "data7");
        myHashTable.insert("item8", "data8");
        myHashTable.insert("item9", "data9");
        myHashTable.insert("item10", "data10");

        System.out.println("Output:");
        for (int i = 1; i <= 10; i++) {
            String identifier = "item" + i;
            String data = myHashTable.retrieve(identifier);
            System.out.println(identifier + ": " + data);
        }

        myHashTable.remove("item5");
        System.out.println("\nAfter removing item5:");
        for (int i = 1; i <= 10; i++) {
            String identifier = "item" + i;
            String data = myHashTable.retrieve(identifier);
            System.out.println(identifier + ": " + data);
        }
    }
}