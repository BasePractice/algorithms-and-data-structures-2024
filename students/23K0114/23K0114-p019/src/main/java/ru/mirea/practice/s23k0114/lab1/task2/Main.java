package ru.mirea.practice.s23k0114.lab1.task2;

import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        IStudent[] students = {
            new Student("Иванов Иван Иванович", 4.5),
            new Student("Петров Петр Петрович", 3.8),
            new Student("Сидоров Сидор Сидорович", 4.2)
        };

        StudentManager manager = new StudentManager(students);

        manager.sortStudentsByScore();
        manager.displayStudents();

        // Используем try-with-resources для автоматического закрытия Scanner
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите ФИО студента для поиска:");
            String fullName = scanner.nextLine();

            try {
                IStudent foundStudent = manager.findStudentByFullName(fullName);
                System.out.println("Найден студент: " + foundStudent.getFullName() + ", Средний балл: " + foundStudent.getAverageScore());
            } catch (StudentNotFoundException e) {
                System.out.println(e.getMessage());
            }
        } // Scanner автоматически закрывается здесь
    }
}
