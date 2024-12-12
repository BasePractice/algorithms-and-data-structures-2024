package ru.mirea.practice.s0000001;

import java.util.HashMap;
import java.util.Map;

public abstract class Task2 {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Smith", "John");
        map.put("Brown", "Michael");
        map.put("Taylor", "John");
        map.put("Wilson", "Anna");
        map.put("Davies", "Michael");
        map.put("Evans", "Sarah");
        map.put("Thomas", "Sarah");
        map.put("Johnson", "Anna");
        map.put("Roberts", "Michael");
        map.put("Walker", "David");
        return map;
    }

    public static int getSameFirstNameCount(Map<String, String> map) {
        Map<String, Integer> nameCounts = new HashMap<>();
        for (String name : map.values()) {
            nameCounts.put(name, nameCounts.getOrDefault(name, 0) + 1);
        }
        int count = 0;
        for (int occurrences : nameCounts.values()) {
            if (occurrences > 1) {
                count += occurrences;
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
        for (int occurrences : lastNameCounts.values()) {
            if (occurrences > 1) {
                count += occurrences;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        int sameFirstNameCount = getSameFirstNameCount(map);
        int sameLastNameCount = getSameLastNameCount(map);

        System.out.println("Same first name count: " + sameFirstNameCount);
        System.out.println("Same last name count: " + sameLastNameCount);
    }
}
