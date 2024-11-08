package ru.mirea.practice.s0000001.prog3;

import java.util.Scanner;

class Student {
    private String name;
    private int age;

    public void readAttributes() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите имя студента: ");
            this.name = scanner.nextLine();
            System.out.print("Введите возраст студента: ");
            this.age = scanner.nextInt();
        }
    }

    public void displayAttributes() {
        System.out.println("Имя студента: " + name);
        System.out.println("Возраст студента: " + age);
    }

    public String getName() {
        return name;
    }
}
