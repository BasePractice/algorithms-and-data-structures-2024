package ru.mirea.practice.s23k0823.task5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class ListPerformanceComparison {
    private static final int SIZE = 100000;
    private static final int ITERATIONS = 1000;

    public static void main(String[] args) {
        System.out.println("Сравнение производительности ArrayList и LinkedList");

        System.out.println("Вставка:");
        testInsertion(new ArrayList<>(), "ArrayList");
        testInsertion(new LinkedList<>(), "LinkedList");

        System.out.println("\nУдаление:");
        testDeletion(new ArrayList<>(), "ArrayList");
        testDeletion(new LinkedList<>(), "LinkedList");

        System.out.println("\nДобавление:");
        testAddition(new ArrayList<>(), "ArrayList");
        testAddition(new LinkedList<>(), "LinkedList");

        System.out.println("\nПоиск:");
        testSearch(new ArrayList<>(), "ArrayList");
        testSearch(new LinkedList<>(), "LinkedList");
    }

    private static void testInsertion(List<Integer> list, String name) {
        long startTime = System.nanoTime();
        for (int i = 0; i < ITERATIONS; i++) {
            list.add(i, i);
        }
        long endTime = System.nanoTime();
        System.out.println(name + " время вставки: " + (endTime - startTime) + " нс");
    }

    private static void testDeletion(List<Integer> list, String name) {
        for (int i = 0; i < SIZE; i++) {
            list.add(i);
        }
        long startTime = System.nanoTime();
        for (int i = 0; i < ITERATIONS; i++) {
            list.remove(i);
        }
        long endTime = System.nanoTime();
        System.out.println(name + " время удаления: " + (endTime - startTime) + " нс");
    }

    private static void testAddition(List<Integer> list, String name) {
        long startTime = System.nanoTime();
        for (int i = 0; i < ITERATIONS; i++) {
            list.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println(name + " время добавления: " + (endTime - startTime) + " нс");
    }

    private static void testSearch(List<Integer> list, String name) {
        for (int i = 0; i < SIZE; i++) {
            list.add(i);
        }
        long startTime = System.nanoTime();
        for (int i = 0; i < ITERATIONS; i++) {
            list.contains(i);
        }
        long endTime = System.nanoTime();
        System.out.println(name + " время поиска: " + (endTime - startTime) + " нс");
    }
}