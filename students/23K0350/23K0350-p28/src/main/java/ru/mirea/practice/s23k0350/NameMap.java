package ru.mirea.practice.s23k0350;

import java.util.HashMap;
import java.util.Map;


abstract class NameMap {
    public static Map<String, String> createMap() {
        Map<String, String> nameMap = new HashMap<>();
        nameMap.put("Иванов", "Иван");
        nameMap.put("Петров", "Петр");
        nameMap.put("Сидоров", "Иван");
        nameMap.put("Смирнов", "Алексей");
        nameMap.put("Кузнецов", "Петр");
        nameMap.put("Попов", "Сергей");
        nameMap.put("Лебедев", "Дмитрий");
        nameMap.put("Морозов", "Иван");
        nameMap.put("Соловьев", "Алексей");
        nameMap.put("Васильев", "Петр");
        return nameMap;
    }

    public static int getSameFirstNameCount(Map<String, String> nameMap) {
        Map<String, Integer> firstNameCount = new HashMap<>();

        for (String firstName : nameMap.values()) {
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

    public static int getSameLastNameCount(Map<String, String> nameMap) {
        Map<String, Integer> lastNameCount = new HashMap<>();

        for (String lastName : nameMap.keySet()) {
            lastNameCount.put(lastName, lastNameCount.getOrDefault(lastName, 0) + 1);
        }

        int count = 0;
        for (int value : lastNameCount.values()) {
            if (value > 1) {
                count += value;
            }
        }

        return count;
    }
}