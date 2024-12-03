package ru.mirea.practice.s0000001.task1;

import java.util.Scanner;

public class Node {
    String name;
    int age;
    Node next;
    Node prev;

    // Изменяем метод, чтобы он принимал Scanner как параметр
    void readAttributes(Scanner scanner) {
        name = scanner.nextLine();  // Чтение строки для имени
        age = scanner.nextInt();    // Чтение целого числа для возраста
    }

    void displayAttributes() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
