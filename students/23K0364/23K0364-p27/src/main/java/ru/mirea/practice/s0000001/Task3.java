package ru.mirea.practice.s0000001;

public abstract class Task3 {
    public static void main(String[] args) {
        HashTab hashTab = new HashTab();
        hashTab.hashtabInit();

        for (int i = 1; i <= 10; i++) {
            hashTab.hashtabAdd("key" + i, "value" + i);
        }

        System.out.println("Searching for key5: " + hashTab.hashtabLookup("key5"));
        hashTab.hashtabDelete("key5");
        System.out.println("Searching for key5 after deletion: " + hashTab.hashtabLookup("key5"));
    }
}
