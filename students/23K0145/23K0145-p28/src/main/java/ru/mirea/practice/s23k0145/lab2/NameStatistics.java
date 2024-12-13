package ru.mirea.practice.s23k0145.lab2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class NameStatistics {

    private NameStatistics() {}

    public static Map<String, String> createPeopleMap() {
        Map<String, String> peopleMap = new HashMap<>();
        peopleMap.put("Иванов", "Александр");
        peopleMap.put("Петрова", "Анастасия");
        peopleMap.put("Сидоров", "Александр");
        peopleMap.put("Козлов", "Александр");
        peopleMap.put("Морозов", "Александр");
        peopleMap.put("Федоров", "Михаил");
        peopleMap.put("Смирнов", "Иван");
        peopleMap.put("Новиков", "Михаил");
        peopleMap.put("Попова", "Анастасия");
        peopleMap.put("Васильев", "Алексей");
        return peopleMap;
    }

    public static int countPeopleWithSameFirstName(Map<String, String> peopleMap) {
        Map<String, Integer> firstNameFrequency = new HashMap<>();
        for (String firstName : peopleMap.values()) {
            firstNameFrequency.put(firstName, firstNameFrequency.getOrDefault(firstName, 0) + 1);
        }

        int duplicateFirstNamesCount = 0;
        for (int frequency : firstNameFrequency.values()) {
            if (frequency > 1) {
                duplicateFirstNamesCount += frequency;
            }
        }
        return duplicateFirstNamesCount;
    }

    public static int countPeopleWithSameLastName(Map<String, String> peopleMap) {
        Set<String> lastNameSet = new HashSet<>();
        int duplicateLastNamesCount = 0;
        for (String lastName : peopleMap.keySet()) {
            if (lastNameSet.contains(lastName)) {
                duplicateLastNamesCount++;
            } else {
                lastNameSet.add(lastName);
            }
        }
        return duplicateLastNamesCount;
    }

    public static void main(String[] args) {
        Map<String, String> peopleMap = createPeopleMap();

        int sameFirstNameCount = countPeopleWithSameFirstName(peopleMap);
        int sameLastNameCount = countPeopleWithSameLastName(peopleMap);

        System.out.println("Количество людей с одинаковыми именами: " + sameFirstNameCount);
        System.out.println("Количество людей с одинаковыми фамилиями: " + sameLastNameCount);
    }
}
