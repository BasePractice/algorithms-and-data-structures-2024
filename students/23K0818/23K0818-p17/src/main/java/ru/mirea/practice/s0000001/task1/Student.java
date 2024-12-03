package ru.mirea.practice.s0000001.task1;

import java.util.Scanner;

// Класс, описывающий узел списка - элемент картотеки (студент)
class Student {
    private String name;
    private int age;
    private String major;

    // Конструктор
    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    // Функция для считывания атрибутов объекта с консоли
    public static Student readFromConsole() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите имя студента: ");

            System.out.print("Введите возраст студента: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Считываем остаток строки после числа

            System.out.print("Введите специальность студента: ");
            String major = scanner.nextLine();

            String name = scanner.nextLine();

            return new Student(name, age, major);
        }
    }

    // Функция для вывода атрибутов на экран
    public void printToConsole() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Специальность: " + major);
    }
}
