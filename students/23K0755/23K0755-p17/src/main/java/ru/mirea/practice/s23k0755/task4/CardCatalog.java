package ru.mirea.practice.s23k0755.task4;


import java.util.Scanner;

public abstract class CardCatalog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            DoublyLinkedList catalog = new DoublyLinkedList();

            System.out.print("Введите количество студентов: ");
            int count = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < count; i++) {
                Node student = new Node();
                student.readAttributes(scanner);
                catalog.addNode(student);
            }

            System.out.println("Список студентов:");
            catalog.displayList();
        } finally {
            scanner.close();
        }
    }
}
