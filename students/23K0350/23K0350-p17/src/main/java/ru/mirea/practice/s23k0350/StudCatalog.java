package ru.mirea.practice.s23k0350;

import java.util.Scanner;


abstract class StudCatalog {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        try (Scanner scanner = new Scanner(System.in)) {
            int choice;
            do {
                System.out.println("\n1. Добавить элемент");
                System.out.println("2. Удалить элемент");
                System.out.println("3. Вывести список");
                System.out.println("4. Очистить список");
                System.out.println("5. Проверить, пуст ли список");
                System.out.println("0. Выход");
                System.out.print("Выберите действие: ");
                choice = scanner.nextInt();
                scanner.nextLine();
                if (choice == 1) {
                    list.addNode();
                } else if (choice == 2) {
                    System.out.print("Введите имя элемента для удаления: ");
                    String nameToDelete = scanner.nextLine();
                    list.deleteNode(nameToDelete);
                } else if (choice == 3) {
                    list.printList();
                } else if (choice == 4) {
                    list.clear();
                } else if (choice == 5) {
                    System.out.println("Список " + (list.isEmpty() ? "пуст." : "не пуст."));
                } else if (choice == 0) {
                    System.out.println("Выход из программы.");
                } else {
                    System.out.println("Неверный ввод. Попробуйте снова.");
                }
            } while (choice != 0);
        }
    }
}