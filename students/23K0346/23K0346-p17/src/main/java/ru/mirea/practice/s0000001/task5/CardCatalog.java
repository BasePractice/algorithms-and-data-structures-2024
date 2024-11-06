package ru.mirea.practice.s0000001.task5;

import java.util.Scanner;

public abstract class CardCatalog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList catalog = new DoublyLinkedList();

        try {
            System.out.print("Введите количество студентов: ");
            int count = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < count; i++) {
                Node student = new Node();
                student.readAttributes(scanner);
                catalog.addNode(student);
            }

            System.out.println("Список студентов:");
            catalog.displayList();

            System.out.println("Список пуст: " + catalog.isEmpty());

            catalog.clear();
            System.out.println("Список очищен.");
            System.out.println("Список пуст: " + catalog.isEmpty());
        } finally {
            scanner.close();
        }
    }
}


