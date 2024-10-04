package ru.mirea.practice.s0000001.task2;

import java.util.Arrays;
import java.util.Random;

class Point {
    private double x;
    private double y;

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

    public double getRadius() {
        return radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}

class Tester {
    private Circle[] circles;
    private int count;

    public Tester(int size) {
        circles = new Circle[size];
        count = 0;
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            Point center = new Point(random.nextDouble() * 10, random.nextDouble() * 10);
            double radius = random.nextDouble() * 5 + 1; // радиус от 1 до 6
            circles[i] = new Circle(center, radius);
            count++;
        }
    }

    public Circle getSmallestCircle() {
        return Arrays.stream(circles).min((c1, c2) -> Double.compare(c1.getCircumference(), c2.getCircumference())).orElse(null);
    }

    public Circle getLargestCircle() {
        return Arrays.stream(circles).max((c1, c2) -> Double.compare(c1.getCircumference(), c2.getCircumference())).orElse(null);
    }

    public void sortCircles() {
        Arrays.sort(circles, (c1, c2) -> Double.compare(c1.getCircumference(), c2.getCircumference()));
    }

    public void displayCircles() {
        for (Circle circle : circles) {
            System.out.println("Circle with radius: " + circle.getRadius() + ", Circumference: " + circle.getCircumference());
        }
    }

    public static void main(String[] args) {
        Tester tester = new Tester(5);
        System.out.println("Circles before sorting:");
        tester.displayCircles();

        tester.sortCircles();
        System.out.println("\nCircles after sorting:");
        tester.displayCircles();

        Circle smallest = tester.getSmallestCircle();
        Circle largest = tester.getLargestCircle();
        System.out.println("\nSmallest Circle: " + smallest.getRadius() + ", Circumference: " + smallest.getCircumference());
        System.out.println("Largest Circle: " + largest.getRadius() + ", Circumference: " + largest.getCircumference());
    }
}