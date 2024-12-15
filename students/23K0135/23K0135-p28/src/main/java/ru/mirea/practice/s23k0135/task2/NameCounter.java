package ru.mirea.practice.s23k0135.task2;

import java.util.HashMap;
import java.util.Map;

public abstract class NameCounter {

    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();

        map.put("Ivanov", "Ivan");
        map.put("Petrov", "Petr");
        map.put("Sidorov", "Ivan");
        map.put("Smirnov", "Alex");
        map.put("Kuznetsov", "Alex");
        map.put("Popov", "Igor");
        map.put("Vasiliev", "Petr");
        map.put("Mikhailov", "Ivan");
        map.put("Fedorov", "Semen");
        map.put("Novikov", "Alex");

        return map;
    }

    public static int getSameFirstNameCount(Map<String, String> map) {
        Map<String, Integer> firstNameCount = new HashMap<>();
        for (String firstName : map.values()) {
            firstNameCount.put(firstName, firstNameCount.getOrDefault(firstName, 0) + 1);
        }
        int sameFirstNameCount = 0;
        for (int count : firstNameCount.values()) {
            if (count > 1) {
                sameFirstNameCount++;
            }
        }

        return sameFirstNameCount;
    }

    public static int getSameLastNameCount(Map<String, String> map) {
        Map<String, Integer> lastNameCount = new HashMap<>();
        for (String lastName : map.keySet()) {
            lastNameCount.put(lastName, lastNameCount.getOrDefault(lastName, 0) + 1);
        }
        int sameLastNameCount = 0;
        for (int count : lastNameCount.values()) {
            if (count > 1) {
                sameLastNameCount++;
            }
        }

        return sameLastNameCount;
    }
}
