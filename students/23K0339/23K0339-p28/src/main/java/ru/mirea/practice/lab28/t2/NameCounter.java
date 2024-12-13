package ru.mirea.practice.lab28.t2;

import java.util.HashMap;
import java.util.Map;

public abstract class NameCounter {

    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Петров", "Пётр");
        map.put("Сидоров", "Иван");
        map.put("Кузнецов", "Николай");
        map.put("Смирнов", "Пётр");
        map.put("Попов", "Иван");
        map.put("Лебедев", "Алексей");
        map.put("Соболев", "Алексей");
        map.put("Волков", "Иван");
        map.put("Зайцев", "Сергей");
        return map;
    }

    public static int getSameFirstNameCount(Map<String, String> map) {
        Map<String, Integer> nameCounts = new HashMap<>();
        for (String name : map.values()) {
            nameCounts.put(name, nameCounts.getOrDefault(name, 0) + 1);
        }
        return (int) nameCounts.values().stream().filter(count -> count > 1).count();
    }

    public static int getSameLastNameCount(Map<String, String> map) {
        return 0;
    }
}
