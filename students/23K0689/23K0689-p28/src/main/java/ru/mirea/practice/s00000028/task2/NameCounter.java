package ru.mirea.practice.s00000028.task2;

import java.util.HashMap;
import java.util.Map;

public final class NameCounter {

    // Приватный конструктор для предотвращения создания экземпляра
    private NameCounter() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        Map<String, String> nameMap = createMap();

        int sameNameCount = getSameNameCount(nameMap);
        int sameLastNameCount = getSameLastNameCount(nameMap);

        System.out.println("Одинаковые имена: " + sameNameCount);
        System.out.println("Одинаковые фамилии: " + sameLastNameCount);
    }

    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Борщев", "Агафон");
        map.put("Луговой", "Фрол");
        map.put("Шапошников", "Аркадий");
        map.put("Каланчев", "Агафон");
        map.put("Горшков", "Игнат");
        map.put("Задорожный", "Фрол");
        map.put("Чернышев", "Аркадий");
        map.put("Мерзляков", "Игнат");
        map.put("Парамонов", "Артемий");
        map.put("Тетерин", "Гордей");
        return map;
    }

    public static int getSameNameCount(Map<String, String> map) {
        Map<String, Integer> nameCount = new HashMap<>();
        for (String name : map.values()) {
            nameCount.put(name, nameCount.getOrDefault(name, 0) + 1);
        }
        int count = 0;
        for (int frequency : nameCount.values()) {
            if (frequency > 1) {
                count += frequency;
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
        for (int frequency : lastNameCount.values()) {
            if (frequency > 1) {
                count += frequency;
            }
        }
        return count;
    }
}
