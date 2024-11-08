package ru.mirea.practice.lab11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class ListPerformanceComparison {
    private static final int ELEMENTS = 100000;

    public static void main(String[] args) {
        final List<Integer> arrayList = new ArrayList<>();
        final List<Integer> linkedList = new LinkedList<>();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS; i++) {
            arrayList.add(i);
        }
        System.out.println("ArrayList добавление: " + (System.currentTimeMillis() - startTime) + " ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS; i++) {
            linkedList.add(i);
        }
        System.out.println("LinkedList добавление: " + (System.currentTimeMillis() - startTime) + " ms");

        startTime = System.currentTimeMillis();
        arrayList.contains(ELEMENTS - 1);
        System.out.println("ArrayList поиск: " + (System.currentTimeMillis() - startTime) + " ms");

        startTime = System.currentTimeMillis();
        linkedList.contains(ELEMENTS - 1);
        System.out.println("LinkedList поиск: " + (System.currentTimeMillis() - startTime) + " ms");

        startTime = System.currentTimeMillis();
        arrayList.clear();
        System.out.println("ArrayList удаление: " + (System.currentTimeMillis() - startTime) + " ms");

        startTime = System.currentTimeMillis();
        linkedList.clear();
        System.out.println("LinkedList удаление: " + (System.currentTimeMillis() - startTime) + " ms");
    }
}

