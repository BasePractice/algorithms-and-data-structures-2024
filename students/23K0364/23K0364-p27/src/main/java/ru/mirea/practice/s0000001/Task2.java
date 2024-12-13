package ru.mirea.practice.s0000001;

public abstract class Task2 {
    public static void main(String[] args) {
        HashTab hashTab = new HashTab();
        hashTab.hashtabInit();

        for (int i = 1; i <= 10; i++) {
            hashTab.hashtabAdd("key" + i, "value" + i);
        }

        for (int i = 1; i <= 10; i++) {
            String key = "key" + i;
            System.out.println("Key: " + key + ", Value: " + hashTab.hashtabLookup(key));
        }
    }
}
