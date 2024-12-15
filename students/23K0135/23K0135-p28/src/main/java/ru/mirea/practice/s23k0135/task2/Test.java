package ru.mirea.practice.s23k0135.task2;


import java.util.Map;

import static ru.mirea.practice.s23k0135.task2.NameCounter.createMap;
import static ru.mirea.practice.s23k0135.task2.NameCounter.getSameFirstNameCount;
import static ru.mirea.practice.s23k0135.task2.NameCounter.getSameLastNameCount;

public abstract class Test {
    public static void main(String[] args) {
        Map<String, String> peopleMap = createMap();
        int sameFirstNameCount = getSameFirstNameCount(peopleMap);
        int sameLastNameCount = getSameLastNameCount(peopleMap);
        System.out.println("Количество людей с одинаковыми именами: " + sameFirstNameCount);
        System.out.println("Количество людей с одинаковыми фамилиями: " + sameLastNameCount);
    }
}
