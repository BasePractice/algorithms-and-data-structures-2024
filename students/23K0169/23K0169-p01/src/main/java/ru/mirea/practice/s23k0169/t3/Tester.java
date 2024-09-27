package ru.mirea.practice.s23k0169.t3;

public class Tester {
    private Circle[] circles;
    private int count;

    public Tester(int size) {
        circles = new Circle[size];
        count = 0;
    }

    public void addCircle(Circle circle) {
        if (count < circles.length) {
            circles[count] = circle;
            count++;
        } else {
            System.out.println("Массив уже заполнен");
        }
    }

    public void dispCircles() {
        for (int i = 0; i < count; i++) {
            System.out.println(circles[i]);
        }
    }
}

