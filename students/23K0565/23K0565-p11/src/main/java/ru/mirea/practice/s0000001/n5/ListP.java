package ru.mirea.practice.s0000001.n5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class ListP {
    private ListP() {}

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        final int elementsCount = 100000;

        for (int i = 0; i < elementsCount; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        System.out.println("Вставка в середину:");
        measureTime(() -> arrayList.add(elementsCount / 2, -1), "ArrayList");
        measureTime(() -> linkedList.add(elementsCount / 2, -1), "LinkedList");

        System.out.println("Удаление из середины:");
        measureTime(() -> arrayList.remove(elementsCount / 2), "ArrayList");
        measureTime(() -> linkedList.remove(elementsCount / 2), "LinkedList");

        System.out.println("Добавление в конец:");
        measureTime(() -> arrayList.add(-1), "ArrayList");
        measureTime(() -> linkedList.add(-1), "LinkedList");

        System.out.println("Поиск элемента:");
        measureTime(() -> arrayList.contains(elementsCount - 1), "ArrayList");
        measureTime(() -> linkedList.contains(elementsCount - 1), "LinkedList");
    }

    private static void measureTime(Runnable action, String listType) {
        long start = System.nanoTime();
        action.run();
        long end = System.nanoTime();
        System.out.println(listType + ": " + (end - start) + " нс");
    }
}
