package ru.mirea.practice.s0000001.task1;

class Shape {
    protected String color;
    protected boolean filled;

    public String getType() {
        return "Фигура";
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }

    public String toString() {
        return getType() + " с цветом " + color + " и заполнением " + filled;
    }
}
