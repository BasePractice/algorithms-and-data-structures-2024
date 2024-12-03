package ru.mirea.practice.s23k0114.lab1.task1;

import java.util.Scanner;

class Node {
    private String name;
    private int age;

    // Конструктор класса, принимающий Scanner
    public Node(Scanner scanner) {
        inputAttributes(scanner);
    }

    // Метод для считывания атрибутов объекта с консоли
    public void inputAttributes(Scanner scanner) {
        System.out.print("Введите имя: ");
        this.name = scanner.nextLine();
        System.out.print("Введите возраст: ");
        this.age = scanner.nextInt();
        scanner.nextLine(); // Для очистки буфера
    }

    // Метод для вывода атрибутов на экран
    public void displayAttributes() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }
}
