package ru.mirea.practice.s0000001.task1;

import java.util.HashSet;
import java.util.TreeSet;

public abstract class Main {
    public static void main(String[] args) {
        // Шаг 1: Создание HashSet и добавление элементов
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Orange");

        // Шаг 2: Преобразование HashSet в TreeSet
        TreeSet<String> treeSet = new TreeSet<>(hashSet);

        // Шаг 3: Вывод элементов TreeSet
        System.out.println("Элементы TreeSet: " + treeSet);
    }
}