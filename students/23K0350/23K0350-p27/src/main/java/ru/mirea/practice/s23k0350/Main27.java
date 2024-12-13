package ru.mirea.practice.s23k0350;

abstract class Main27 {
    public static void main(String[] args) {
        HashTab hashTab = new HashTab();
        hashTab.hashtabInit(10);
        hashTab.hashtabAdd("key1", "value1");
        hashTab.hashtabAdd("key2", "value2");
        System.out.println(hashTab.hashtabLookup("key1"));
        System.out.println(hashTab.hashtabLookup("key3"));
    }
}
