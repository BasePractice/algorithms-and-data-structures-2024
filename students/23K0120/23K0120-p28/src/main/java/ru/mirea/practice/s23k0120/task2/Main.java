package ru.mirea.practice.s23k0120.task2;


import java.util.HashMap;
import java.util.Map;

public abstract class Main {

    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Кузнецов", "Алексей");
        map.put("Сидорова", "Мария");
        map.put("Петров", "Иван");
        map.put("Кузнецова", "Анна");
        map.put("Иванов", "Дмитрий");
        map.put("Петрова", "Мария");
        map.put("Смирнов", "Алексей");
        map.put("Иванова", "Елена");
        map.put("Смирнов", "Иван");
        map.put("Иванова", "Мария");
        return map;
    }

    public static int getSameFirstNameCount(Map<String, String> map) {
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

    public static int getSameLastNameCount(Map<String, String> map) {
        return 0;
        // Данный по условию тип данных Map не позволяет
        // содержать ключи с одинаковыми значениями
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        System.out.println(getSameFirstNameCount(map));
        System.out.println(getSameLastNameCount(map));
    }
}
