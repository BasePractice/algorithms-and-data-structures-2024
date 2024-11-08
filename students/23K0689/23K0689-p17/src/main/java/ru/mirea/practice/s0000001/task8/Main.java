package ru.mirea.practice.s0000001.task8;

import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        CircularList list = new CircularList();
        Scanner scanner = null;

        try {
            scanner = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\n1. Добавить элемент");
                System.out.println("2. Удалить элемент");
                System.out.println("3. Показать элементы");
                System.out.println("4. Очистить список");
                System.out.println("5. Проверить, пуст ли список");
                System.out.println("0. Выход");
                System.out.print("Выберите опцию: ");
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Введите имя: ");
                        String name = scanner.nextLine();
                        System.out.print("Введите возраст: ");
                        int age = scanner.nextInt();
                        list.addNode(name, age);
                        break;
                    case 2:
                        System.out.print("Введите имя элемента для удаления: ");
                        String nameToRemove = scanner.nextLine();
                        list.removeNode(nameToRemove);
                        break;
                    case 3:
                        System.out.println("Элементы списка:");
                        list.displayList();
                        break;
                    case 4:
                        list.clear();
                        break;
                    case 5:
                        System.out.println("Список " + (list.isEmpty() ? "пуст." : "не пуст."));
                        break;
                    case 0:
                        System.out.println("Выход из программы.");
                        break;
                    default:
                        System.out.println("Неверный выбор. Попробуйте снова.");
                        break;
                }
            } while (choice != 0);
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
