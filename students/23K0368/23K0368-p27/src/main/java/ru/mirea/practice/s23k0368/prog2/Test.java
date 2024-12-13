package ru.mirea.practice.s23k0368.prog2;


public abstract class Test {
    public static void main(String[] args) {
        HahTab hashTable = new HahTab();
        hashTable.hashtabInit(20);

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

        hashTable.printTable();

        System.out.println("Поиск элемента по ключу " + hashTable.hashtableLookup("key5"));

        System.out.println("Удаление элемента по ключу " + hashTable.hashtabDelete("key5"));

        hashTable.printTable();
    }
}
