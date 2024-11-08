package ru.mirea.practice.s0000001.task7;

import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        Scanner scanner = null;

        try {
            scanner = new Scanner(System.in);
            int choice;

            do {
                System.out.println("1. Добавить элемент");
                System.out.println("2. Показать элементы");
                System.out.println("0. Выход");
                System.out.print("Выберите опцию: ");
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        list.addNode(scanner);
                        break;
                    case 2:
                        list.displayList();
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




