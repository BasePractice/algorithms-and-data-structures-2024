package ru.mirea.practice.s23f0011.task2;

import java.util.HashMap;
import java.util.Map;

public abstract class NameCounter {

    // Метод для создания и возврата HashMap
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();

        // Добавляем 10 записей (фамилия, имя)
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

    // Метод для подсчета одинаковых имен
    public static int getSameFirstNameCount(Map<String, String> map) {
        Map<String, Integer> firstNameCount = new HashMap<>();

        // Подсчитываем количество одинаковых имен
        for (String firstName : map.values()) {
            firstNameCount.put(firstName, firstNameCount.getOrDefault(firstName, 0) + 1);
        }

        // Считаем, сколько имен встречаются больше одного раза
        int sameFirstNameCount = 0;
        for (int count : firstNameCount.values()) {
            if (count > 1) {
                sameFirstNameCount++;
            }
        }

        return sameFirstNameCount;
    }

    // Метод для подсчета одинаковых фамилий
    public static int getSameLastNameCount(Map<String, String> map) {
        Map<String, Integer> lastNameCount = new HashMap<>();

        // Подсчитываем количество одинаковых фамилий
        for (String lastName : map.keySet()) {
            lastNameCount.put(lastName, lastNameCount.getOrDefault(lastName, 0) + 1);
        }

        // Считаем, сколько фамилий встречаются больше одного раза
        int sameLastNameCount = 0;
        for (int count : lastNameCount.values()) {
            if (count > 1) {
                sameLastNameCount++;
            }
        }

        return sameLastNameCount;
    }
}

