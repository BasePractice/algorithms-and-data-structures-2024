package ru.mirea.practice.lab27.t1;

import java.util.PriorityQueue;

public abstract class Main {
    public static void main(String[] args) {
        HashTable<String, Integer> hashTable = new HashTable<>() {
        };

        for (int i = 1; i <= 10; i++) {
            hashTable.add("Key" + i, i * 10);
        }

        System.out.println("Поиск элемента: " + hashTable.lookup("Key5"));

        hashTable.delete("Key5");

        System.out.println("После удаления элемента Key5: " + hashTable.lookup("Key5"));

        PriorityQueue<Element> priorityQueue = new PriorityQueue<>();

        for (int i = 1; i <= 10; i++) {
            priorityQueue.add(new Element("Item" + i, i * 5));
        }

        System.out.println("Извлечение элементов из очереди:");
        for (int i = 0; i < 3; i++) {
            System.out.println(priorityQueue.poll());
        }
    }
}

