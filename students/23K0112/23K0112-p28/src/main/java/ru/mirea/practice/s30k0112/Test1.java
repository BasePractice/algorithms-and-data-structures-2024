package ru.mirea.practice.s30k0112;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;

public final class Test1 {
    private Test1() {

    }

    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Иван Иванов");
        hashSet.add("Петр Петров");
        hashSet.add("Семен Смирнов");


        TreeSet<String> treeSet = new TreeSet<>(hashSet);
        System.out.println(treeSet);


        Map<String, String> map = createMap();

        int sameFirstNameCount = getSameFirstNameCount(map);
        int sameLastNameCount = getSameLastNameCount(map);

        System.out.println(sameFirstNameCount + " " + sameLastNameCount);
    }

    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Петров", "Петр");
        map.put("Смирнов", "Семен");
        map.put("Игнатов", "Иван");
        map.put("Сокол", "Алексей");
        map.put("Попов", "Петр");
        map.put("Леснов", "Сергей");
        map.put("Венера", "Олег");
        map.put("Валиев", "Алексей");
        map.put("Козлов", "Дмитрий");
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
