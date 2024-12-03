package ru.mirea.practice.s0000001.prog2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Иван", 13, 1, 1),
                new Student("Олег", 15, 2, 2),
                new Student("Вадим", 14, 3, 3),
                new Student("Богдан", 16, 4, 4),
                new Student("Андрей", 17, 5, 5)
        );

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Выберите действи: 1- отсортировать студентов, 2 - найти студента, "
                        + "3 - закрыть программу");
                Integer input = scanner.nextInt();
                scanner.nextLine();
                switch (input) {
                    case 1:
                        Student.setArray(students);
                        System.out.println("Исходный список:");
                        Student.printStudents(students);

                        //qsort по убыванию
                        System.out.println("Отсортированный список:");
                        Student.printStudents(SortingStudentsbygpa.qsort(students));
                        break;
                    case 2:
                        try {
                            System.out.println("Введите имя студента для поиска");
                            String name = scanner.nextLine();
                            boolean flag = false;
                            for (Student student : students) {
                                if (student.getName().equals(name)) {
                                    student.printStudent();
                                    flag = true;
                                    break;
                                }
                            }
                            if (flag) {
                                break;
                            } else {
                                throw new InvalidNameExeption("Такого студента не существует");
                            }
                        } catch (InvalidNameExeption e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 3:
                        System.out.println("Программа завершается.");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Базовый выход");
                        break;
                }
            }
        }
    }
}

