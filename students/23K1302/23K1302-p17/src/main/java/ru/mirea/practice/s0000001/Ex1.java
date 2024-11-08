package ru.mirea.practice.s0000001;

import java.util.Scanner;

public final class Ex1 {

    private Ex1() {
        // fgvbdfsbhlg
    }

    public static String funk(boolean a) {
        if (a) {
            return "Список пуст";
        } else {
            return "Список полон";
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        try (Scanner scanner = new Scanner(System.in)) {
            int choice;

            do {
                System.out.println("\nМеню:");
                System.out.println("1. Добавить элемент");
                System.out.println("2. Удалить элемент");
                System.out.println("3. Вывести список");
                System.out.println("4. Очистить список");
                System.out.println("5. Проверить, пуст ли список");
                System.out.println("0. Выход");
                System.out.print("Выберите опцию: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        list.addElement();
                        break;
                    case 2:
                        list.removeElement();
                        break;
                    case 3:
                        list.displayElements();
                        break;
                    case 4:
                        list.clearList();
                        break;
                    case 5:
                        System.out.println(funk(list.isEmpty()));
                        break;
                    case 0:
                        System.out.println("Выход из программы.");
                        break;
                    default:
                        System.out.println("Неверный выбор. Пожалуйста, попробуйте снова.");
                        break;
                }
            } while (choice != 0);
        }
    }
}
