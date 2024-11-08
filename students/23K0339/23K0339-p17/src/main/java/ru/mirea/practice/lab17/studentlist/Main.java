package ru.mirea.practice.lab17.studentlist;

import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();


        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Выберите действие:");
                System.out.println("1 - Добавить элемент");
                System.out.println("2 - Удалить элемент");
                System.out.println("3 - Показать все элементы");
                System.out.println("4 - Очистить список");
                System.out.println("5 - Проверить пустоту списка");
                System.out.println("6 - Выйти");


                int choice;
                while (!scanner.hasNextInt()) {
                    System.out.println("Неверный ввод. Введите число.");
                    scanner.next();
                }
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        list.addNode(scanner);
                        break;
                    case 2:
                        list.deleteNode(scanner);
                        break;
                    case 3:
                        list.displayAll();
                        break;
                    case 4:
                        list.clear();
                        break;
                    case 5:
                        System.out.println("Список пуст? " + list.isEmpty());
                        break;
                    case 6:
                        System.out.println("Выход из программы.");
                        return;
                    default:
                        System.out.println("Неверный выбор, попробуйте снова.");
                        break;
                }
            }
        }
    }
}
