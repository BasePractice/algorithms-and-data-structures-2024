package mirea.lab9.task1;

import java.util.Scanner;

public class Shape {
    Scanner sc = new Scanner(System.in);
    private String name;

    public Shape(String nameShape) {
        this.name = nameShape;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPositive(String nameValue) {
        System.out.println("Введите размер " + nameValue + "(>0): ");
        double addValue = sc.nextDouble();
        if (addValue > 0) {
            return addValue;
        } else {
            System.out.println("Число не положительное");
            return getPositive(nameValue);
        }
    }

    @Override
    public String toString() {
        return "Shape{" + "name='" + name + '\'' + '}';
    }

    double getRadius() {
        return 0;
    }

    public void setRadius(double radius) {
        System.out.println("У фигуры нет такого метода");
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return  0;
    }

    public double getLenFace() {
        return 0;
    }

    public void setLenFace(double lenFace) {
        System.out.println("У фигуры нет такого метода");
    }

    public double getLenA() {
        return 0;
    }

    public void setLenA(double lenA) {
        System.out.println("У фигуры нет такого метода");
    }

    public double getLenB() {
        return 0;
    }

    public void setLenB(double lenB) {
        System.out.println("У фигуры нет такого метода");
    }
}