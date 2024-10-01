package ru.mirea.practice.s23k0143;

public class Point implements SpeedTestable {
    private double x;
    private double y;
    private double speed;

    public Point(double x, double y, double speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }

    public static boolean speedTest(Point p1, Point p2) {
        return p1.getSpeed() == p2.getSpeed();
    }
}

