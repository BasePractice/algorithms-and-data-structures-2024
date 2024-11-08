package ru.mirea.practice.s23f0011.task2;

import java.util.Scanner;

public class LabClassUI {
    private LabClass labClass;
    private Scanner scanner;

    public LabClassUI(int size) {
        labClass = new LabClass(size);
    }

    public void start() {
        while (true) {
            System.out.println("1. Добавить студента");
            System.out.println("2. Найти студента");
            System.out.println("3. Отсортировать студентов");
            System.out.println("4. Вывести всех студентов");
            System.out.println("5. Выход");
            System.out.print("Выберите действие: ");
            try {
                scanner = new Scanner(System.in);
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        findStudent();
                        break;
                    case 3:
                        sortStudents();
                        break;
                    case 4:
                        displayStudents();
                        break;
                    case 5:
                        System.out.println("Выход...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Неверный выбор, попробуйте снова.");
                        break;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void addStudent() {
        try {
            System.out.print("Введите ФИО студента: ");
            String fullName = scanner.nextLine();
            System.out.print("Введите средний балл: ");
            double averageScore = scanner.nextDouble();
            scanner.nextLine();

            Student student = new Student(fullName, averageScore);
            labClass.addStudent(student);
            System.out.println("Студент добавлен.");
        } catch (EmptyStringException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private void findStudent() {
        try {
            System.out.print("Введите ФИО для поиска: ");
            String fullName = scanner.nextLine();
            Student student = labClass.findStudent(fullName);
            System.out.println("Найденный студент: " + student);
        } catch (StudentNotFoundException | EmptyStringException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private void sortStudents() {
        labClass.sortStudentsByAverageScore();
        System.out.println("Студенты отсортированы по среднему баллу.");
    }

    private void displayStudents() {
        Student[] students = labClass.getStudents();
        if (students.length == 0) {
            System.out.println("Нет студентов для отображения.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}
