package ru.mirea.practice.s23k0114.lab1.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class CardCatalogTester {
    public static void main(String[] args) {
        // Используем try-with-resources для автоматического закрытия Scanner
        try (Scanner scanner = new Scanner(System.in)) {
            List<Node> nodes = new ArrayList<>();
            int choice;

            do {
                System.out.println("\nМеню:");
                System.out.println("1. Добавить элемент");
                System.out.println("0. Выход");
                System.out.print("Выберите действие: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // Для очистки буфера

                switch (choice) {
                    case 1:
                        Node node = new Node(scanner); // Создаем новый узел, передавая Scanner
                        nodes.add(node);
                        break;
                    case 0:
                        System.out.println("Выход из программы.");
                        break;
                    default:
                        System.out.println("Неверный выбор, попробуйте снова.");
                        break;
                }
            } while (choice != 0);
        } // Scanner будет закрыт автоматически здесь
    }
}
