package ru.mirea.practice.s0000001.task1;

import java.util.Scanner;

public class Node {
    private String name;
    private int age;

    public void readFromConsole() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите имя: ");
            this.name = scanner.nextLine();
            System.out.print("Введите возраст: ");
            this.age = scanner.nextInt();
        }
    }

    public void display() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}