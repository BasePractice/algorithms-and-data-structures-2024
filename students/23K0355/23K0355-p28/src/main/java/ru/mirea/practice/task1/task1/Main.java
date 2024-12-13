package ru.mirea.practice.task1.task1;

import java.util.HashMap;
import java.util.Map;

public final class Main {
    private Main() {
        throw new UnsupportedOperationException("Этот класс не должен быть создан.");
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        System.out.println("Количество людей с одинаковыми именами: " + getSameFirstNameCount(map));
        System.out.println("Количество людей с одинаковыми фамилиями: " + getSameLastNameCount(map));
    }

    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Артемов", "Артем");
        map.put("Павлов", "Павел");
        map.put("Макаров", "Максим");
        map.put("Кузнецов", "Петр");
        map.put("Иванов", "Иван");
        map.put("Киселев", "Илья");
        map.put("Захаров", "Сергей");
        map.put("Петров", "Петр");
        map.put("Николаев", "Сергей");
        map.put("Попов", "Иван");
        return map;
    }

    public static int getSameFirstNameCount(Map<String, String> map) {
        Map<String, Integer> firstNameCount = new HashMap<>();
        for (String firstName : map.values()) {
            firstNameCount.put(firstName, firstNameCount.getOrDefault(firstName, 0) + 1);
        }

        int count = 0;
        for (int occurrences : firstNameCount.values()) {
            if (occurrences > 1) {
                count += occurrences;
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
        for (int occurrences : lastNameCount.values()) {
            if (occurrences > 1) {
                count += occurrences - 1;
            }
        }

        return count;
    }
}
