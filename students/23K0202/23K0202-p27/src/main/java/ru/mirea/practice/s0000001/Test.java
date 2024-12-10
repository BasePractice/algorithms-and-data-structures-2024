package ru.mirea.practice.s0000001;


public abstract class Test {
    public static void main(String[] args) {
        HashTab hashTab = new HashTab(10);

        hashTab.hashtabAdd("key1", "value1");
        hashTab.hashtabAdd("key2", "value2");
        hashTab.hashtabAdd("key3", "value3");
        hashTab.hashtabAdd("key4", "value4");
        hashTab.hashtabAdd("key5", "value5");
        hashTab.hashtabAdd("key6", "value6");
        hashTab.hashtabAdd("key7", "value7");
        hashTab.hashtabAdd("key8", "value8");
        hashTab.hashtabAdd("key9", "value9");
        hashTab.hashtabAdd("key10", "value10");

        System.out.println("Содержимое хеш-таблицы:");
        hashTab.printTable();

        String value = hashTab.hashtabLookup("key1");
        System.out.println("Поиск key1: " + (value != null ? value : "not found"));

        hashTab.hashtabDelete("key1");
        System.out.println("После удаления key1:");
        hashTab.printTable();

        value = hashTab.hashtabLookup("key1");
        System.out.println("Поиск key1 после удаления: " + (value != null ? value : "not found"));
    }
}
