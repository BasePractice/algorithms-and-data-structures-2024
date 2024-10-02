package ru.mirea.practice.s23k0087.task4;

import java.util.Scanner;

public class Computer {
    private String name;
    private String os;
    private float price;


    public Computer() {
        this.name = null;
        this.os = null;
        this.price = 0;
    }

    public String getName() {
        return name;
    }

    public String getOs() {
        return os;
    }

    public float getPrice() {
        return price;
    }

    public void setName(Scanner sc) {
        System.out.print("Введите название компьютера: ");
        this.name = sc.next();

        if (name.isEmpty()) {
            System.out.println("Название не может быть пустым");
            setName(sc);
        }
    }


    public void setOs(Scanner sc) {
        System.out.print("Введите операционную систему: ");
        this.os = sc.next();

        if (os.isEmpty()) {
            System.out.println("Название ОС не может быть пустым");
            setOs(sc);
        }
    }

    public void setPrice(Scanner sc) {
        System.out.print("Введите цену: ");
        this.price = sc.nextFloat();

        if (price < 0) {
            System.out.println("Цена не может быть отрицательной");
            setPrice(sc);
        }
    }

    public String toString() {
        return "Computer[name = " + name + ", os = " + os + ", price = " + price + "$]";
    }
}