package ru.mirea.practice.s0000001.task3;

class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }
}

class Tester {
    public static void main(String[] args) {
        Circle[] circles = new Circle[2];
        circles[0] = new Circle(new Point(0, 0), 5);
        circles[1] = new Circle(new Point(1, 1), 10);
        System.out.println("Circles created.");
    }
}