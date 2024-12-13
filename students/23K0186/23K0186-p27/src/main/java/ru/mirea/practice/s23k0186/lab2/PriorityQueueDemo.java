package ru.mirea.practice.s23k0145.lab2;

import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Scanner;

public final class PriorityQueueDemo {

    private PriorityQueueDemo() {}

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            CustomHashTable customHashTable = new CustomHashTable();
            customHashTable.initializeTable();
            populateHashTable(customHashTable);

            demonstrateHashTable(customHashTable);

            demonstratePriorityQueue();
        }
    }

    private static void populateHashTable(CustomHashTable hashTable) {
        System.out.println("Добавление элементов в хеш-таблицу...");
        for (int i = 1; i <= 10; i++) {
            hashTable.insert("item" + i, "data" + i);
        }
    }

    private static void demonstrateHashTable(CustomHashTable hashTable) {
        System.out.println("Поиск по ключу 'item5': " + hashTable.find("item5"));
        System.out.println("Удаление ключа 'item5'...");
        hashTable.remove("item5");
        System.out.println("Поиск по ключу 'item5' после удаления: " + hashTable.find("item5"));
    }

    private static void demonstratePriorityQueue() {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        System.out.println("Создание и заполнение очереди с приоритетом...");
        for (int i = 1; i <= 10; i++) {
            priorityQueue.add(i);
        }

        System.out.println("Извлечение элементов из очереди с приоритетом:");
        for (int i = 0; i < 5; i++) {
            System.out.println(priorityQueue.poll());
        }
    }
}
