package ru.mirea.practice.s0000001;

import java.util.Scanner;

public class Ex1 {

    public static String funk(boolean a) {
        if (a) {
            return "Список пуст";
        } else {
            return "Список полон";
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);
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
                case 1 -> list.addElement();
                case 2 -> list.removeElement();
                case 3 -> list.displayElements();
                case 4 -> list.clearList();
                case 5 -> System.out.println(funk(list.isEmpty()));
                case 0 -> System.out.println("Выход из программы.");
                default -> System.out.println("Неверный выбор. Пожалуйста, попробуйте снова.");
            }
        } while (choice != 0);
    }
}
