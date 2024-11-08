package ru.mirea.practice.s0000001.n1;

import java.util.Scanner;

public final class Tester {
    private Tester() {}

    public static void main(String[] args) {
        List list = new List();
        try (Scanner scanner = new Scanner(System.in)) {
            int choice;

            do {
                System.out.println("Меню:");
                System.out.println("1. Добавить элемент");
                System.out.println("2. Удалить элемент");
                System.out.println("3. Показать список");
                System.out.println("4. Очистить список");
                System.out.println("5. Проверить на пустоту");
                System.out.println("0. Выйти");
                System.out.print("Выберите действие: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        Node newNode = new Node();
                        newNode.readAttributes();
                        list.addElement(newNode);
                        break;
                    case 2:
                        System.out.print("Введите имя для удаления: ");
                        scanner.nextLine(); // Очистка буфера
                        String name = scanner.nextLine();
                        list.removeElement(name);
                        break;
                    case 3:
                        list.displayList();
                        break;
                    case 4:
                        list.clearList();
                        System.out.println("Список очищен");
                        break;
                    case 5:
                        System.out.println(list.isEmpty() ? "Список пуст" : "Список не пуст");
                        break;
                    case 0:
                        System.out.println("Выход");
                        break;
                    default:
                        System.out.println("Неверный выбор");
                        break;
                }
            } while (choice != 0);
        }
    }
}
