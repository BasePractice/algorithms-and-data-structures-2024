package ru.mirea.practice.s23k0350;

import java.util.Scanner;

class Student {
    String name;
    int age;
    Student next;

    public void readAttributes() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите имя: ");
            this.name = scanner.nextLine();
            System.out.print("Введите возраст: ");
            this.age = scanner.nextInt();
            scanner.nextLine();
        }
    }

    public void printAttributes() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }
}
