package ru.mirea.practice.s23f0011.task1;

import java.util.HashSet;
import java.util.TreeSet;

public abstract class SetConversion {
    public static void main(String[] args) {
        // Создаем HashSet и добавляем элементы
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Кофе");
        hashSet.add("Чай");
        hashSet.add("Коктейль");
        hashSet.add("Сок");

        // Преобразуем HashSet в TreeSet
        TreeSet<String> treeSet = new TreeSet<>(hashSet);

        // Выводим TreeSet
        System.out.println("TreeSet: " + treeSet);
    }
}
