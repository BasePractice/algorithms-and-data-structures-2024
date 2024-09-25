package ru.mirea.practice.s0000001.prog3;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() {return y;}
    public void setY(int y) {this.y = y;}

    public int getX() {return x;}
    public void setX(int x) {this.x = x;}

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
