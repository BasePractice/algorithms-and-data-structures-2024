package ru.mirea.practice.s0000001;

import java.util.Scanner;

/**
 * Предлагается модернизировать задачу из предыдущей практической работы
 * (см. методические указания по выполнению практических работ №1-8) – задача сортировки студентов по среднему баллу.
 * Необходимо разработать пользовательский интерфейс для задачи поиска и сортировки (использовать массив интерфейсных
 * ссылок- пример в лекции 5). Дополнить ее поиском студента по фио – в
 * случае отсутствия такого студента необходимо выдавать собственное исключение.
 * Схема классов прогоаммы приведена на Рис.19.1.
 * Note: будет сделан поиск и список студентов, включая соответствующую ошибку.
 */

public abstract class Task2 {
    static class StudentNotFound extends Exception {
        public StudentNotFound(String s) {
            super(s);
        }
    }

    static class Student {
        String name;
        String surname;
        String middleName;

        Student(String name, String surname, String middleName) {
            this.name = name;
            this.surname = surname;
            this.middleName = middleName;
        }

        @Override
        public String toString() {
            return "Student{"
                    + "name='" + name + '\''
                    + ", surname='" + surname + '\''
                    + ", middle_name='" + middleName + '\''
                    + '}';
        }
    }

    public static void main(String[] args) throws StudentNotFound {
        Student[] students = new Student[4];

        // Minimal data will be used!
        students[0] = new Student("Ivan", "", "");
        students[1] = new Student("Petya", "", "");
        students[2] = new Student("Kate", "", "");
        students[3] = new Student("Anna", "", "");

        try (Scanner sc = new Scanner(System.in)) {
            String studName = sc.nextLine();

            for (Student student : students) {
                if (studName.equals(student.name)) {
                    System.out.println("Found:");
                    System.out.println(student);
                } else {
                    throw new StudentNotFound(studName + " not found in the list!");
                }
            }

        }
    }
}
