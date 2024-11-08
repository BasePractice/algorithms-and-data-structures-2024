package ru.mirea.practice.s0000001;

import java.util.Scanner;

public class Node {
    private String name;
    private int age;
    public Node next;

    public void readAttributes() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите имя: ");
            this.name = scanner.nextLine();
            System.out.print("Введите возраст: ");
            this.age = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Ошибка при вводе данных: " + e.getMessage());
        }
    }

    public void displayAttributes() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }
}
