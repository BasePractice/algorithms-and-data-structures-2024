package ru.mirea.practice.s0000001.task6;

import java.util.Scanner;

public abstract class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList catalog = new DoublyLinkedList();
        int choice;

        try {
            do {
                System.out.println("\nМеню:");
                System.out.println("1. Добавить студента");
                System.out.println("2. Удалить студента");
                System.out.println("3. Вывести список студентов");
                System.out.println("4. Очистить список");
                System.out.println("5. Проверить, пуст ли список");
                System.out.println("0. Выход");
                System.out.print("Выберите опцию: ");

                choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        Node student = new Node();
                        student.readAttributes(scanner);
                        catalog.addNode(student);
                        System.out.println("Студент добавлен.");
                        break;

                    case 2:
                        if (catalog.isEmpty()) {
                            System.out.println("Список пуст, нечего удалять.");
                        } else {
                            System.out.print("Введите имя студента для удаления: ");
                            String nameToRemove = scanner.nextLine();
                            Node current = catalog.head;
                            boolean found = false;

                            while (current != null) {
                                if (current.name.equalsIgnoreCase(nameToRemove)) {
                                    catalog.removeNode(current);
                                    System.out.println("Студент " + nameToRemove + " удален.");
                                    found = true;
                                    break;
                                }
                                current = current.next;
                            }

                            if (!found) {
                                System.out.println("Студент с именем " + nameToRemove + " не найден.");
                            }
                        }
                        break;

                    case 3:
                        System.out.println("Список студентов:");
                        catalog.displayList();
                        break;

                    case 4:
                        catalog.clear();
                        System.out.println("Список очищен.");
                        break;

                    case 5:
                        System.out.println("Список пуст: " + catalog.isEmpty());
                        break;

                    case 0:
                        System.out.println("Выход из программы.");
                        break;

                    default:
                        System.out.println("Неверный ввод. Попробуйте еще раз.");
                }
            } while (choice != 0);
        } finally {
            scanner.close();
        }
    }
}

