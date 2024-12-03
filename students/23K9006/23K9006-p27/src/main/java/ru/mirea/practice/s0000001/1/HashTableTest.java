package ru.mirea.practice.s0000001;

abstract class HashTableTest {
    public static void main(String[] args) {
        HashTable hashtable = new HashTable();

        hashtable.hashtabAdd("one", "1");
        hashtable.hashtabAdd("two", "2");
        hashtable.hashtabAdd("three", "3");
        hashtable.hashtabAdd("four", "4");
        hashtable.hashtabAdd("five", "5");
        hashtable.hashtabAdd("six", "6");
        hashtable.hashtabAdd("seven", "7");
        hashtable.hashtabAdd("eight", "8");
        hashtable.hashtabAdd("nine", "9");
        hashtable.hashtabAdd("ten", "10");

        System.out.println("Initial dictionary:");
        for (String key : new String[]{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"}) {
            System.out.println(key + ": " + hashtable.hashtabLookup(key));
        }

        hashtable.hashtabDelete("five");
        System.out.println("\nDictionary after deleting 'five':");
        for (String key : new String[]{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"}) {
            System.out.println(key + ": " + hashtable.hashtabLookup(key));
        }

        hashtable.hashtabAdd("five", "15");
        System.out.println("\nDictionary after adding 'five' with new value:");
        for (String key : new String[]{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"}) {
            System.out.println(key + ": " + hashtable.hashtabLookup(key));
        }
    }
}
