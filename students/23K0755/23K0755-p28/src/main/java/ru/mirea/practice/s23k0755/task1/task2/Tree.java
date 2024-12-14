package ru.mirea.practice.s23k0755.task1.task2;

import java.util.HashMap;
import java.util.Map;


abstract class Tree {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Лесков", "Вадим");
        map.put("Пушкин", "Александр");
        map.put("Михайлов", "Сергей");
        map.put("Сергеев", "Миихаиил");
        map.put("Мирозов", "Дмитрий");
        map.put("Чехов", "Антон");
        map.put("Тергенев", "Иван");
        map.put("Толстой", "Лев");
        map.put("Толстой", "Алексей");
        return map;
    }

    public static int counterFirtsName(Map<String, String> map) {
        Map<String, Integer> nameCounter = new HashMap<>();
        for (String name : map.values()) {
            nameCounter.put(name, nameCounter.getOrDefault(name, 0) + 1);
        }
        int counter = 0;
        for (int value : nameCounter.values()) {
            if (value > 1) {
                counter += value;
            }
        }
        return counter;
    }

    public static int counterLastName(Map<String, String> map) {
        Map<String, Integer> lastNameCount = new HashMap<>();
        for (String lastName : map.keySet()) {
            lastNameCount.put(lastName, lastNameCount.getOrDefault(lastName, 0) + 1);
        }
        int counter = 0;
        for (int value : lastNameCount.values()) {
            if (value > 1) {
                counter += value;
            }
        }
        return counter;
    }

}
