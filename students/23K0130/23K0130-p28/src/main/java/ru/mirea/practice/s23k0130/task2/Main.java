package ru.mirea.practice.s23k0130.task2;

import java.util.HashMap;
import java.util.Map;

public abstract class Main {

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        int sameFirstNameCount = getSameFirstNameCount(map);
        int sameLastNameCount = getSameLastNameCount(map);
        System.out.println(sameFirstNameCount + " " + sameLastNameCount);
    }

    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Чернов", "Григорий");
        map.put("Чернушкин", "Игорь");
        map.put("Черный", "Себастиан");
        map.put("Чернышенко", "Матвей");
        map.put("Белый", "Николай");
        map.put("Белов", "Петр");
        map.put("Белозеров", "Сергей");
        map.put("Серов", "Иван");
        map.put("Сырный", "Алексей");
        map.put("Серый", "Сергей");
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