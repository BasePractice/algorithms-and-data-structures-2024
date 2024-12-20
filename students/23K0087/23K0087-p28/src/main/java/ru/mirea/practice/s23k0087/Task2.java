package ru.mirea.practice.s23k0087;

import java.util.HashMap;
import java.util.Map;

public abstract class Task2 {

    public static int countMatchingNames(Map<String, String> map) {
        Map<String, Integer> nameMap = new HashMap<>();
        for (String value : map.values()) {
            if (nameMap.containsKey(value)) {
                nameMap.put(value, nameMap.get(value) + 1);
            } else {
                nameMap.put(value, 1);
            }
        }

        int count = 0;
        int nameCount;
        for (String name : nameMap.keySet()) {
            nameCount = nameMap.get(name);
            if (nameCount > 1) {
                count += nameCount;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Кузнецов", "Алексей");
        map.put("Сидорова", "Мария");
        map.put("Петров", "Илья");
        map.put("Кузнецова", "Анна");
        map.put("Иванов", "Дмитрий");
        map.put("Петрова", "Мария");
        map.put("Коммисаров", "Алексей");
        map.put("Абсулов", "Даниил");
        map.put("Мазеллов", "Илья");
        map.put("Кирилленко", "Дмитрий");
        System.out.println("Amount of matching names: " + countMatchingNames(map));
    }
}
