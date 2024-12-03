package ru.mirea.practice.s0000001.prog3;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        try (Scanner scanner = new Scanner(System.in)) {
            boolean exit = false;

            while (!exit) {
                System.out.println("Меню:");
                System.out.println("1. Добавить студента");
                System.out.println("2. Удалить студента");
                System.out.println("3. Показать всех студентов");
                System.out.println("4. Очистить список");
                System.out.println("5. Проверить, пуст ли список");
                System.out.println("6. Выйти");

                System.out.print("Выберите опцию: ");
                try {
                    int choice = scanner.nextInt();
                    scanner.nextLine();

                    switch (choice) {
                        case 1:
                            studentList.addStudent();
                            break;
                        case 2:
                            studentList.removeStudent();
                            break;
                        case 3:
                            studentList.displayAllStudents();
                            break;
                        case 4:
                            studentList.clearList();
                            break;
                        case 5:
                            if (studentList.isEmpty()) {
                                System.out.println("Список пуст.");
                            } else {
                                System.out.println("Список не пуст.");
                            }
                            break;
                        case 6:
                            exit = true;
                            System.out.println("Выход из программы.");
                            break;
                        default:
                            System.out.println("Неверный ввод. Попробуйте снова.");
                            break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: необходимо ввести число.");
                    scanner.nextLine();
                }
            }
        }
    }
}
