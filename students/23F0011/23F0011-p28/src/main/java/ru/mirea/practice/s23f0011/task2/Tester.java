package ru.mirea.practice.s23f0011.task2;

import java.util.Map;

import static ru.mirea.practice.s23f0011.task2.NameCounter.createMap;
import static ru.mirea.practice.s23f0011.task2.NameCounter.getSameFirstNameCount;
import static ru.mirea.practice.s23f0011.task2.NameCounter.getSameLastNameCount;

public abstract class Tester {
    public static void main(String[] args) {
        // Создаем Map
        Map<String, String> peopleMap = createMap();

        // Получаем количество одинаковых имен и фамилий
        int sameFirstNameCount = getSameFirstNameCount(peopleMap);
        int sameLastNameCount = getSameLastNameCount(peopleMap);

        // Выводим результаты
        System.out.println("Количество людей с одинаковыми именами: " + sameFirstNameCount);
        System.out.println("Количество людей с одинаковыми фамилиями: " + sameLastNameCount);
    }
}

