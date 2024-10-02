package ru.mirea.practice.s23k0087.task3;

public class Tester {
    private final Circle[] circles;
    private int size;

    public Tester(int capacity) {
        this.circles = new Circle[capacity];
        this.size = 0;
    }

    public void addCircle(Circle circle) {
        if (size < circles.length) {
            circles[size] = circle;
            size++;
        } else {
            System.out.println("Массив полон, невозможно добавить новый круг");
        }
    }

    public void printCircles() {
        for (int i = 0; i < size; i++) {
            System.out.println(circles[i].toString());
        }
    }

    public int getSize() {
        return size;
    }
}
