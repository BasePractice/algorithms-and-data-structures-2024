package ru.mirea.practice.s0000001.start.task1;

public class Shape {
    public String type;

    public Shape(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public double getPerimetr() {
        return 0.0;
    }

    public double getArea() {
        return 0.0;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return "Shape:type=" + type;
    }
}
