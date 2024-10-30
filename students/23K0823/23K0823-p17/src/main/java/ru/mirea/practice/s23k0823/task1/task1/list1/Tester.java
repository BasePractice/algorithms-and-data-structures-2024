package ru.mirea.practice.s23k0823.task1.task1.list1;

import java.util.Scanner;

public abstract class Tester {
    public static void main(String[] args) {
        List list = new List();
        try (Scanner scanner = new Scanner(System.in);) {
            int choice;

            do {
                System.out.println("\nМеню:");
                System.out.println("1. Добавить элемент");
                System.out.println("2. Удалить элемент");
                System.out.println("3. Вывести список");
                System.out.println("4. Очистить список");
                System.out.println("5. Проверить, пуст ли список");
                System.out.println("6. Найти элемент по имени");
                System.out.println("0. Выход");
                System.out.print("Выберите действие: ");
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        list.addNode();
                        break;
                    case 2:
                        System.out.print("Введите имя элемента для удаления: ");
                        String nameToRemove = scanner.nextLine();
                        list.removeNode(nameToRemove);
                        break;
                    case 3:
                        list.printList();
                        break;
                    case 4:
                        list.clearList();
                        break;
                    case 5:
                        System.out.println("Список пуст: " + list.isEmpty());
                        break;
                    case 6:
                        System.out.print("Введите имя элемента для поиска: ");
                        String nameToFind = scanner.nextLine();
                        list.findNode(nameToFind);
                        break;
                    case 0:
                        System.out.println("Выход из программы.");
                        break;
                    default:
                        System.out.println("Неверный выбор. Попробуйте снова.");
                        break;
                }
            } while (choice != 0);
        }
    }
}