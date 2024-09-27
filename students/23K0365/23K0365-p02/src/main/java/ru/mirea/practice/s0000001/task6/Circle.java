package ru.mirea.practice.s0000001.task6;

public class Circle {
    private final double x;
    private final double y;
    private double r;
    private static double pi = 3.14159;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public void setr(double r) {
        this.r = r;
    }

    public double getSqure() {
        return pi * (this.r * this.r);
    }

    public double getLen() {
        return 2 * pi * this.r;
    }

    public String compareTwo(Circle cirOne, Circle cirTwo) {
        if (cirOne.r > cirTwo.r) {
            return "Circle #1 is bigger\n";
        }
        if (cirOne.r < cirTwo.r) {
            return "Circle #2 is bigger\n";
        } else {
            return "Circles r equals\n";
        }
    }

    @Override
    public String toString() {
        return "This circle stand in "
                + "(" + this.x + ";" + this.y + "). "
                + "It's radius is " + this.r + ". "
                + "Square equals " + getSqure()
                + "\n";
    }
}