package ru.mirea.practice.s0000001.task1;

import java.util.Scanner;

public final class LabClassDriver {  // Добавлен final

    // Приватный конструктор, чтобы предотвратить создание экземпляра класса
    private LabClassDriver() {
    }

    public static void main(String[] args) {
        LabClass labClass = new LabClass();
        LabClassUI ui = new LabClassUI(labClass);

        // Используем try-with-resources для автоматического закрытия ресурса
        try (Scanner scanner = new Scanner(System.in)) {  // Закрытие Scanner после использования
            while (true) {
                ui.displayMenu();
                int choice = scanner.nextInt();
                scanner.nextLine();  // Consume newline
                switch (choice) {
                    case 1:
                        ui.addStudent();
                        break;
                    case 2:
                        labClass.sortStudentsByScore();
                        break;
                    case 3:
                        ui.searchStudent();
                        break;
                    case 4:
                        ui.showStudents();
                        break;
                    case 5:
                        return;  // Выход из программы
                    default:
                        System.out.println("Invalid choice.");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
