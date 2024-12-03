package ru.mirea.practice.s0000001;

import java.util.Scanner;

class Student {

    private String name;
    private int age;
    Student prev;
    Student next;

    public void readAttributes() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите имя студента: ");
            this.name = scanner.nextLine();
            System.out.print("Введите возраст студента: ");
            this.age = scanner.nextInt();
            scanner.nextLine();
        } finally {
            scanner.close();
        }
    }

    public void displayAttributes() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }

    public String getName() {
        return name;
    }
}
