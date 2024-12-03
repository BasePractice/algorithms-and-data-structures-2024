package ru.mirea.practice.lab19.student;

import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        Student[] groupA = new Student[]{
            new Student("Иван", "Иванов", "Информатика", 2, "Группа 101", 3.8),
            new Student("Петр", "Петров", "Инженерия", 3, "Группа 102", 4.0)
        };
        Student[] groupB = new Student[]{
            new Student("Светлана", "Сидорова", "Физика", 1, "Группа 103", 3.5),
            new Student("Анна", "Антонова", "Математика", 2, "Группа 104", 3.9)
        };

        SortingStudentsByGpA sortingStudents = new SortingStudentsByGpA();
        sortingStudents.mergeAndSort(groupA, groupB);

        System.out.println("Объединенный и отсортированный список студентов по GPA:");
        sortingStudents.outArray();

        System.out.println();
        sortingStudents.sortByLastName();
        System.out.println("Отсортированный список студентов по Фамилии:");
        sortingStudents.outArray();


        try (Scanner scanner = new Scanner(System.in)) {
            String firstName = "";
            String lastName = "";

            try {
                System.out.println("Введите имя студента для поиска:");
                firstName = scanner.nextLine();
                if (firstName.trim().isEmpty()) {
                    throw new EmptyInputException("Имя не может быть пустым.");
                }

                System.out.println("Введите фамилию студента для поиска:");
                lastName = scanner.nextLine();
                if (lastName.trim().isEmpty()) {
                    throw new EmptyInputException("Фамилия не может быть пустой.");
                }

                // Поиск студента по ФИО
                Student foundStudent = sortingStudents.searchStudentByFullName(firstName, lastName);
                System.out.println("Найден студент: " + foundStudent);

            } catch (EmptyInputException | StudentNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
