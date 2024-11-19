package ru.mirea.practice.s0000001.task3;

import java.util.Scanner;

public class Shape {
    private String name;
    private double x;
    private double y;

    public Shape(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setAtributes() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter name:\n");
            name = sc.nextLine();
            System.out.println("Enter x cootdinate:\n");
            x = sc.nextDouble();
            System.out.println("Enter y cootdinate:\n");
            y = sc.nextDouble();
        }
    }

    public void printAtribute() {
        System.out.println(name  + "\n" + y  + "\n" + x);
    }

    public String returnAtribute() {
        return name  + "\n" + y  + "\n" + x;
    }

    @Override
    public String toString() {
        return name;
    }
}
