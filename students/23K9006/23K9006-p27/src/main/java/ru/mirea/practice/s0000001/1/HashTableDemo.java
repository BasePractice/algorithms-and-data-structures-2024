package ru.mirea.practice.s0000001;

abstract class HashTableDemo {
    public static void main(String[] args) {
        HashTable hashtable = new HashTable();

        hashtable.hashtabAdd("one", "1");
        hashtable.hashtabAdd("two", "2");
        hashtable.hashtabAdd("three", "3");
        hashtable.hashtabAdd("four", "4");
        hashtable.hashtabAdd("five", "5");

        System.out.println("Initial dictionary:");
        for (String key : new String[]{"one", "two", "three", "four", "five"}) {
            System.out.println(key + ": " + hashtable.hashtabLookup(key));
        }

        System.out.println("\nSearch for the key 'three':");
        String value = hashtable.hashtabLookup("three");
        if (value != null) {
            System.out.println("'three' found with value: " + value);
        } else {
            System.out.println("'three' not found.");
        }

        System.out.println("\nDeleting the key 'three'...");
        hashtable.hashtabDelete("three");

        System.out.println("\nDictionary after deleting 'three':");
        for (String key : new String[]{"one", "two", "three", "four", "five"}) {
            System.out.println(key + ": " + hashtable.hashtabLookup(key));
        }
    }
}
