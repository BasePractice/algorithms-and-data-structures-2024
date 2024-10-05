package ru.mirea.practice.s23k0623;

public class Tester {
    private final Circle[] circles;
    private int count;

    public Tester(int capacity) {
        circles = new Circle[capacity];
        count = 0;
    }

    public void addCircle(Circle circle) {
        if (count < circles.length) {
            circles[count] = circle;
            count++;
        } else {
            System.out.println("Массив заполнен!");
        }
    }

    public void printCircles() {
        for (int i = 0; i < count; i++) {
            System.out.println("Окружность " + (i + 1) + ":");
            System.out.println("Центр: (" + circles[i].getCenter().getX() + ", " + circles[i].getCenter().getY() + ")");
            System.out.println("Радиус: " + circles[i].getRadius());
            System.out.println();
        }
    }
}