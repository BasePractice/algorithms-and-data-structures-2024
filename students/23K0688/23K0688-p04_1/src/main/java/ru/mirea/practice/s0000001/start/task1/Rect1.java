package ru.mirea.practice.s0000001.start.task1;

public class Rect1 extends Shape {
    private int a;
    private int b;

    public Rect1(String type,int a,int b) {
        super(type);
        this.a = a;
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public double getPerimetr() {
        return a * 2 + b * 2;
    }

    public double getArea() {
        return a * b;
    }

    public String toString() {
        return super.toString() + ",side a=" + a + ",side b=" + b;
    }
}
