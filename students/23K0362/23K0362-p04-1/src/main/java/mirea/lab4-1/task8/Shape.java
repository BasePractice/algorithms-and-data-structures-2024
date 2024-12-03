package mirea.lab9.task8;

import java.util.Scanner;

public abstract class Shape {
    Scanner sc = new Scanner(System.in);
    private String name;
    protected String color;
    protected boolean filled;

    public Shape(String name, String color, boolean filled) {
        this.name = name;
        this.color = color;
        this.filled = filled;
    }

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
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
        return "Shape{" + "name='" + name + '\''
                + ", color='" + color + '\'' + ", filled=" + filled + '}';
    }

    abstract double getArea();

    abstract double getPerimeter();
}
