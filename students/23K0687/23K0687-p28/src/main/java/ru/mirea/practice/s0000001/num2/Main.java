package ru.mirea.practice.s0000001.num2;

import java.util.HashMap;
import java.util.Map;

public final class Main {

    private Main() {
        // Приватный конструктор, чтобы не позволить создавать экземпляры класса
    }

    public static void main(String[] args) {
        Map<String, String> m = createMap();
        System.out.println(getSameFirstNameCount(m));
        System.out.println(getSameLastNameCount(m));
    }

    public static Map<String, String> createMap() {
        Map<String, String> m = new HashMap<>();
        m.put("Иванов", "Алексей");
        m.put("Петров", "Иван");
        m.put("Смирнов", "Алексей");
        m.put("Кузнецов", "Петр");
        m.put("Васильев", "Алексей");
        m.put("Михайлов", "Дмитрий");
        m.put("Новиков", "Иван");
        m.put("Фёдоров", "Игорь");
        m.put("Егоров", "Дмитрий");
        m.put("Сидоров", "Иван");
        return m;
    }

    public static int getSameFirstNameCount(Map<String, String> m) {
        Map<String, Integer> c = new HashMap<>();
        for (String n : m.values()) {
            c.put(n, c.getOrDefault(n, 0) + 1);
        }
        int cnt = 0;
        for (int v : c.values()) {
            if (v > 1) {
                cnt++;
            }
        }
        return cnt;
    }

    public static int getSameLastNameCount(Map<String, String> m) {
        Map<String, Integer> c = new HashMap<>();
        for (String ln : m.keySet()) {
            c.put(ln, c.getOrDefault(ln, 0) + 1);
        }
        int cnt = 0;
        for (int v : c.values()) {
            if (v > 1) {
                cnt++;
            }
        }
        return cnt;
    }
}
