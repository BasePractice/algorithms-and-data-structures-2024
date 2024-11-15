package ru.mirea.practice.s0000001.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Arrays;

public final class Main {

    private Main() {
        throw new UnsupportedOperationException("Cannot instantiate utility class.");
    }

    public static void main(String[] args) {
        convertHashSetToTreeSet();
        Map<String, String> map = createMap();
        System.out.println("Количество людей с одинаковыми именами: " + getSameFirstNameCount(map));
        System.out.println("Количество людей с одинаковыми фамилиями: " + getSameLastNameCount(map));
        demonstrateHashTable();
    }

    public static void convertHashSetToTreeSet() {
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(10, 20, 30, 40, 50));
        TreeSet<Integer> treeSet = new TreeSet<>(hashSet);
        System.out.println("TreeSet: " + treeSet);
    }

    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Ivanov", "Ivan");
        map.put("Petrov", "Petr");
        map.put("Sidorov", "Sergey");
        map.put("Kuznetsov", "Kirill");
        map.put("Mikhailov", "Mikhail");
        map.put("Orlov", "Oleg");
        map.put("Fedorov", "Fedor");
        map.put("Semenov", "Semen");
        map.put("Vasiliev", "Vasily");
        map.put("Popov", "Pavel");
        return map;
    }

    public static int getSameFirstNameCount(Map<String, String> map) {
        Map<String, Integer> nameCount = new HashMap<>();
        for (String firstName : map.values()) {
            nameCount.put(firstName, nameCount.getOrDefault(firstName, 0) + 1);
        }
        int count = 0;
        for (int value : nameCount.values()) {
            if (value > 1) {
                count++;
            }
        }
        return count;
    }

    public static int getSameLastNameCount(Map<String, String> map) {
        Map<String, Integer> lastNameCount = new HashMap<>();
        for (String lastName : map.keySet()) {
            lastNameCount.put(lastName, lastNameCount.getOrDefault(lastName, 0) + 1);
        }
        int count = 0;
        for (int value : lastNameCount.values()) {
            if (value > 1) {
                count++;
            }
        }
        return count;
    }

    public static void demonstrateHashTable() {
        HashTable hashTable = new HashTable();
        hashTable.add(1.5, "Value1");
        hashTable.add(2.5, "Value2");
        hashTable.add(3.5, "Value3");
        System.out.println("Lookup for key 2.5: " + hashTable.lookup(2.5));
        hashTable.delete(2.5);
        System.out.println("Lookup for key 2.5 after deletion: " + hashTable.lookup(2.5));
    }
}
