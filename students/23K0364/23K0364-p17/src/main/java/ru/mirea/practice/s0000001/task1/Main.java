package ru.mirea.practice.s0000001.task1;

import java.util.Scanner;

public abstract class Main {

    public static void main(String[] args) {
        ListContainer list = new ListContainer();
        try (Scanner scanner = new Scanner(System.in)) {
            boolean exit = false;

            while (!exit) {
                System.out.println("Выберите действие:");
                System.out.println("1 - Добавить элемент");
                System.out.println("2 - Удалить элемент");
                System.out.println("3 - Показать элемент");
                System.out.println("4 - Очистить список");
                System.out.println("5 - Проверить, пуст ли список");
                System.out.println("6 - Сохранить список в файл");
                System.out.println("7 - Загрузить список из файла");
                System.out.println("0 - Выйти");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Поглощаем новую строку после ввода числа

                switch (choice) {
                    case 1:
                        Node node = new Node();
                        node.readFromConsole();
                        list.addNode(node);
                        break;
                    case 2:
                        System.out.print("Введите индекс для удаления: ");
                        int index = scanner.nextInt();
                        scanner.nextLine();
                        list.removeNode(index);
                        break;
                    case 3:
                        System.out.print("Введите индекс для отображения: ");
                        int indexToShow = scanner.nextInt();
                        scanner.nextLine();
                        list.displayNode(indexToShow);
                        break;
                    case 4:
                        list.clearList();
                        break;
                    case 5:
                        System.out.println("Список пуст? " + list.isEmpty());
                        break;
                    case 6:
                        System.out.print("Введите имя файла: ");
                        String filename = scanner.nextLine();
                        list.saveToFile(filename);
                        break;
                    case 7:
                        System.out.print("Введите имя файла: ");
                        String filenameToLoad = scanner.nextLine();
                        list.loadFromFile(filenameToLoad);
                        break;
                    case 0:
                        exit = true;
                        break;
                    default:
                        System.out.println("Неверный выбор");
                        break;
                }
            }
        }
    }
}
