package ru.mirea.practice.s23k0169.t2;

import java.util.HashMap;
import java.util.Map;

public abstract class NameMap {

    public static void main(String[] args) {
        Map<String, String> nameMap = createMap();

        int sameFirstNameCount = getSameFirstNameCount(nameMap);
        int sameLastNameCount = getSameLastNameCount(nameMap);

        System.out.println("Количество людей с одинаковыми именами: " + sameFirstNameCount);
        System.out.println("Количество людей с одинаковыми фамилиями: " + sameLastNameCount);
    }

    public static Map<String, String> createMap() {
        Map<String, String> nameMap = new HashMap<>();
        nameMap.put("Иванов", "Федор");
        nameMap.put("Алексеев", "Иван");
        nameMap.put("Сидоров", "Петр");
        nameMap.put("Свиридов", "Александр");
        nameMap.put("Смирнов", "Василий");
        nameMap.put("Назьмов", "Владимир");
        nameMap.put("Андреев", "Александр");
        nameMap.put("Зайцев", "Иван");
        nameMap.put("Кошкин", "Василий");
        nameMap.put("Морозов", "Петр");
        return nameMap;
    }

    public static int getSameFirstNameCount(Map<String, String> nameMap) {
        Map<String, Integer> firstNameCount = new HashMap<>();

        for (String firstName : nameMap.values()) {
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

    public static int getSameLastNameCount(Map<String, String> nameMap) {
        Map<String, Integer> lastNameCount = new HashMap<>();

        for (String lastName : nameMap.keySet()) {
            lastNameCount.put(lastName, lastNameCount.getOrDefault(lastName, 0) + 1);
        }

        int count = 0;
        for (int occurrences : lastNameCount.values()) {
            if (occurrences > 1) {
                count += occurrences;
            }
        }
        return count;
    }
}
