package ru.mirea.practice.s23k0215;

public class Ball {
    private double x;
    private double y;

    // Конструктор
    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Геттеры
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Сеттеры
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Метод для смещения мяча
    public void move(double xdisp, double ydisp) {
        this.x += xdisp;
        this.y += ydisp;
    }

    // Метод toString
    @Override
    public String toString() {
        return "Ball[x=" + x + ",y=" + y + "]";
    }
}


