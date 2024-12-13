package ru.mirea.practice.s23k1167.task1;

import java.util.Scanner;

public final class Main {
    private Main() {
        // Приватный конструктор для предотвращения создания экземпляров класса
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Queue<String> queue = new ArrayQueue<>(); // Очередь для строк
            queue.enqueue("first");
            queue.enqueue("second");
            queue.enqueue("third");
            System.out.println("Queue size: " + queue.size());
            System.out.println("First element: " + queue.element());
            System.out.println("Dequeue: " + queue.dequeue());
            System.out.println("Queue size after dequeue: " + queue.size());
        }
    }
}
