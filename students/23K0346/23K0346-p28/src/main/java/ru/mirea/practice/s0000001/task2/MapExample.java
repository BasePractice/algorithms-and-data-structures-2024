package ru.mirea.practice.s0000001.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public abstract class MapExample {

    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Александр");
        map.put("Петрова", "Анастасия");
        map.put("Сидоров", "Александр");
        map.put("Козлов", "Александр");
        map.put("Морозов", "Александр");
        map.put("Федоров", "Михаил");
        map.put("Смирнов", "Иван");
        map.put("Новиков", "Михаил");
        map.put("Попова", "Анастасия");
        map.put("Васильев", "Алексей");
        return map;
    }

    public static int getSameFirstNameCount(Map<String, String> map) {
        Map<String, Integer> firstNameCount = new HashMap<>();
        for (String firstName : map.values()) {
            firstNameCount.put(firstName, firstNameCount.getOrDefault(firstName, 0) + 1);
        }

        int count = 0;
        for (int value : firstNameCount.values()) {
            if (value > 1) {
                count += value;
            }
        }
        return count;
    }

    public static int getSameLastNameCount(Map<String, String> map) {
        Set<String> lastNames = new HashSet<>();
        int count = 0;
        for (String lastName : map.keySet()) {
            if (lastNames.contains(lastName)) {
                count++;
            } else {
                lastNames.add(lastName);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();

        System.out.println("Количество людей с одинаковыми именами: " + getSameFirstNameCount(map));
        System.out.println("Количество людей с одинаковыми фамилиями: " + getSameLastNameCount(map));
    }
}

