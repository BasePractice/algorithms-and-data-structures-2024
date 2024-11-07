package ru.mirea.practice.s0000007.task1;


public class Rectangle {
    protected int x;      // Координата по оси X
    protected int y;      // Координата по оси Y
    protected int width;  // Ширина
    protected int height; // Высота

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle [x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "]";
    }
}