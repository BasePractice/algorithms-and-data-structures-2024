package ru.mirea.practice.s0000001;

import java.util.Scanner;

public final class Main {

    private Main() {
    }

    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        Scanner scanner = new Scanner(System.in);
        int choice;

        try {
            do {
                System.out.println("\nМеню:");
                System.out.println("1. Добавить студента");
                System.out.println("2. Удалить студента");
                System.out.println("3. Показать всех студентов");
                System.out.println("4. Очистить список студентов");
                System.out.println("5. Проверить, пуст ли список");
                System.out.println("6. Выход");
                System.out.print("Выберите действие: ");
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        Student student = new Student();
                        student.readAttributes();
                        studentList.addStudent(student);
                        break;
                    case 2:
                        System.out.print("Введите имя студента для удаления: ");
                        String nameToRemove = scanner.nextLine();
                        studentList.removeStudent(nameToRemove);
                        break;
                    case 3:
                        studentList.displayStudents();
                        break;
                    case 4:
                        studentList.clear();
                        System.out.println("Список студентов очищен.");
                        break;
                    case 5:
                        System.out.println("Список пуст: " + studentList.isEmpty());
                        break;
                    case 6:
                        System.out.println("Выход из программы.");
                        break;
                    default:
                        System.out.println("Неверный выбор. Попробуйте снова.");
                        break;
                }
            } while (choice != 6);
        } finally {
            scanner.close();
        }
    }
}
