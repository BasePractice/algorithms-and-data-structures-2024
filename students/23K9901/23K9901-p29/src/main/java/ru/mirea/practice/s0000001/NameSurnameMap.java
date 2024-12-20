package ru.mirea.practice.s0000001;

import java.util.HashMap;
import java.util.Map;

abstract class NameSurnameMap {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Ivanov", "Ivan");
        map.put("Petrov", "Petr");
        map.put("Sidorov", "Ivan");
        map.put("Kuznetsov", "Alex");
        map.put("Smirnov", "Petr");
        map.put("Popov", "Alex");
        map.put("Sokolov", "Vladimir");
        map.put("Morozov", "Ivan");
        map.put("Orlov", "Pavel");
        map.put("Volkov", "Alex");
        return map;
    }

    public static int getSameFirstNameCount(Map<String, String> map) {
        Map<String, Integer> nameCounts = new HashMap<>();
        for (String name : map.values()) {
            nameCounts.put(name, nameCounts.getOrDefault(name, 0) + 1);
        }
        int count = 0;
        for (int value : nameCounts.values()) {
            if (value > 1) {
                count++;
            }
        }
        return count;
    }

    public static int getSameLastNameCount(Map<String, String> map) {
        Map<String, Integer> lastNameCounts = new HashMap<>();
        for (String lastName : map.keySet()) {
            lastNameCounts.put(lastName, lastNameCounts.getOrDefault(lastName, 0) + 1);
        }
        int count = 0;
        for (int value : lastNameCounts.values()) {
            if (value > 1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        System.out.println("Number of duplicate first names: " + getSameFirstNameCount(map));
        System.out.println("Number of duplicate last names: " + getSameLastNameCount(map));
    }
}
