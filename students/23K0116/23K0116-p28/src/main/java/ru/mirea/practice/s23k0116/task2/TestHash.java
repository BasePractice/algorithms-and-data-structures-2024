package ru.mirea.practice.s23k0116.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class TestHash {

    public static void main(String[] args) {
        List<Map.Entry<String, String>> map = createMap();
        int sameFirstNameCount = getSameFirstNameCount(map);
        int sameLastNameCount = getSameLastNameCount(map);

        System.out.println(sameFirstNameCount);
        System.out.println(sameLastNameCount);
    }

    public static List<Map.Entry<String, String>> createMap() {
        List<Map.Entry<String, String>> map = new ArrayList<>();
        map.add(Map.entry("Иванов", "Иван"));
        map.add(Map.entry("Печкин", "Егор"));
        map.add(Map.entry("Петров", "Иван"));
        map.add(Map.entry("Иванов", "Егор"));

        return map;
    }

    public static int getSameFirstNameCount(List<Map.Entry<String, String>> map) {
        Map<String, Integer> firstNameCount = new HashMap<>();

        // Подсчет частоты каждого имени
        for (Map.Entry<String, String> entry : map) {
            String firstName = entry.getValue();
            firstNameCount.put(firstName, firstNameCount.getOrDefault(firstName, 0) + 1);
        }

        // Подсчет количества имен, которые встречаются более одного раза
        int count = 0;
        for (int value : firstNameCount.values()) {
            if (value > 1) {
                count++;
            }
        }
        return count;
    }

    public static int getSameLastNameCount(List<Map.Entry<String, String>> map) {
        Map<String, Integer> lastNameCount = new HashMap<>();

        // Подсчет частоты каждой фамилии
        for (Map.Entry<String, String> entry : map) {
            String lastName = entry.getKey();
            lastNameCount.put(lastName, lastNameCount.getOrDefault(lastName, 0) + 1);
        }

        // Подсчет количества фамилий, которые встречаются более одного раза
        int count = 0;
        for (int value : lastNameCount.values()) {
            if (value > 1) {
                count++;
            }
        }
        return count;
    }
}
