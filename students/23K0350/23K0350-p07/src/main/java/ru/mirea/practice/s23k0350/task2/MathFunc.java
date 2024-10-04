package ru.mirea.practice.s23k0350.task2;

public class MathFunc implements MathCalculable {
    double x;
    double y;
    double r;

    public MathFunc(int x, int y, double r) {
        this.y = y;
        this.x = x;
        this.r = r;
    }

    public  int power() {
        return (int) Math.pow(x,y);
    }

    public double module() {
        return Math.pow(Math.pow(x,2) + Math.pow(y,2),0.5);
    }

    public double lenokr() {
        return 2 * pi * r;
    }

}
