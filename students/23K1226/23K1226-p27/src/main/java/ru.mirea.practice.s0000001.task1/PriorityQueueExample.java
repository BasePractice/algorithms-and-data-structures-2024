package ru.mirea.practice.s0000001.task1;

import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Scanner;

final class PriorityQueueExample {

    private PriorityQueueExample() {
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            HashTable hashTable = new HashTable();
            hashTable.hashtabInit();

            addElementsToHashTable(hashTable);
            demonstrateHashTableOperations(hashTable);
            demonstratePriorityQueueOperations();
        }
    }

    private static void addElementsToHashTable(HashTable hashTable) {
        System.out.println("Добавление элементов в хеш-таблицу:");
        for (int i = 1; i <= 10; i++) {
            hashTable.hashtabAdd("key" + i, "value" + i);
        }
    }

    private static void demonstrateHashTableOperations(HashTable hashTable) {
        System.out.println("Поиск по ключу key5: " + hashTable.hashtabLookup("key5"));
        System.out.println("Удаление ключа key5");
        hashTable.hashtabDelete("key5");
        System.out.println("Поиск по ключу key5 после удаления: " + hashTable.hashtabLookup("key5"));
    }

    private static void demonstratePriorityQueueOperations() {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        System.out.println("Создание очереди с приоритетом:");
        for (int i = 1; i <= 10; i++) {
            priorityQueue.add(i);
        }

        System.out.println("Извлечение элементов из очереди с приоритетом:");
        for (int i = 0; i < 5; i++) {
            System.out.println(priorityQueue.poll());
        }
    }
}
