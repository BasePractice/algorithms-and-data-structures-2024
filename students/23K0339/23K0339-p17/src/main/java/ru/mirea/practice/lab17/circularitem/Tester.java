package ru.mirea.practice.lab17.circularitem;

import java.util.Scanner;

public abstract class Tester {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        try (Scanner scanner = new Scanner(System.in)) {


            while (true) {
                System.out.println("\nМеню:");
                System.out.println("1 - Добавить элемент");
                System.out.println("2 - Удалить элемент");
                System.out.println("3 - Показать все элементы");
                System.out.println("4 - Очистить список");
                System.out.println("5 - Проверить пустоту списка");
                System.out.println("6 - Сохранить список в файл");
                System.out.println("7 - Загрузить список из файла");
                System.out.println("8 - Выйти");

                int choice;
                while (!scanner.hasNextInt()) {
                    System.out.println("Неверный ввод. Пожалуйста, введите число.");
                    scanner.next();
                }
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        list.addItem(scanner);
                        break;
                    case 2:
                        list.deleteItem(scanner);
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
                        System.out.print("Введите имя файла для сохранения: ");
                        String saveFileName = scanner.nextLine();
                        list.saveToFile(saveFileName);
                        break;
                    case 7:
                        System.out.print("Введите имя файла для загрузки: ");
                        String loadFileName = scanner.nextLine();
                        list.loadFromFile(loadFileName);
                        break;
                    case 8:
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
