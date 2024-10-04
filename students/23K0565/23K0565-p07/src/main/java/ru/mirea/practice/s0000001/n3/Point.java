package ru.mirea.practice.s0000001.n3;

public class Point {
    double x;
    double y;
    double speed;

    public Point(double x, double y, double speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "X: " + x + ", Y: " + y + ", Speed: " + speed;
    }

    public boolean speedTest(Point other) {
        return this.speed == other.speed;
    }

    public static void main(String[] args) {
        Point p1 = new Point(1.5, 2.0, 10.0);
        Point p2 = new Point(3.0, 4.0, 10.0);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println("Speed match: " + p1.speedTest(p2));
    }
}