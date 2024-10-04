package ru.mirea.practice.s0000001.start.task1;

public class Squa1 extends Shape {
    private int a;

    public Squa1(String type,int a) {
        super(type);
        this.a = a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public double getPerimetr() {
        return a * 4;
    }

    public double getArea() {
        return a * a;
    }

    public String toString() {
        return super.toString() + ",side a=" + a;
    }

}
