package ru.mirea.practice.s23k0215.task2;

import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        try (Scanner scanner = new Scanner(System.in)) {
            int choice;

            do {
                System.out.println("1. Добавить элемент");
                System.out.println("2. Удалить элемент");
                System.out.println("3. Показать элементы");
                System.out.println("4. Очистить список");
                System.out.println("5. Проверить, пуст ли список");
                System.out.println("6. Выйти");
                System.out.print("Выберите действие: ");
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Введите имя элемента: ");
                        String name = scanner.nextLine();
                        list.addElement(name);
                        break;
                    case 2:
                        System.out.print("Введите имя элемента для удаления: ");
                        String removeName = scanner.nextLine();
                        list.removeElement(removeName);
                        break;
                    case 3:
                        list.displayElements();
                        break;
                    case 4:
                        list.clear();
                        System.out.println("Список очищен.");
                        break;
                    case 5:
                        System.out.println("Список пуст: " + list.isEmpty());
                        break;
                    case 6:
                        System.out.println("Выход из программы.");
                        break;
                    default:
                        System.out.println("Неверный выбор. Попробуйте снова.");
                        break;
                }
            } while (choice != 6);
        }
    }
}
