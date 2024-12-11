package ru.mirea.practice.s23k0143;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;

public abstract class TestHash {

    public static void main(String[] args) {
        // Задание 1
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Алексей Иванов");
        hashSet.add("Сергей Петров");
        hashSet.add("Анастасия Смирнова");

        TreeSet<String> treeSet = new TreeSet<>(hashSet);
        System.out.println(treeSet);
        // Задание 2
        Map<String, String> map = createMap();
        int sameFirstNameCount = getSameFirstNameCount(map);
        int sameLastNameCount = getSameLastNameCount(map);
        System.out.println(sameFirstNameCount + " " + sameLastNameCount);
    }

    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Петров", "Петр");
        map.put("Сидоров", "Егор");
        map.put("Кузнецов", "Иван");
        map.put("Смирнов", "Алексей");
        map.put("Попов", "Петр");
        map.put("Зайцев", "Сергей");
        map.put("Морозов", "Иван");
        map.put("Федоров", "Алексей");
        map.put("Дмитриев", "Николай");
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
        Map<String, Integer> lastNameCount = new HashMap<>();
        for (String lastName : map.keySet()) {
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
