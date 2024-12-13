package ru.mirea.practice.s0000001.num1;

import java.io.Serializable;

public class Node implements Serializable {
    private String name;
    private int age;

    public void readAttributes() {
        System.out.print("Введите имя: ");
        name = System.console().readLine();
        System.out.print("Введите возраст: ");
        age = Integer.parseInt(System.console().readLine());
    }

    public void printAttributes() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }
}
